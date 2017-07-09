package uts.export.map;

//------------------------------------------------------------------------
// This code was generated by IBM VisualAge for Java Data Access Builder.
// WARNING: Modifications to this code will be lost on next code generation.
//------------------------------------------------------------------------



import java.lang.*;
import java.math.*;
import java.util.*;
import java.beans.*;
import java.sql.*;
import com.ibm.ivj.eab.dab.*;
import java.io.Serializable;

//----------------------------------------------------------------
//
// Querynotyfyaddressbol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYnotyfyaddressBOL.
  */

public class Querynotyfyaddressbol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQuerynotyfyaddressbolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Querynotyfyaddressbol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Querynotyfyaddressbol notifyaddress access methods
	 This attribute is mapped to NOTIFYADDRESS.
	--------------------------------------------------------------*/
   private String iNotifyaddress = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYnotyfyaddressBOL",
													  null, 
													  new String[] {"NOTIFYADDRESS"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Querynotyfyaddressbol() {
	super(null); 
  }  
  public Querynotyfyaddressbol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQuerynotyfyaddressbolDatastore != null) return iQuerynotyfyaddressbolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setNotifyaddress(String aNotifyaddress) {
	 if (_sendingAttributeEvents) {
	   String temp = iNotifyaddress; 
	   iNotifyaddress = aNotifyaddress; 
	   _changes.firePropertyChange("notifyaddress",  temp, aNotifyaddress); 
	 } else {
	   iNotifyaddress = aNotifyaddress;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Querynotyfyaddressbol obj = new Querynotyfyaddressbol(getObjectsDatastore());

	obj.iNotifyaddress = iNotifyaddress; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Querynotyfyaddressbol) ) return false;
	Querynotyfyaddressbol aQuerynotyfyaddressbol = (Querynotyfyaddressbol)anObject;

	if ( iNotifyaddress != aQuerynotyfyaddressbol.iNotifyaddress ) {
	   if ( iNotifyaddress == null || aQuerynotyfyaddressbol.iNotifyaddress == null) return false;
	   else if ( !iNotifyaddress.equals( aQuerynotyfyaddressbol.iNotifyaddress ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getNotifyaddress() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getNotifyaddress() };
	return (s);
  }  
  public DatastoreJDBC getCurrentDatastore() {
	if (getObjectsDatastore() != null) return getObjectsDatastore();
	else if (getDefaultDatastore() != null) return getDefaultDatastore();
	else return DatastoreJDBC.getApplicationDatastore();
  }  
 //----------------------------------------------------------------
 // Default Datastore
 //----------------------------------------------------------------
  public static DatastoreJDBC getDefaultDatastore() { return iQuerynotyfyaddressbolDatastore; }  
   public String getNotifyaddress() { return iNotifyaddress; }   
  public static String getQualifier() { return _qualifier; }  
  public boolean hasDataId() { return false; }  
  public boolean isModified() {
	return super.isModified();
  }  
   public boolean isNotifyaddressNullable() { return true; }   
  public boolean isReadOnly() { return false; }  
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQuerynotyfyaddressbolDatastore = aDatastore; }  
  public void setModified(boolean enable) {
	if ( !enable ) { 
	  for(int i=0; i < modified.length; i++) modified[i] = false;
	}

	super.setModified(enable);
  }  
   public void setNotifyaddress(String aNotifyaddress) { 
	 String temp = iNotifyaddress; 
	 modified[0] = true;
	 iNotifyaddress = aNotifyaddress; 
	 setModified(true);
	 _changes.firePropertyChange("notifyaddress",  temp, aNotifyaddress); 
   }   
 //----------------------------------------------------------------
 // methods for setting the tablename dynamically
 //----------------------------------------------------------------
  public static void setQualifier(String qual) {
	if (qual == null) _qualifier = "";
	else if (qual.equals("")) _qualifier = qual;
	else if (!qual.endsWith(".")) _qualifier = qual + ".";
	else _qualifier = qual;
  }  
  public String toString() { return toString("."); }  
 //----------------------------------------------------------------
 // Display methods
 //----------------------------------------------------------------
  public String toString(String aSeparator)
  {
	return (getNotifyaddress());
  }  
}