package gsl.generate.generator;

import com.google.common.base.Objects;
import genDSL2.DateX;
import genDSL2.Gender;
import genDSL2.GenealogyTree;
import genDSL2.Marriage;
import genDSL2.Person;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GedcomGenerator {
  private ArrayList<Person> persons = new ArrayList<Person>();
  
  private ArrayList<String> mths = new ArrayList<String>();
  
  public boolean initialize(final GenealogyTree gt) {
    boolean _xblockexpression = false;
    {
      EList<Person> _person = gt.getPerson();
      for (final Person p : _person) {
        this.persons.add(p);
      }
      this.mths.add(null);
      this.mths.add("JAN");
      this.mths.add("FEB");
      this.mths.add("MAR");
      this.mths.add("APR");
      this.mths.add("MAY");
      this.mths.add("JUN");
      this.mths.add("JUL");
      this.mths.add("AUG");
      this.mths.add("SEP");
      this.mths.add("OCT");
      this.mths.add("NOV");
      _xblockexpression = this.mths.add("DEC");
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final GenealogyTree gt) {
    CharSequence _xblockexpression = null;
    {
      this.initialize(gt);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("0 HEAD");
      _builder.newLine();
      _builder.append("1 CHAR ASCII");
      _builder.newLine();
      {
        for(final Person p : this.persons) {
          CharSequence _genPerson = this.genPerson(p, null, 0);
          _builder.append(_genPerson, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        for(final Person p_1 : this.persons) {
          CharSequence _genMarriages = this.genMarriages(p_1);
          _builder.append(_genMarriages, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("0 TRLR");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genPerson(final Person p, final Person father, final int mar) {
    CharSequence _xblockexpression = null;
    {
      int i = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("0 @");
      String _genQN = this.genQN(p);
      _builder.append(_genQN, "");
      _builder.append("@ INDI");
      _builder.newLineIfNotEmpty();
      _builder.append("1 NAME /");
      String _givenName = p.getGivenName();
      _builder.append(_givenName, "");
      _builder.append("/");
      _builder.newLineIfNotEmpty();
      _builder.append("1 SEX ");
      String _xifexpression = null;
      Gender _gender = p.getGender();
      boolean _equals = Objects.equal(_gender, Gender.MALE);
      if (_equals) {
        _xifexpression = "M";
      } else {
        _xifexpression = "F";
      }
      _builder.append(_xifexpression, "");
      _builder.newLineIfNotEmpty();
      {
        String _nickname = p.getNickname();
        boolean _notEquals = (!Objects.equal(_nickname, null));
        if (_notEquals) {
          _builder.append("1 NICK /");
          String _nickname_1 = p.getNickname();
          _builder.append(_nickname_1, "");
          _builder.append("/");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("1 BIRT");
      _builder.newLine();
      {
        String _birthPlace = p.getBirthPlace();
        boolean _notEquals_1 = (!Objects.equal(_birthPlace, null));
        if (_notEquals_1) {
          _builder.append("2 PLACE ");
          String _birthPlace_1 = p.getBirthPlace();
          _builder.append(_birthPlace_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        DateX _birthDate = p.getBirthDate();
        boolean _notEquals_2 = (!Objects.equal(_birthDate, null));
        if (_notEquals_2) {
          _builder.append("2 DATE ");
          DateX _birthDate_1 = p.getBirthDate();
          String _genDate = this.genDate(_birthDate_1);
          _builder.append(_genDate, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("1 DEAT");
      _builder.newLine();
      {
        String _deathPlace = p.getDeathPlace();
        boolean _notEquals_3 = (!Objects.equal(_deathPlace, null));
        if (_notEquals_3) {
          _builder.append("2 PLACE ");
          String _deathPlace_1 = p.getDeathPlace();
          _builder.append(_deathPlace_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        DateX _deathDate = p.getDeathDate();
        boolean _notEquals_4 = (!Objects.equal(_deathDate, null));
        if (_notEquals_4) {
          _builder.append("2 DATE ");
          DateX _deathDate_1 = p.getDeathDate();
          String _genDate_1 = this.genDate(_deathDate_1);
          _builder.append(_genDate_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("1 BURI");
      _builder.newLine();
      {
        String _restingPlace = p.getRestingPlace();
        boolean _notEquals_5 = (!Objects.equal(_restingPlace, null));
        if (_notEquals_5) {
          _builder.append("2 PLACE ");
          String _restingPlace_1 = p.getRestingPlace();
          _builder.append(_restingPlace_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _notEquals_6 = (!Objects.equal(father, null));
        if (_notEquals_6) {
          _builder.append("1 FAMC @");
          String _genQN_1 = this.genQN(father);
          String _plus = (_genQN_1 + Integer.valueOf(mar));
          _builder.append(_plus, "");
          _builder.append("@");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Marriage> _marriage = p.getMarriage();
        for(final Marriage m : _marriage) {
          _builder.append("1 FAMS @");
          String _genQN_2 = this.genQN(p);
          int _plusPlus = i++;
          String _plus_1 = (_genQN_2 + Integer.valueOf(_plusPlus));
          _builder.append(_plus_1, "");
          _builder.append("@");
          _builder.newLineIfNotEmpty();
        }
      }
      CharSequence _eatMarriages = this.eatMarriages(p);
      _builder.append(_eatMarriages, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence eatMarriages(final Person p) {
    CharSequence _xblockexpression = null;
    {
      int i = 0;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Marriage> _marriage = p.getMarriage();
        for(final Marriage m : _marriage) {
          {
            EList<Person> _children = m.getChildren();
            for(final Person c : _children) {
              EList<Marriage> _marriage_1 = p.getMarriage();
              int _indexOf = _marriage_1.indexOf(m);
              Object _genPerson = this.genPerson(c, p, _indexOf);
              _builder.append(_genPerson, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genMarriages(final Person p) {
    CharSequence _xblockexpression = null;
    {
      int i = 0;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Marriage> _marriage = p.getMarriage();
        for(final Marriage m : _marriage) {
          {
            EList<Person> _spouses = m.getSpouses();
            int _size = _spouses.size();
            boolean _equals = (_size == 2);
            if (_equals) {
              _builder.append("0 @");
              String _genQN = this.genQN(p);
              int _plusPlus = i++;
              String _plus = (_genQN + Integer.valueOf(_plusPlus));
              _builder.append(_plus, "");
              _builder.append("@ FAM");
              _builder.newLineIfNotEmpty();
              _builder.append("1 HUSB @");
              EList<Person> _spouses_1 = m.getSpouses();
              Person _get = _spouses_1.get(0);
              String _genQN_1 = this.genQN(_get);
              _builder.append(_genQN_1, "");
              _builder.append("@");
              _builder.newLineIfNotEmpty();
              _builder.append("1 WIFE @");
              EList<Person> _spouses_2 = m.getSpouses();
              Person _get_1 = _spouses_2.get(1);
              String _genQN_2 = this.genQN(_get_1);
              _builder.append(_genQN_2, "");
              _builder.append("@");
              _builder.newLineIfNotEmpty();
              {
                EList<Person> _children = m.getChildren();
                for(final Person c : _children) {
                  _builder.append("1 CHIL @");
                  String _genQN_3 = this.genQN(c);
                  _builder.append(_genQN_3, "");
                  _builder.append("@");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("1 MARR");
              _builder.newLine();
              _builder.append("2 HUSB");
              _builder.newLine();
              _builder.append("2 WIFE");
              _builder.newLine();
              {
                DateX _fromDate = m.getFromDate();
                boolean _notEquals = (!Objects.equal(_fromDate, null));
                if (_notEquals) {
                  _builder.append("2 DATE ");
                  DateX _fromDate_1 = m.getFromDate();
                  String _genDate = this.genDate(_fromDate_1);
                  _builder.append(_genDate, "");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                DateX _toDate = m.getToDate();
                boolean _notEquals_1 = (!Objects.equal(_toDate, null));
                if (_notEquals_1) {
                  _builder.append("1 DIV");
                  _builder.newLine();
                  _builder.append("2 HUSB");
                  _builder.newLine();
                  _builder.append("2 WIFE");
                  _builder.newLine();
                  _builder.append("2 DATE ");
                  DateX _toDate_1 = m.getToDate();
                  String _genDate_1 = this.genDate(_toDate_1);
                  _builder.append(_genDate_1, "");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                EList<Person> _children_1 = m.getChildren();
                for(final Person c_1 : _children_1) {
                  Object _genMarriages = this.genMarriages(c_1);
                  _builder.append(_genMarriages, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String genQN(final Person p) {
    String _xblockexpression = null;
    {
      String postfix = "";
      String _nickname = p.getNickname();
      boolean _notEquals = (!Objects.equal(_nickname, null));
      if (_notEquals) {
        String _postfix = postfix;
        String _nickname_1 = p.getNickname();
        postfix = (_postfix + _nickname_1);
      }
      DateX _birthDate = p.getBirthDate();
      boolean _notEquals_1 = (!Objects.equal(_birthDate, null));
      if (_notEquals_1) {
        String _postfix_1 = postfix;
        DateX _birthDate_1 = p.getBirthDate();
        int _year = _birthDate_1.getYear();
        String _plus = (Integer.valueOf(_year) + "");
        postfix = (_postfix_1 + _plus);
      }
      String _givenName = p.getGivenName();
      _xblockexpression = (_givenName + postfix);
    }
    return _xblockexpression;
  }
  
  public String genDate(final DateX d) {
    String _xblockexpression = null;
    {
      String retVal = "";
      int _day = d.getDay();
      boolean _greaterThan = (_day > 0);
      if (_greaterThan) {
        String _retVal = retVal;
        int _day_1 = d.getDay();
        String _plus = (" " + Integer.valueOf(_day_1));
        retVal = (_retVal + _plus);
      }
      int _month = d.getMonth();
      boolean _greaterThan_1 = (_month > 0);
      if (_greaterThan_1) {
        String _retVal_1 = retVal;
        int _month_1 = d.getMonth();
        String _get = this.mths.get(_month_1);
        String _plus_1 = (" " + _get);
        retVal = (_retVal_1 + _plus_1);
      }
      String _retVal_2 = retVal;
      int _year = d.getYear();
      String _plus_2 = (" " + Integer.valueOf(_year));
      _xblockexpression = retVal = (_retVal_2 + _plus_2);
    }
    return _xblockexpression;
  }
}
