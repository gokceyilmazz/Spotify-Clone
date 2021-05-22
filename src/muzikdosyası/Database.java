
package muzikdosyası;

/**
 *
 * @author Gökçe Yılmaz
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.Font;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Database {
	
	static Connection myConn;
	static Statement myStat;
	
	static ResultSet yap(String tablo) {
		ResultSet myRs = null;
		try {			
			myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/spotify","root","");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from "+tablo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
	}
	
	
       

}
