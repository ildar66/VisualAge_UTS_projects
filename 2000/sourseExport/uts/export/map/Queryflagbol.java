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
// Queryflagbol - persistent object class
//
//---------------------------------------------------------------- 

/**
  * This class is mapped to QUERYflagBOL.
  */

public class Queryflagbol extends PersistentObject implements Cloneable, Serializable
{

  private static DatastoreJDBC iQueryflagbolDatastore;

  private static String _qualifier = "";

 //----------------------------------------------------------------
 // Queryflagbol Attributes and methods
 //----------------------------------------------------------------

  /*--------------------------------------------------------------
	 Queryflagbol flag access methods
	 This attribute is mapped to FLAG.
	--------------------------------------------------------------*/
   private String iFlag = null;

  boolean modified[] = { false };

  static DASQLGenerator generator = new DASQLGenerator("QUERYflagBOL",
													  null, 
													  new String[] {"FLAG"}, 
													  null, 
													  null );

 //----------------------------------------------------------------
 // Constructors
 //----------------------------------------------------------------
  public Queryflagbol() {
	super(null); 
  }  
  public Queryflagbol(DatastoreJDBC aDatastore) {
	super(aDatastore); 
  }  
 //----------------------------------------------------------------
 // Database access methods
 //----------------------------------------------------------------

  public void _executeAction( String _methodName, Object[] _params ) throws Exception { 

  }  
  protected POCompleteSupport _getPOCompleteSupport() { return _poSupport; }  
  protected static DatastoreJDBC _getStaticDatastore() {
	if (iQueryflagbolDatastore != null) return iQueryflagbolDatastore;
	else return DatastoreJDBC.getApplicationDatastore();
  }  
  protected void _setBusy(boolean flag) { super._setBusy(flag); }  
   void _setFlag(String aFlag) {
	 if (_sendingAttributeEvents) {
	   String temp = iFlag; 
	   iFlag = aFlag; 
	   _changes.firePropertyChange("flag",  temp, aFlag); 
	 } else {
	   iFlag = aFlag;
	 }
   }   
 //----------------------------------------------------------------
 // clone - returns a copy of the object
 //----------------------------------------------------------------
  public Object clone() {
 
	Queryflagbol obj = new Queryflagbol(getObjectsDatastore());

	obj.iFlag = iFlag; 

	return obj;
  }  
 //----------------------------------------------------------------
 // equals - compares itself with another object
 //----------------------------------------------------------------
  public boolean equals(Object anObject) {

	if ( !(anObject instanceof Queryflagbol) ) return false;
	Queryflagbol aQueryflagbol = (Queryflagbol)anObject;

	if ( iFlag != aQueryflagbol.iFlag ) {
	   if ( iFlag == null || aQueryflagbol.iFlag == null) return false;
	   else if ( !iFlag.equals( aQueryflagbol.iFlag ) ) return false;
	 } 

	return true;
  }  
  public Object[] getAttributes() {
	Object[] o = {getFlag() };
	return (o);
  }  
  public String[] getAttributeStrings() {
	String[] s = {getFlag() };
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
  public static DatastoreJDBC getDefaultDatastore() { return iQueryflagbolDatastore; }  
   public String getFlag() { return iFlag; }   
  public static String getQualifier() { return _qualifier; }  
  public boolean hasDataId() { return false; }  
   public boolean isFlagNullable() { return true; }   
  public boolean isModified() {
	return super.isModified();
  }  
  public boolean isReadOnly() { return false; }  
  void setAllModified() {
	for(int i=0; i < modified.length; i++) modified[i] = true;
  }  
  public static void setDefaultDatastore(DatastoreJDBC aDatastore) { iQueryflagbolDatastore = aDatastore; }  
   public void setFlag(String aFlag) { 
	 String temp = iFlag; 
	 modified[0] = true;
	 iFlag = aFlag; 
	 setModified(true);
	 _changes.firePropertyChange("flag",  temp, aFlag); 
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
	return (getFlag());
  }  
}