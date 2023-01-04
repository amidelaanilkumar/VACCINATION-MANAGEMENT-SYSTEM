
import java.util.Scanner;



public class MAIN {
	 

	
	public static void main(String[] args) throws InterruptedException {
   Citizen citizen = new Citizen();
   Address adr1 = new Address();
   Admin admin = new Admin(null, null, null, adr1);
   Centre centre= new Centre();
   
   while(true){
	    System.out.println("Enter 1 if you are a customer.");  
	    System.out.println("Enter 2 if you are a Admin."); 
		System.out.println("Enter 9 to  Exit.");
		System.out.println("Enter Your Choice:");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();//accept user input

		switch(choice){
		case 1:
		citizen.enter();
		break;
		case 2: 
			int abc = 1;
			while(abc == 1){
			    System.out.println("Welcome To Manager Dashboard");
				System.out.println("Enter 1 to get the details of the manager");
				System.out.println("Enter 2 to  change details of the manager");
				System.out.println("Enter 3 to  view details of Vaccines and Vaccination centres:");
				System.out.println("Enter 4 to Print message to the Citizen");
				System.out.println("Enter 9 to  logout.");
				System.out.println("Enter Your Choice:");
				choice = scan.nextInt();
				switch(choice){
				case 1:
				admin.getDetails();
				break;
				case 2:
				admin.changeDetails();
				break;
				case 3:
				centre.LinkedHashMapFromTextFile();
				break;
				case 4:
					System.out.println("Enter the message");
					String S = null;
					S = scan.nextLine();
					S = scan.nextLine();
					Citizen.msg = S;
					break;
				case 9: System.out.println("Logout Succesfull");
				abc = 2;
				break;
				default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				}
			}
				
			
		break;	
		case 9: System.out.println("Logout Succesfull");
		System.exit(0);
		default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}
	}
	
	

}}

