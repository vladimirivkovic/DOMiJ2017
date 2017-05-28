package gsl.generate.generator

import genDSL2.GenealogyTree
import genDSL2.Person
import java.util.ArrayList

class HTMLGenerator {

  var persons = new ArrayList<Person>();

  def initialize(GenealogyTree gt) {
    for (Person p : gt.person) {
      persons.add(p);
    }    
  }

  def generate(GenealogyTree gt) {
    initialize(gt)
    '''
        <html>
        <body>
        <h3>«gt.familyName»</h3>
        «FOR p : persons»
          <p>
          «p.givenName»
          </p>
      «ENDFOR»
      </body>
      </html>	
      '''
  }

}
