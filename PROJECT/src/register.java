import java.util.Scanner;
public class register {
	Scanner s3=new Scanner(System.in);
	   String n1;
	   String P1;
	   String add1;
	   String mail;
    String r1;
    String r2;
    Address adr;//Composition
    public register(Address adr) {
    	this.adr = adr;

    }
    public void reg()
    {
 	   System.out.println("ENTER YOUR NAME:");
 	   n1=s3.nextLine();
 	   System.out.println("ENTER YOUR PHONE NUMBER:");
 	   P1=s3.nextLine();
 	   System.out.println("ENTER YOUR ADDRESS:");
 	   adr.setAddress();
 	   System.out.println("ENTER YOUR EMAIL_ID:");
 	   mail=s3.nextLine();
 	   System.out.println("ENTER YOUR USERNAME:");
 	   r1=s3.nextLine();
 	   System.out.println("ENTER YOUR PASSWORD:");
 	   r2=s3.nextLine();
 	   if(r2.length() >= 4 && r2.length() <= 15)
 	   {
 	     if(r2.contains("@") || r2.contains("#"))
 	     {
 	    	 System.out.println("YOU HAVE SUCCESSFULLY REGISTERED INTO THE WEBSITE");
 	     }
 	     else
 	     {
 	    	 System.out.println("ENTER YOUR NEW PASSWORD WHICH CONTAINS '@','#' AND ALSO THE PASSWORD LENGTH MUST BE >=4 AND <=15");
 	    	 reg();
 	     }
 	   }
 	   else
 	   {
 		   System.out.println("ENTER YOUR NEW PASSWORD WHICH CONTAINS '@','#' AND ALSO THE PASSWORD LENGTH MUST BE >=4 AND <=15");
 		   reg();
 	   }
 	   
 	   
    }

}
