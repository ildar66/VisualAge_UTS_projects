package ru.tsrz.systems;

/**
 * This type was created in VisualAge.
 */
import java.io.*;
import java.net.*;
import java.sql.*;
public class GetTraffic {
	static Socket ciscoSocket = null;
	static PrintWriter out = null;
	static BufferedReader in = null;
/**
 * GetTraffic constructor comment.
 */
public GetTraffic() {
	super();
}
/**
 * This method was created in VisualAge.
 * @param args java.lang.String[]
 */
public static void main(String args[]) throws IOException {
	String fromCisco = "";
	InputStreamReader inpReader = null;
	String url = "jdbc:db2:SYSBASE";
	String driver = "COM.ibm.db2.jdbc.app.DB2Driver";
	Connection con = null;
	Statement stmt = null;
	System.out.println("Starting at " + new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)));
	PrintWriter err = new PrintWriter(new BufferedWriter(new FileWriter("d:\\sqllib\\forimport\\inettraf.log", true)));
	try {
		Class.forName(driver);
	} catch (java.lang.ClassNotFoundException e) {
		err.print(new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)) + ": ClassNotFoundException: ");
		err.println(e.getMessage());
		err.close();
		System.exit(0);
	}
	try {
		ciscoSocket = new Socket("192.168.1.254", 23);
		out = new PrintWriter(ciscoSocket.getOutputStream(), true);
		inpReader = new InputStreamReader(ciscoSocket.getInputStream());
		in = new BufferedReader(inpReader);
	} catch (UnknownHostException e) {
		err.println(new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)) + ": Don't know about host: 192.168.1.254.");
		err.close();
		System.exit(1);
	} catch (IOException e) {
		err.println(new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)) + ": Couldn't get I/O for " + "the connection to: 192.168.1.254.");
		err.close();
		System.exit(1);
	}
	fromCisco = in.readLine();
	out.println("Ship-way");
	out.println("term len 0");
	out.println("show ip account");
	while (fromCisco.indexOf("Source") == -1) {
		fromCisco = in.readLine();
	}
	fromCisco = in.readLine();
	fromCisco.trim();
	try {
		con = DriverManager.getConnection(url, "admin", "8080");
		stmt = con.createStatement();
		while (fromCisco.length() != 0) {
			java.util.StringTokenizer tok = new java.util.StringTokenizer(fromCisco, " ");
			String source = tok.nextToken();
			//		System.out.print((java.net.InetAddress.getByName(source)).getHostName()+",");
			String dest = tok.nextToken();
			tok.nextToken(); //skip packet count
			String bytes = tok.nextToken();
			fromCisco = in.readLine();
			fromCisco.trim();
			stmt.executeUpdate("insert into inettraf (source,destination,bytes) values (\'" + source + "\',\'" + dest + "\'," + bytes + ")");
			//		System.out.println(source);
		}
		stmt.close();
	} catch (SQLException e) {
		err.println(new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)) + ": Error while inserting data. SQLException: " + e.getMessage());
		err.close();
		PrintWriter fileout = new PrintWriter(new BufferedWriter(new FileWriter("d:\\sqllib\\forimport\\inettraf.txt", true)));
		int i = 1;
		while (fromCisco.length() != 0) {
			java.util.StringTokenizer tok = new java.util.StringTokenizer(fromCisco, " ");
			String source = tok.nextToken();
			//		System.out.print((java.net.InetAddress.getByName(source)).getHostName()+",");
			String dest = tok.nextToken();
			if (i == 99)
				i = 1;
			tok.nextToken(); //skip packet count
			String bytes = tok.nextToken();
			fromCisco = in.readLine();
			fromCisco.trim();
			fileout.println("\"" + new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)) + "\",\"" + source + "\",\"" + dest + "\"," + bytes);
		}
		fileout.close();
	}
	//	while (fromCisco.indexOf("way>") == -1)
	out.println("enable");
	int ch = inpReader.read();
	String str = "";
	str += (char) ch;
	while (str.indexOf("word:") == -1)
		str += (char) inpReader.read();
	out.println("cats8080");
	out.println("clear ip account");
	out.println("exit");
	str = "";
	while (str.indexOf("exit") == -1)
		str += (char) inpReader.read();
	out.close();
	in.close();
	System.out.println("Finished at " + new java.sql.Timestamp(System.currentTimeMillis() + (3 * 3600 * 1000)));
	System.out.println("--------------");
}
}