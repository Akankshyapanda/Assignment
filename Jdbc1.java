package jdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Jdbc1 {
	public static void main(String a[]) {
		// Creating the connection
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ora";
		String pass = "akku";

		// Inserting data using SQL query
		// String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')";
		String sql = "select deptno, dname, loc from dept";
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				System.out.println(result.getString("DNAME") + ":" + result.getString("LOC"));
			}

		} catch (Exception ex) {
			System.err.println(ex);
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}