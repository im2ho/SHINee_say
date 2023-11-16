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
            
            File f = new File("C://Users//user1//Desktop/단하나토마스.jpeg");    
            FileInputStream fis = new FileInputStream(f);
            
            stmt = con.prepareStatement(
            		//update 테이블명 set 업데이트컬럼명 = 업데이트할 값 where 조건
                    "UPDATE playlist_info SET image=? WHERE user_id=?");
           
            stmt.setBinaryStream(1, fis,(int)f.length());
            stmt.setString(2, "gkdms2710");
            //stmt.setString(2, "나세희");
            //stmt.setString(3, "칸쵸");
            //stmt.setString(4, "kh123456!");
            //stmt.setString(5, "kankan@kakao.com");
            //stmt.setString(6, "01037134606");
            //stmt.setBinaryStream(7, fis,(int)f.length());
            
            int rownum = stmt.executeUpdate();
            
            if(rownum >0){
                System.out.println("삽입성공");
            }else
            {
                System.out.println("실패");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
                //사용한 객체 close
                try {
                    if(con != null) con.close();
                    if(stmt != null) stmt.close();
                } catch (Exception e) {
                    
                }
            
        }
        
    }
 
}