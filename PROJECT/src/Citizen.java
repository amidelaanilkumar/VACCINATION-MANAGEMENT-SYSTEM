import java.time.LocalDate;
import java.util.Scanner;

public class Citizen {
	static String msg = "Hi";
	public void  enter() throws InterruptedException {
        LocalDate myObj = LocalDate.now();
        Feedback fb = new Feedback();
    	Vaccinated th1=new Vaccinated();
        Thread th = new Thread(th1);
        
		// TODO Auto-generated method stub
		Address adr = new Address();
		Scanner s1=new Scanner(System.in);
		p_change a= new p_change();
		lOGIN b= new lOGIN();
		register c= new register(adr);
		
		System.out.println("IF YOU WANT TO REGISTER ENTER ==> 1");

        System.out.println("IF YOU WANT TO LOGIN ENTER ==> 2");

        System.out.println("IF YOU WANT TO CHANGE PASSWORD ENTER ==> 3");
        
        System.out.println("IF YOU WANT TO CHANGE Address ==> 4");
        int choice;
        choice=s1.nextInt();

        if(choice==1)

        {

              c.reg();

        }

        else if(choice==2)

        {

              b.get_info();

        }

        else if(choice == 3)

        {

              a.change();

        }
        else {
        	c.reg();
        }
        System.out.println();
        System.out.println();
        System.out.println("Message from the admin:");
        System.out.println("**********************"+msg+"**********************");
        System.out.println();
        System.out.println();
        Select select = new Select();
        select.sel(adr.getStreet());
        System.out.println("Vaccine is succesfully booked on "+myObj); 
        
        
		th.start();
		th.join();
		fb.isVaccinated();
        
	}
}
