package driver;
import com.mobiletrackersystem.connection.*;
public class DriverClass {

	public static void main(String[] args) {
		DBConnect db=new DBConnect();
		db.getConnection();

	}

}
