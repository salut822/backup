
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO{

     String name="";
     String passwaord="";
public void select(String name,String password){
	DBConnector db=new DBConnector();

}


















public void selectAll(){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

    String sql="select * from test_table";
    try{
     PreparedStatement ps =con.prepareStatement(sql);
     ResultSet rs=ps.executeQuery();
     white (rs.next()){
    	 syso
     }
    }

}
