import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sailpoint.api.Provisioner;
import sailpoint.api.SailPointContext;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningPlan.AccountRequest;

public class demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ProvisioningPlan plan = new ProvisioningPlan();
		SailPointContext context = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // table details
		String username = "krishna"; // MySQL credentials
		String password = "krishna";
		String query = "select max(empid) from krishna.oracle_users order by EMPID"; // query to be run
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		//System.out.println("Connection Established successfully");
		PreparedStatement st=con.prepareStatement(query);
		//st.
		ResultSet rs = st.executeQuery(); // Execute query
		rs.next();
		String name = rs.getString("1");
		
		AccountRequest req = null;
		req.getNativeIdentity();
		
Provisioner pro =new Provisioner(context);
//pro.execute(plan);
	}
}
