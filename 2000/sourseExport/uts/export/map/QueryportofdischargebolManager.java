package uts.export.map;

//---------------------------------------------------------------------------
// This code was generated by IBM VisualAge for Java Data Access Builder.
// WARNING: Modifications to this code will be lost on next code generation.
//---------------------------------------------------------------------------



import java.lang.*;
import java.math.*;
import java.util.*;
import java.sql.*;
import com.ibm.ivj.eab.dab.*;
import java.awt.*;

//----------------------------------------------------------------
//
//  QueryportofdischargebolManager
//
//----------------------------------------------------------------

public class QueryportofdischargebolManager extends DAManager 
{
 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public QueryportofdischargebolManager() {}  
  public QueryportofdischargebolManager(DatastoreJDBC aDatastore) {
	super(aDatastore);
  }  
  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

	super._executeAction(_methodName,_params); 

  }  
  ManagerCompleteSupport _getManagerSupport() { return _managerSupport; }  
  protected final DataAccessObject _newElement() {
	DataAccessObject newObject = newElement();
	((Queryportofdischargebol)newObject).setObjectsDatastore(getObjectsDatastore());
	return newObject;
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
  public Queryportofdischargebol element() { return (Queryportofdischargebol)_cachedObject; }  
  protected void firePropertyChange(String property, Object oldValue, Object newValue) {
	super.firePropertyChange(property, oldValue, newValue);
  }  
  public DatastoreJDBC getCurrentDatastore() {
	if (getObjectsDatastore() != null) return getObjectsDatastore();
	else if (Queryportofdischargebol.getDefaultDatastore() != null) return Queryportofdischargebol.getDefaultDatastore();
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  public static String getSQLBaseQuery() { return "select distinct portofdischarge from ildar.bol "; }  
  protected DataAccessObject newElement() { return new Queryportofdischargebol(); }  
  public void open(String sqlSuffix) throws DAException
  { 

	if ( !_onBackground() && isAsynchronous() ) {
	  Object[] params = { sqlSuffix };
	  _putOnBackgroundThread( "open(String)", params );
	  return;
	}

	try {
	  if (getCurrentDatastore() == null) throw new DAException(DAResource.NO_CONNECT_EXIST);
	  if (isOpen()) close();
	  if (sqlSuffix == null) sqlSuffix = "";

	  _stmt = getCurrentDatastore().getConnection().prepareStatement(getSQLBaseQuery() + sqlSuffix); 

	  _setStmtOptions();
	  _rs = _stmt.executeQuery(); 
	  _map = new QueryportofdischargebolMap();
	  _setOpen(true);

	} catch(SQLException exc) {
	  throw new DAException(DAResource.OPEN_FAILED, exc);
	} finally {
	  _setBusy(false);
	}

	_managerSupport.fireOpenComplete("open(String)");
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void select(String sqlSuffix) throws DAException
  { 

	if ( !_onBackground() && isAsynchronous() ) {
	  Object[] params = { sqlSuffix };
	  _putOnBackgroundThread( "select(String)", params );
	  return;
	}

	try {
	  if (getCurrentDatastore() == null) throw new DAException(DAResource.NO_CONNECT_EXIST);
	  if (isOpen()) close();
	  if (sqlSuffix == null) sqlSuffix = "";

	  _stmt = getCurrentDatastore().getConnection().prepareStatement(getSQLBaseQuery() + sqlSuffix); 

	  _setStmtOptions();
	  _rs = _stmt.executeQuery(); 
	  _map = new QueryportofdischargebolMap();
	  _fillInternalSequence();
	} catch(SQLException exc) {
	  throw new DAException (DAResource.SELECT_FAILED, exc);
	} finally {
	  _dbclose();
	  _setBusy(false);
	}

	_managerSupport.fireSelectComplete("select(String)");
  }  
  public void setObjectsDatastore(DatastoreJDBC aDatastore) {
	super.setObjectsDatastore(aDatastore);
	((Queryportofdischargebol)_cachedObject).setObjectsDatastore(aDatastore);
  }  
}