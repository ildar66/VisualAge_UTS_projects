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
//  QueryflagbolManager
//
//----------------------------------------------------------------

public class QueryflagbolManager extends DAManager 
{
 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public QueryflagbolManager() {}  
  public QueryflagbolManager(DatastoreJDBC aDatastore) {
	super(aDatastore);
  }  
  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

	super._executeAction(_methodName,_params); 

  }  
  ManagerCompleteSupport _getManagerSupport() { return _managerSupport; }  
  protected final DataAccessObject _newElement() {
	DataAccessObject newObject = newElement();
	((Queryflagbol)newObject).setObjectsDatastore(getObjectsDatastore());
	return newObject;
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
  public Queryflagbol element() { return (Queryflagbol)_cachedObject; }  
  protected void firePropertyChange(String property, Object oldValue, Object newValue) {
	super.firePropertyChange(property, oldValue, newValue);
  }  
  public DatastoreJDBC getCurrentDatastore() {
	if (getObjectsDatastore() != null) return getObjectsDatastore();
	else if (Queryflagbol.getDefaultDatastore() != null) return Queryflagbol.getDefaultDatastore();
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  public static String getSQLBaseQuery() { return "select distinct flag from ildar.BOL "; }  
  protected DataAccessObject newElement() { return new Queryflagbol(); }  
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
	  _map = new QueryflagbolMap();
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
	  _map = new QueryflagbolMap();
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
	((Queryflagbol)_cachedObject).setObjectsDatastore(aDatastore);
  }  
}