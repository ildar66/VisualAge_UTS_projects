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
// Querydistinationbol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYdistinationBOL.
  */

public class Querydistinationbol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQuerydistinationbolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Querydistinationbol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Querydistinationbol distination access methods
	 This attribute is mapped to DISTINATION.
	--------------------------------------------------------------*/
   private String iDistination = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYdistinationBOL",
													  null, 
													  new String[] {"DISTINATION"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Querydistinationbol() {
	super(null); 
  }  
  public Querydistinationbol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQuerydistinationbolDatastore != null) return iQuerydistinationbolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setDistination(String aDistination) {
	 if (_sendingAttributeEvents) {
	   String temp = iDistination; 
	   iDistination = aDistination; 
	   _changes.firePropertyChange("distination",  temp, aDistination); 
	 } else {
	   iDistination = aDistination;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Querydistinationbol obj = new Querydistinationbol(getObjectsDatastore());

	obj.iDistination = iDistination; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Querydistinationbol) ) return false;
	Querydistinationbol aQuerydistinationbol = (Querydistinationbol)anObject;

	if ( iDistination != aQuerydistinationbol.iDistination ) {
	   if ( iDistination == null || aQuerydistinationbol.iDistination == null) return false;
	   else if ( !iDistination.equals( aQuerydistinationbol.iDistination ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getDistination() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getDistination() };
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
  public static DatastoreJDBC getDefaultDatastore() { return iQuerydistinationbolDatastore; }  
   public String getDistination() { return iDistination; }   
  public static String getQualifier() { return _qualifier; }  
  public boolean hasDataId() { return false; }  
   public boolean isDistinationNullable() { return true; }   
  public boolean isModified() {
	return super.isModified();
  }  
  public boolean isReadOnly() { return false; }  
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQuerydistinationbolDatastore = aDatastore; }  
   public void setDistination(String aDistination) { 
	 String temp = iDistination; 
	 modified[0] = true;
	 iDistination = aDistination; 
	 setModified(true);
	 _changes.firePropertyChange("distination",  temp, aDistination); 
   }   
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
	return (getDistination());
  }  
}