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

//-----------------------------------------------------------------------------------
// The following class(es) are used to _map a result set into a Queryshipperbol
//-----------------------------------------------------------------------------------
class QueryshipperbolMap implements DAMap
{
  public void putResultSetInto(DataAccessObject obj, ResultSet rs, boolean saveStream) throws DAException, SQLException {
	Queryshipperbol theObj = (Queryshipperbol)obj;

	theObj._setShipper(rs.getString(1));
	if (rs.wasNull()) theObj._setShipper(null);

  }  
}