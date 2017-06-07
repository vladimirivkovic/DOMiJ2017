package gsl.generate.generator

import genDSL2.DateX
import genDSL2.Gender
import genDSL2.GenealogyTree
import genDSL2.Person
import java.util.ArrayList
import java.text.SimpleDateFormat

class GedcomGenerator {

  var persons = new ArrayList<Person>()
  var mths = new ArrayList<String>()
  var df = new SimpleDateFormat("dd MMM yyyy")

  def initialize(GenealogyTree gt) {
    for (Person p : gt.person) {
      persons.add(p);
    } 
    mths.add(null);  
    mths.add("JAN");mths.add("FEB");mths.add("MAR");mths.add("APR");
    mths.add("MAY");mths.add("JUN");mths.add("JUL");mths.add("AUG");
    mths.add("SEP");mths.add("OCT");mths.add("NOV");mths.add("DEC"); 
  }

  def generate(GenealogyTree gt) {
    initialize(gt)
    '''
      0 HEAD
      1 CHAR ASCII
      «FOR p : persons»
        «genPerson(p, null)»
      «ENDFOR»
      «FOR p : persons»
        «genMarriages(p)»
        «genCohabitations(p)»
      «ENDFOR»
      0 TRLR
      '''
  }
  
  def genPerson(Person p, String famId) {
    var i = 0
    var j = 0
    '''
    0 @«genQN(p)»@ INDI
    1 NAME /«p.givenName»/
    1 SEX «if(p.gender == Gender.MALE) "M" else "F"»
    «IF p.nickname != null»
    1 NICK /«p.nickname»/
    «ENDIF»
    1 BIRT
    «IF p.birthPlace != null»
    2 PLACE «p.birthPlace»
    «ENDIF»
    «IF p.birthDate != null»
    2 DATE «genDate(p.birthDate)»
    «ENDIF»
    1 DEAT
    «IF p.deathPlace != null»
    2 PLACE «p.deathPlace»
    «ENDIF»
    «IF p.deathDate != null»
    2 DATE «genDate(p.deathDate)»
    «ENDIF»
    1 BURI
    «IF p.restingPlace != null»
    2 PLACE «p.restingPlace»
    «ENDIF»
    «IF famId != null»
    1 FAMC @«famId»@
    «ENDIF»
    «FOR h : p.personhistory»
    1 EVEN
    «IF p.givenName != null»
    2 NOTE name changed to «h.givenName»
    «ELSEIF h.gender != null»
    2 NOTE gender changed to «h.gender»
    «ENDIF»
    2 DATE «df.format(h.changed)»
    «ENDFOR»
    «FOR m : p.marriage»
    1 FAMS @«genQN(p) + i++»@
    «ENDFOR»
    «FOR m : p.cohabitation»
    1 FAMS @«genQN(p) + "Coh" + j++»@
    «ENDFOR»
    «eatMarriages(p)»
    «eatCohabitations(p)»
    '''
  }
  
  def eatMarriages(Person p) {
    var i = 0
    '''
      «FOR m : p.marriage»
        «FOR c : m.children»
      «genPerson(c, genQN(p) + p.marriage.indexOf(m))»
        «ENDFOR»
      «ENDFOR»
    '''
  }
  
  def eatCohabitations(Person p) {
    var i = 0
    '''
      «FOR m : p.cohabitation»
        «FOR c : m.children»
      «genPerson(c, genQN(p) + "Coh" + p.cohabitation.indexOf(m))»
        «ENDFOR»
      «ENDFOR»
    '''
  }
  
  def genMarriages(Person p) {
    var i = 0
    '''
      «FOR m : p.marriage»
«««      0 @«genQN(m.spouses.get(1))»@ INDI
«««      1 FAMS @«genQN(p) + i++»@
      0 @«genQN(p) + i++»@ FAM
      «FOR s : m.spouses»
      «IF s ==  Gender.FEMALE»
      1 WIFE @«genQN(s)»@
      «ELSE»
      1 HUSB @«genQN(s)»@
      «ENDIF»
      «ENDFOR»
      «FOR c : m.children»
      1 CHIL @«genQN(c)»@
      «ENDFOR»
      1 MARR
      2 HUSB
      2 WIFE
      «IF m.fromDate != null»
      2 DATE «genDate(m.fromDate)»
      «ENDIF»
      «IF m.toDate != null»
      1 DIV
      2 HUSB
      2 WIFE
      2 DATE «genDate(m.toDate)»
      «ENDIF»
      «FOR c : m.children»
      «genMarriages(c)»
      «genCohabitations(c)»
      «ENDFOR»
      «ENDFOR»
    '''
  }
  
  def genCohabitations(Person p) {
    var i = 0
    '''
      «FOR m : p.cohabitation»
      0 @«genQN(p) + "Coh" + i++»@ FAM
      «FOR s : m.partners»
      «IF s ==  Gender.FEMALE»
      1 WIFE @«genQN(s)»@
      «ELSE»
      1 HUSB @«genQN(s)»@
      «ENDIF»
      «ENDFOR»
      «FOR c : m.children»
      1 CHIL @«genQN(c)»@
      «ENDFOR»
      «FOR c : m.children»
      «genMarriages(c)»
      «genCohabitations(c)»
      «ENDFOR»
      «ENDFOR»
    '''
  }
  
  def genQN(Person p) {
    var postfix = "";
    if (p.nickname != null) {
      postfix += p.nickname;
    }
    if (p.birthDate != null)
      postfix += p.birthDate.year + "";

    p.getGivenName() + postfix;
  }
  
  def genDate(DateX d) {
    var retVal = "";
    
    if (d.day > 0) retVal += " " + d.day;
    if (d.month > 0) retVal += " " + mths.get(d.month);
    retVal += " " + d.year
  }

}
