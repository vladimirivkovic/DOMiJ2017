package gsl.generate.generator;

import genDSL2.GenealogyTree;
import genDSL2.Person;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HTMLGenerator {
  private ArrayList<Person> persons = new ArrayList<Person>();
  
  public void initialize(final GenealogyTree gt) {
    EList<Person> _person = gt.getPerson();
    for (final Person p : _person) {
      this.persons.add(p);
    }
  }
  
  public CharSequence generate(final GenealogyTree gt) {
    CharSequence _xblockexpression = null;
    {
      this.initialize(gt);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("  ");
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<h3>");
      String _familyName = gt.getFamilyName();
      _builder.append(_familyName, "  ");
      _builder.append("</h3>");
      _builder.newLineIfNotEmpty();
      {
        for(final Person p : this.persons) {
          _builder.append("  ");
          _builder.append("<p>");
          _builder.newLine();
          _builder.append("  ");
          String _givenName = p.getGivenName();
          _builder.append(_givenName, "  ");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("</p>");
          _builder.newLine();
        }
      }
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>\t");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
