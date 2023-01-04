import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.time.LocalDate;

public class Select {
	Scanner ch=new Scanner(System.in);
	LinkedHashMap<String,String> Emp = new LinkedHashMap<String,String>();
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	String[] r= {"Covaxin","Covid Sheild","Sputnik"};
	int choice,count,d;
	int centre;
	int a1,a2,a3,a4;
	
	
	public Select() {
		LinkedHashMapFromTextFile(); 
	}
	public void sel(String abc)
	{
		
		for(int j = 1; j < list.size(); j = j+4){
			int i = 1;
			
			i = stringCompare(list.get(j),abc);
			if( i == 0 ) {
              d=j;
            //  System.out.println(list.get(j-1));  
              //System.out.println(list.get(j));  
              System.out.println("Type of Vaccine: "  +list.get(j+1) + " and Quantity available: " +  list.get(j+1+1));  

             
         
			}
	    }
	
        System.out.println("Press:");
        System.out.println("1 for Covaxin");
        System.out.println("2 for Covisheld");
        System.out.println("3 for Sputnik");
        choice = ch.nextInt();
        System.out.println("Select Date:");
        a1 = ch.nextInt();
        System.out.println("Select Month:");
        a2 = ch.nextInt();
        System.out.println("Select Year:");
        a3 = ch.nextInt();
        System.out.println("Book Your Slot:");
        System.out.println("1: Morning - 9 A.M to 12 A.M");
        System.out.println("2: Evining -2 P.M to 4 P.M ");
        a4 = ch.nextInt();
        System.out.println("Your Slot is Booked Successfully");
		
	}
	
	
	public static int stringCompare(String str1, String str2)
    {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
          
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        }

        else {
            return 0;
        }
    }

	   public int stringCompare1(String str1, String str2)
	    {
	  
	        int l1 = str1.length();
	        int l2 = str2.length();
	        int lmin = Math.min(l1, l2);
	  
	        for (int i = 0; i < lmin; i++) {
	            int str1_ch = (int)str1.charAt(i);
	            int str2_ch = (int)str2.charAt(i);
	  
	            if (str1_ch != str2_ch) {
	                return str1_ch - str2_ch;
	                
	            }
	        }

	        if (l1 != l2) {
	            return l1 - l2;
	        }

	        else {
	            return 0;
	        }
	    }
	
	public void LinkedHashMapFromTextFile()
	{
		

		BufferedReader br = null;

		try {

			
			File file = new File("Centres.csv");

			br = new BufferedReader(new FileReader(file));

			String line = null;

			
			br.readLine();
			while ((line = br.readLine()) != null) {
		
				String[] parts = line.split(",");
				
				String name = parts[4].trim();
				String number = parts[0].trim();
				String Vaccine = parts[1].trim(); 
				String num = parts[2].trim(); 
				
				if (!name.equals("") && !number.equals("")) {
					  list.add(number);
					  list.add(name);
					  list.add(Vaccine);
					  list.add(num);
				}

		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

		
			if (br != null) {
				try {
					br.close();
				}
				catch (Exception e) {
				};
			}
		}
		
		//System.out.println(list.get(0+64)); 
        
}

	
	//System.out.println("Vaccination Centre ID :" +list.get(j-1));
//	System.out.println("Vaccination Name:" + list.get(j));
//	System.out.println("Three Vaccinations are available");
//	System.out.println("Select One of it");
//	System.out.println("1.CoVaxin");
//	System.out.println("2.CovodSheild");
//	System.out.println("3.Sputnik");

	
	
}
