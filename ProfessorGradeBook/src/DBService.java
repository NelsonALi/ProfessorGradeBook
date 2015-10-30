import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import javax.servlet.ServletException;

public class DBService {
	private  Connection conn;
	
	public DBService() {
		try {
			conn = getConnected();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  Connection getConn() {
		return conn;
	}

	public  void setConn(Connection conn) {
		this.conn = conn;
	}

	public  Connection getConnected() throws SQLException {
		// URL of Oracle database server
		Connection conn;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:testuserdb/password@localhost";
		// properties for creating connection to Oracle database
		Properties props = new Properties();
		props.setProperty("user", "testuserdb");
		props.setProperty("password", "password");

		// creating connection to Oracle database using JDBC
		conn = DriverManager.getConnection(url, props);
		return conn;
	}
	public ArrayList<String> getAssignmentsByStudentId(int studentId) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public ArrayList<String> getAssignmentsByStudentName(String studentName) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public ArrayList<String> getAssignmentsByType(int gradeTypeId) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public ArrayList<String> getAssignmentsByType(String gradeType) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public ArrayList<String> getAssignments(int gradeTypeId, int studentId) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public ArrayList<String> getAssignments(String gradeType, String studentName) {
		ArrayList<String> assignmentList = null;
		return assignmentList;
	}
	public boolean checkLogin(String loginName) {
		ResultSet rs = null;
		boolean flag = false;
		int count = 0;
	   	String sql = "select count(LOGINNAME) as num from students where LOGINNAME = '" + loginName + "'";
		try {
/*			PreparedStatement st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			count = rs.next();
*/			Statement st = conn.createStatement();
			rs = st.executeQuery(sql) ;
			while (rs.next()) {
				count = rs.getInt("num");
			}
			if (count > 0) flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public void addStudent(Student aStudent) {
		PreparedStatement stmt = null;
		String sql = "insert into students (email, loginname, password, regdate) values (?,?,?,?);
		 currentDate = "";
		try {
			stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, aStudent.getEmail());
			stmt.setString(2, aStudent.getLoginname());
			stmt.setString(3, aStudent.getPassword());
			currentDate = "TO_DATE('" + aStudent.getRegdate() + "', 'MM-DD-YYYY')";
			stmt.setString(4,  currentDate);  // TO_DATE('10/30/2015', 'MM-DD-YYYY' 
			stmt.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addAssignment(Assignment anAssignment) {
		
	}
	public void disconnectDB() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

