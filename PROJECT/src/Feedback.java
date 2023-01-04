import java.util.Scanner;

public class Feedback implements GetVaccinated{

	@Override
	public void isVaccinated() {
		// TODO Auto-generated method stub
		Scanner s2=new Scanner(System.in);
		System.out.println("Did you feel any discomforts after getting Vaccinated:(Yes/No)");
		String S1 = null;
		S1 = s2.nextLine();
		System.out.println("Did you take any medication before vaccination:(Yes/No)");
		S1 = s2.nextLine();
		System.out.println("Did you take any medication after vaccination:(Yes/No)");
		S1 = s2.nextLine();
		System.out.println("Thank you for your valuable feedback :)");
        
	}
     
}
