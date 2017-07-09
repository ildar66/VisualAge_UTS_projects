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
// Queryshipperbol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYshipperBOL.
  */

public class Queryshipperbol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQueryshipperbolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Queryshipperbol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Queryshipperbol shipper access methods
	 This attribute is mapped to SHIPPER.
	--------------------------------------------------------------*/
   private String iShipper = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYshipperBOL",
													  null, 
													  new String[] {"SHIPPER"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Queryshipperbol() {
	super(null); 
  }  
  public Queryshipperbol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQueryshipperbolDatastore != null) return iQueryshipperbolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setShipper(String aShipper) {
	 if (_sendingAttributeEvents) {
	   String temp = iShipper; 
	   iShipper = aShipper; 
	   _changes.firePropertyChange("shipper",  temp, aShipper); 
	 } else {
	   iShipper = aShipper;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Queryshipperbol obj = new Queryshipperbol(getObjectsDatastore());

	obj.iShipper = iShipper; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Queryshipperbol) ) return false;
	Queryshipperbol aQueryshipperbol = (Queryshipperbol)anObject;

	if ( iShipper != aQueryshipperbol.iShipper ) {
	   if ( iShipper == null || aQueryshipperbol.iShipper == null) return false;
	   else if ( !iShipper.equals( aQueryshipperbol.iShipper ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getShipper() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getShipper() };
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
  public static DatastoreJDBC getDefaultDatastore() { return iQueryshipperbolDatastore; }  
  public static String getQualifier() { return _qualifier; }  
   public String getShipper() { return iShipper; }   
  public boolean hasDataId() { return false; }  
  public boolean isModified() {
	return super.isModified();
  }  
  public boolean isReadOnly() { return false; }  
   public boolean isShipperNullable() { return true; }   
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQueryshipperbolDatastore = aDatastore; }  
  public void setModified(boolean enable) {
	if ( !enable ) { 
	  for(int i=0; i < modified.length; i++) modified[i] = false;
	}

	super.setModified(enable);
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
   public void setShipper(String aShipper) { 
	 String temp = iShipper; 
	 modified[0] = true;
	 iShipper = aShipper; 
	 setModified(true);
	 _changes.firePropertyChange("shipper",  temp, aShipper); 
   }   
  public String toString() { return toString("."); }  
 //----------------------------------------------------------------
 // Display methods
 //----------------------------------------------------------------
  public String toString(String aSeparator)
  {
	return (getShipper());
  }  
}