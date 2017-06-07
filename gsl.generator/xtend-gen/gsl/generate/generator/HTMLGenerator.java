package gsl.generate.generator;

import com.google.common.base.Objects;
import genDSL2.Cohabitation;
import genDSL2.DateX;
import genDSL2.Gender;
import genDSL2.GenealogyTree;
import genDSL2.Marriage;
import genDSL2.Person;
import genDSL2.TypeOfPerson;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HTMLGenerator {
  private ArrayList<Person> persons = new ArrayList<Person>();
  
  private int cnt = 0;
  
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
      _builder.append("getNodes = function() {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("nodeDataArray = [");
      _builder.newLine();
      {
        for(final Person p : this.persons) {
          {
            TypeOfPerson _type = p.getType();
            boolean _notEquals = (!Objects.equal(_type, TypeOfPerson.MARRIED));
            if (_notEquals) {
              _builder.append("    ");
              CharSequence _eatPerson = this.eatPerson(p, 0);
              _builder.append(_eatPerson, "    ");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("  ");
      _builder.append("];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("return nodeDataArray;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence eatPerson(final Person p, final int parentKey) {
    CharSequence _xblockexpression = null;
    {
      int k = this.cnt++;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("key: ");
      _builder.append(k, "  ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("color: ");
      {
        Gender _gender = p.getGender();
        boolean _equals = Objects.equal(_gender, Gender.MALE);
        if (_equals) {
          _builder.append("\'lightblue\'");
        } else {
          _builder.append("\'salmon\'");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("parent: ");
      _builder.append(parentKey, "  ");
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("name : \'");
      String _givenName = p.getGivenName();
      _builder.append(_givenName, "  ");
      _builder.append(" ");
      {
        String _nickname = p.getNickname();
        boolean _notEquals = (!Objects.equal(_nickname, null));
        if (_notEquals) {
          _builder.append("(");
          String _nickname_1 = p.getNickname();
          _builder.append(_nickname_1, "  ");
          _builder.append(")");
        }
      }
      _builder.append("\',");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("birthYear : ");
      {
        DateX _birthDate = p.getBirthDate();
        boolean _notEquals_1 = (!Objects.equal(_birthDate, null));
        if (_notEquals_1) {
          DateX _birthDate_1 = p.getBirthDate();
          int _year = _birthDate_1.getYear();
          _builder.append(_year, "  ");
        } else {
          _builder.append("\'n/a\'");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("deathYear : ");
      {
        DateX _deathDate = p.getDeathDate();
        boolean _notEquals_2 = (!Objects.equal(_deathDate, null));
        if (_notEquals_2) {
          DateX _deathDate_1 = p.getDeathDate();
          int _year_1 = _deathDate_1.getYear();
          _builder.append(_year_1, "  ");
        } else {
          _builder.append("\'n/a\'");
        }
      }
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("restingPlace : ");
      {
        String _restingPlace = p.getRestingPlace();
        boolean _notEquals_3 = (!Objects.equal(_restingPlace, null));
        if (_notEquals_3) {
          _builder.append("\'");
          String _restingPlace_1 = p.getRestingPlace();
          _builder.append(_restingPlace_1, "  ");
          _builder.append("\'");
        } else {
          _builder.append("\'n/a\'");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("},");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      {
        EList<Marriage> _marriage = p.getMarriage();
        for(final Marriage m : _marriage) {
          {
            EList<Person> _children = m.getChildren();
            for(final Person c : _children) {
              _builder.append("  ");
              Object _eatPerson = this.eatPerson(c, k);
              _builder.append(_eatPerson, "  ");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        EList<Cohabitation> _cohabitation = p.getCohabitation();
        for(final Cohabitation h : _cohabitation) {
          {
            EList<Person> _children_1 = h.getChildren();
            for(final Person c_1 : _children_1) {
              _builder.append("  ");
              Object _eatPerson_1 = this.eatPerson(c_1, k);
              _builder.append(_eatPerson_1, "  ");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
