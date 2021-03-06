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
//  QueryshipperbolManager
//
//----------------------------------------------------------------

public class QueryshipperbolManager extends DAManager 
{
 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public QueryshipperbolManager() {}  
  public QueryshipperbolManager(DatastoreJDBC aDatastore) {
	super(aDatastore);
  }  
  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

	super._executeAction(_methodName,_params); 

  }  
  ManagerCompleteSupport _getManagerSupport() { return _managerSupport; }  
  protected final DataAccessObject _newElement() {
	DataAccessObject newObject = newElement();
	((Queryshipperbol)newObject).setObjectsDatastore(getObjectsDatastore());
	return newObject;
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
  public Queryshipperbol element() { return (Queryshipperbol)_cachedObject; }  
  protected void firePropertyChange(String property, Object oldValue, Object newValue) {
	super.firePropertyChange(property, oldValue, newValue);
  }  
  public DatastoreJDBC getCurrentDatastore() {
	if (getObjectsDatastore() != null) return getObjectsDatastore();
	else if (Queryshipperbol.getDefaultDatastore() != null) return Queryshipperbol.getDefaultDatastore();
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  public static String getSQLBaseQuery() { return "select distinct shipper from ildar.bol "; }  
  protected DataAccessObject newElement() { return new Queryshipperbol(); }  
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
	  _map = new QueryshipperbolMap();
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
	  _map = new QueryshipperbolMap();
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
	((Queryshipperbol)_cachedObject).setObjectsDatastore(aDatastore);
  }  
}