package shinee.search;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
public class BlobTest {
 
    public static void main(String[] args) {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Connection con = null;
        PreparedStatement stmt = null;
        
        
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "shinee","shinee");
            
            File f = new File("C://Users//user1//Desktop/����.jpeg");    
            FileInputStream fis = new FileInputStream(f);
            
            stmt = con.prepareStatement(
                    "INSERT INTO user_info VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, "rladlgdh");
            stmt.setString(2, "����ȣ");
            stmt.setString(3, "��ȣ");
            stmt.setString(4, "kh123123!");
            stmt.setString(5, "dlghdldfgh@naver.com");
            stmt.setString(6, "01081651659");
            stmt.setBinaryStream(7, fis,(int)f.length());
            
            int rownum = stmt.executeUpdate();
            
            if(rownum >0){
                System.out.println("���Լ���");
            }else
            {
                System.out.println("����");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
                //����� ��ü close
                try {
                    if(con != null) con.close();
                    if(stmt != null) stmt.close();
                } catch (Exception e) {
                    
                }
            
        }
        
    }
 
}