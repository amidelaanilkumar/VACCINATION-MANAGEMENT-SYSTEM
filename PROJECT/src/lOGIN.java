import java.util.Scanner;
public class lOGIN {
	
	String username;
    String password;
    // CONSTRUCTOR
    public lOGIN()
    {
 	   username="zzz";
 	   password="zzz@1234#";
    }
    void get_info()
    {
 	   Scanner q=new Scanner(System.in);
 	   System.out.println("ENTER YOUR USERNAME:");
 	   username=q.next();
 	   System.out.println("ENTER YOUR PASSWORD:");
 	   password=q.next();
 	   
    }

}
