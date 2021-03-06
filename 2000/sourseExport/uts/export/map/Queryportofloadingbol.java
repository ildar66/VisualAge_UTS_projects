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
// Queryportofloadingbol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYportofloadingBOL.
  */

public class Queryportofloadingbol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQueryportofloadingbolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Queryportofloadingbol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Queryportofloadingbol portofloading access methods
	 This attribute is mapped to PORTOFLOADING.
	--------------------------------------------------------------*/
   private String iPortofloading = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYportofloadingBOL",
													  null, 
													  new String[] {"PORTOFLOADING"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Queryportofloadingbol() {
	super(null); 
  }  
  public Queryportofloadingbol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQueryportofloadingbolDatastore != null) return iQueryportofloadingbolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setPortofloading(String aPortofloading) {
	 if (_sendingAttributeEvents) {
	   String temp = iPortofloading; 
	   iPortofloading = aPortofloading; 
	   _changes.firePropertyChange("portofloading",  temp, aPortofloading); 
	 } else {
	   iPortofloading = aPortofloading;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Queryportofloadingbol obj = new Queryportofloadingbol(getObjectsDatastore());

	obj.iPortofloading = iPortofloading; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Queryportofloadingbol) ) return false;
	Queryportofloadingbol aQueryportofloadingbol = (Queryportofloadingbol)anObject;

	if ( iPortofloading != aQueryportofloadingbol.iPortofloading ) {
	   if ( iPortofloading == null || aQueryportofloadingbol.iPortofloading == null) return false;
	   else if ( !iPortofloading.equals( aQueryportofloadingbol.iPortofloading ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getPortofloading() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getPortofloading() };
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
  public static DatastoreJDBC getDefaultDatastore() { return iQueryportofloadingbolDatastore; }  
   public String getPortofloading() { return iPortofloading; }   
  public static String getQualifier() { return _qualifier; }  
  public boolean hasDataId() { return false; }  
  public boolean isModified() {
	return super.isModified();
  }  
   public boolean isPortofloadingNullable() { return true; }   
  public boolean isReadOnly() { return false; }  
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQueryportofloadingbolDatastore = aDatastore; }  
  public void setModified(boolean enable) {
	if ( !enable ) { 
	  for(int i=0; i < modified.length; i++) modified[i] = false;
	}

	super.setModified(enable);
  }  
   public void setPortofloading(String aPortofloading) { 
	 String temp = iPortofloading; 
	 modified[0] = true;
	 iPortofloading = aPortofloading; 
	 setModified(true);
	 _changes.firePropertyChange("portofloading",  temp, aPortofloading); 
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
	return (getPortofloading());
  }  
}