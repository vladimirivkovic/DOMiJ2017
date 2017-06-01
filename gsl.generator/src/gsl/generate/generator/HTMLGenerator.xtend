package gsl.generate.generator

import genDSL2.GenealogyTree
import genDSL2.Person
import java.util.ArrayList
import genDSL2.TypeOfPerson
import genDSL2.Gender

class HTMLGenerator {

  var persons = new ArrayList<Person>();
  var cnt = 0;

  def initialize(GenealogyTree gt) {
    for (Person p : gt.person) {
      persons.add(p);
    }    
  }

  def generate(GenealogyTree gt) {
    initialize(gt)
    '''
    getNodes = function() {
      nodeDataArray = [
        «FOR p : persons»
          «IF p.type != TypeOfPerson.MARRIED»
            «eatPerson(p,0)»
          «ENDIF»
      «ENDFOR»
      ];
      return nodeDataArray;
      }
      '''
  }
  
  def eatPerson(Person p, int parentKey) {
    var k = cnt++;
    '''
    {
      key: «k»,
      color: «IF p.gender == Gender.MALE»'lightblue'«ELSE»'salmon'«ENDIF»,
      parent: «parentKey»,
      name : '«p.givenName» «IF p.nickname != null»(«p.nickname»)«ENDIF»',
      birthYear : «IF p.birthDate != null»«p.birthDate.year»«ELSE»'n/a'«ENDIF»,
      deathYear : «IF p.deathDate != null»«p.deathDate.year»«ELSE»'n/a'«ENDIF»,
      restingPlace : «IF p.restingPlace != null»'«p.restingPlace»'«ELSE»'n/a'«ENDIF»
    },
      
      «FOR m : p.marriage»
        «FOR c : m.children»
            «eatPerson(c, k)»
        «ENDFOR»
      «ENDFOR»
    '''
  }

}
