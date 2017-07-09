package uts.export.map;

//---------------------------------------------------------------------------
// This code was generated by IBM VisualAge for Java Data Access Builder.
// WARNING: Modifications to this code will be lost on next code generation.
//---------------------------------------------------------------------------


import com.ibm.ivj.eab.dab.*;
import java.io.*;
import java.awt.*;

//----------------------------------------------------------------
//
// BolDatastore - connect/disconnect from database
//
//----------------------------------------------------------------

public class BolDatastore extends DatastoreJDBC implements Serializable
{

  public BolDatastore() {
	setDriver("COM.ibm.db2.jdbc.app.DB2Driver");
	setURL("jdbc:db2:PLANT");
	if (Bol.getDefaultDatastore() == null)  Bol.setDefaultDatastore(this);
  }  
  public BolDatastore(String driver) {
	setDriver(driver);
	setURL("jdbc:db2:PLANT");
	if (Bol.getDefaultDatastore() == null)  Bol.setDefaultDatastore(this);
  }  
  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
	s.defaultReadObject();
	if (Bol.getDefaultDatastore() == null) setAsDefaultDatastore();
  }  
  public void setAsDefaultDatastore() {
	Bol.setDefaultDatastore(this);
  }  
  //
  // These methods are used for serialization:
  //
  private void writeObject(ObjectOutputStream s) throws IOException {
	s.defaultWriteObject();
  }  
}