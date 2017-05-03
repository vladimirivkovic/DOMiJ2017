/**
 */
package genDSL2.impl;

import genDSL2.DateX;
import genDSL2.GenDSL2Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date X</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genDSL2.impl.DateXImpl#getYear <em>Year</em>}</li>
 *   <li>{@link genDSL2.impl.DateXImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link genDSL2.impl.DateXImpl#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateXImpl extends MinimalEObjectImpl.Container implements DateX {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenDSL2Package.Literals.DATE_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.DATE_X__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth) {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.DATE_X__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay) {
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.DATE_X__DAY, oldDay, day));
	}

	/**
	 * The cached invocation delegate for the '{@link #before(genDSL2.DateX) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #before(genDSL2.DateX)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate BEFORE_DATE_X__EINVOCATION_DELEGATE = ((EOperation.Internal)GenDSL2Package.Literals.DATE_X___BEFORE__DATEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean before(DateX d) {
		try {
			return (Boolean)BEFORE_DATE_X__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{d}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #after(genDSL2.DateX) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #after(genDSL2.DateX)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AFTER_DATE_X__EINVOCATION_DELEGATE = ((EOperation.Internal)GenDSL2Package.Literals.DATE_X___AFTER__DATEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean after(DateX d) {
		try {
			return (Boolean)AFTER_DATE_X__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{d}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNull()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NULL__EINVOCATION_DELEGATE = ((EOperation.Internal)GenDSL2Package.Literals.DATE_X___IS_NULL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNull() {
		try {
			return (Boolean)IS_NULL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNotNull() <em>Is Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NOT_NULL__EINVOCATION_DELEGATE = ((EOperation.Internal)GenDSL2Package.Literals.DATE_X___IS_NOT_NULL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotNull() {
		try {
			return (Boolean)IS_NOT_NULL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenDSL2Package.DATE_X__YEAR:
				return getYear();
			case GenDSL2Package.DATE_X__MONTH:
				return getMonth();
			case GenDSL2Package.DATE_X__DAY:
				return getDay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenDSL2Package.DATE_X__YEAR:
				setYear((Integer)newValue);
				return;
			case GenDSL2Package.DATE_X__MONTH:
				setMonth((Integer)newValue);
				return;
			case GenDSL2Package.DATE_X__DAY:
				setDay((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenDSL2Package.DATE_X__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case GenDSL2Package.DATE_X__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case GenDSL2Package.DATE_X__DAY:
				setDay(DAY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenDSL2Package.DATE_X__YEAR:
				return year != YEAR_EDEFAULT;
			case GenDSL2Package.DATE_X__MONTH:
				return month != MONTH_EDEFAULT;
			case GenDSL2Package.DATE_X__DAY:
				return day != DAY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GenDSL2Package.DATE_X___BEFORE__DATEX:
				return before((DateX)arguments.get(0));
			case GenDSL2Package.DATE_X___AFTER__DATEX:
				return after((DateX)arguments.get(0));
			case GenDSL2Package.DATE_X___IS_NULL:
				return isNull();
			case GenDSL2Package.DATE_X___IS_NOT_NULL:
				return isNotNull();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(", month: ");
		result.append(month);
		result.append(", day: ");
		result.append(day);
		result.append(')');
		return result.toString();
	}

} //DateXImpl
