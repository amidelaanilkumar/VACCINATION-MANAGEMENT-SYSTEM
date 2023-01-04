import java.util.Scanner;
public class p_change {
	Scanner w=new Scanner(System.in);
    String p_ch;
    public void change()
    {
       System.out.println("ENTER YOUR NEW PASSWORD:");
	   p_ch=w.next();
	   if(p_ch.length() >= 4 && p_ch.length() <= 15)
	   {
	     if(p_ch.contains("@") || p_ch.contains("#"))
	     {
	    	 System.out.println("YOU HAVE SUCCESSFULLY REGISTERED INTO THE WEBSITE");
	     }
	     else
	     {
	    	 System.out.println("ENTER YOUR NEW PASSWORD WHICH CONTAINS '@','#' AND ALSO THE PASSWORD LENGTH MUST BE >=4 AND <=15");
	    	 change();
	     }
	   }
	   else
	   {
		   System.out.println("ENTER YOUR NEW PASSWORD WHICH CONTAINS '@','#' AND ALSO THE PASSWORD LENGTH MUST BE >=4 AND <=15");
		   change();
	   }
	   System.out.println("NOW CHECK BY ENTERING INTO THE WEBSITE");
    }

}
