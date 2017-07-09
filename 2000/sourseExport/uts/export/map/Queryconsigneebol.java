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
// Queryconsigneebol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYconsigneeBOL.
  */

public class Queryconsigneebol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQueryconsigneebolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Queryconsigneebol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Queryconsigneebol consignee access methods
	 This attribute is mapped to CONSIGNEE.
	--------------------------------------------------------------*/
   private String iConsignee = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYconsigneeBOL",
													  null, 
													  new String[] {"CONSIGNEE"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Queryconsigneebol() {
	super(null); 
  }  
  public Queryconsigneebol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQueryconsigneebolDatastore != null) return iQueryconsigneebolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setConsignee(String aConsignee) {
	 if (_sendingAttributeEvents) {
	   String temp = iConsignee; 
	   iConsignee = aConsignee; 
	   _changes.firePropertyChange("consignee",  temp, aConsignee); 
	 } else {
	   iConsignee = aConsignee;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Queryconsigneebol obj = new Queryconsigneebol(getObjectsDatastore());

	obj.iConsignee = iConsignee; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Queryconsigneebol) ) return false;
	Queryconsigneebol aQueryconsigneebol = (Queryconsigneebol)anObject;

	if ( iConsignee != aQueryconsigneebol.iConsignee ) {
	   if ( iConsignee == null || aQueryconsigneebol.iConsignee == null) return false;
	   else if ( !iConsignee.equals( aQueryconsigneebol.iConsignee ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getConsignee() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getConsignee() };
	return (s);
  }  
   public String getConsignee() { return iConsignee; }   
  public DatastoreJDBC getCurrentDatastore() {
	if (getObjectsDatastore() != null) return getObjectsDatastore();
	else if (getDefaultDatastore() != null) return getDefaultDatastore();
	else return DatastoreJDBC.getApplicationDatastore();
  }  
 //----------------------------------------------------------------
 // Default Datastore
 //----------------------------------------------------------------
  public static DatastoreJDBC getDefaultDatastore() { return iQueryconsigneebolDatastore; }  
  public static String getQualifier() { return _qualifier; }  
  public boolean hasDataId() { return false; }  
   public boolean isConsigneeNullable() { return true; }   
  public boolean isModified() {
	return super.isModified();
  }  
  public boolean isReadOnly() { return false; }  
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
   public void setConsignee(String aConsignee) { 
	 String temp = iConsignee; 
	 modified[0] = true;
	 iConsignee = aConsignee; 
	 setModified(true);
	 _changes.firePropertyChange("consignee",  temp, aConsignee); 
   }   
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQueryconsigneebolDatastore = aDatastore; }  
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
  public String toString() { return toString("."); }  
 //----------------------------------------------------------------
 // Display methods
 //----------------------------------------------------------------
  public String toString(String aSeparator)
  {
	return (getConsignee());
  }  
}