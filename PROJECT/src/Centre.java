import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
public class Centre {
	ArrayList<LinkedHashMap<String, String>> myArrList = new ArrayList<LinkedHashMap<String, String>>();
	LinkedHashMap<String, String> map;
	public void create2DArrayList()
    {
 
		
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C001");
				map.put("Type", "Covaxin");
				map.put("Number", "15");
				map.put("City", "Hyd");
				map.put("Street", "Secunderabad");
				map.put("Number1", "5");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C002");
				map.put("Type", "Covaxin");
				map.put("Number", "10");
				map.put("City", "Hyd");
				map.put("Street", "Amerpet");
				map.put("Number1", "10");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C003");
				map.put("Type", "Covaxin");
				map.put("Number", "22");
				map.put("City", "Hyd");
				map.put("Street", "Panjagutta");
				map.put("Number1", "3");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C004");
				map.put("Type", "Covaxin");
				map.put("Number", "23");
				map.put("City", "Hyd");
				map.put("Street", "Bharatnagar");
				map.put("Number1", "10");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C005");
				map.put("Type", "Covaxin");
				map.put("Number", "27");
				map.put("City", "Vijayawada");
				map.put("Street", "Benzcircle");
				map.put("Number1", "14");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C006");
				map.put("Type", "Covaxin");
				map.put("Number", "17");
				map.put("City", "Vijayawada");
				map.put("Street", "labbipet");
				map.put("Number1", "5");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C007");
				map.put("Type", "Covaxin");
				map.put("Number", "15");
				map.put("City", "Vijayawada");
				map.put("Street", "Autonagar");
				map.put("Number1", "2");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C008");
				map.put("Type", "Covaxin");
				map.put("Number", "33");
				map.put("City", "Vijayawada");
				map.put("Street", "Gandhinagar");
				map.put("Number1", "9");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C009");
				map.put("Type", "Covaxin");
				map.put("Number", "37");
				map.put("City", "Vizag");
				map.put("Street", "Vizag east");
				map.put("Number1", "10");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C010");
				map.put("Type", "Covaxin");
				map.put("Number", "29");
				map.put("City", "Vizag");
				map.put("Street", "Vizag west");
				map.put("Number1", "9");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C011");
				map.put("Type", "Covaxin");
				map.put("Number", "23");
				map.put("City", "Vizag");
				map.put("Street", "Vizag south");
				map.put("Number1", "8");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C012");
				map.put("Type", "Covaxin");
				map.put("Number", "25");
				map.put("City", "Vizag");
				map.put("Street", "Vizag north");
				map.put("Number1", "4");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C013");
				map.put("Type", "Covaxin");
				map.put("Number", "27");
				map.put("City", "Tirupati");
				map.put("Street", "Ramnagar");
				map.put("Number1", "5");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C014");
				map.put("Type", "Covaxin");
				map.put("Number", "28");
				map.put("City", "Tirupati");
				map.put("Street", "Balajicolony");
				map.put("Number1", "10");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C015");
				map.put("Type", "Covaxin");
				map.put("Number", "39");
				map.put("City", "Tirupati");
				map.put("Street", "Srinagar");
				map.put("Number1", "5");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C016");
				map.put("Type", "Covaxin");
				map.put("Number", "33");
				map.put("City", "Tirupati");
				map.put("Street", "Gopalnagar");
				map.put("Number1", "2");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C001");
				map.put("Type", "Covisheld");
				map.put("Number", "38");
				map.put("City", "Hyd");
				map.put("Street", "Secunderabad");
				map.put("Number1", "6");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C002");
				map.put("Type", "Covisheld");
				map.put("Number", "20");
				map.put("City", "Hyd");
				map.put("Street", "Amerpet");
				map.put("Number1", "4");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C003");
				map.put("Type", "Covisheld");
				map.put("Number", "10");
				map.put("City", "Hyd");
				map.put("Street", "Panjagutta");
				map.put("Number1", "6");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C004");
				map.put("Type", "Covisheld");
				map.put("Number", "14");
				map.put("City", "Hyd");
				map.put("Street", "Bharatnagar");
				map.put("Number1", "9");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C005");
				map.put("Type", "Covisheld");
				map.put("Number", "11");
				map.put("City", "Vijayawada");
				map.put("Street", "Benzcircle");
				map.put("Number1", "5");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C006");
				map.put("Type", "Covisheld");
				map.put("Number", "18");
				map.put("City", "Vijayawada");
				map.put("Street", "labbipet");
				map.put("Number1", "6");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C007");
				map.put("Type", "Covisheld");
				map.put("Number", "35");
				map.put("City", "Vijayawada");
				map.put("Street", "Autonagar");
				map.put("Number1", "11");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C008");
				map.put("Type", "Covisheld");
				map.put("Number", "36");
				map.put("City", "Vijayawada");
				map.put("Street", "Gandhinagar");
				map.put("Number1", "7");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C009");
				map.put("Type", "Covisheld");
				map.put("Number", "36");
				map.put("City", "Vizag");
				map.put("Street", "Vizag east");
				map.put("Number1", "5");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C010");
				map.put("Type", "Covisheld");
				map.put("Number", "10");
				map.put("City", "Vizag");
				map.put("Street", "Vizag west");
				map.put("Number1", "6");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C011");
				map.put("Type", "Covisheld");
				map.put("Number", "10");
				map.put("City", "Vizag");
				map.put("Street", "Vizag south");
				map.put("Number1", "5");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C012");
				map.put("Type", "Covisheld");
				map.put("Number", "40");
				map.put("City", "Vizag");
				map.put("Street", "Vizag north");
				map.put("Number1", "2");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C013");
				map.put("Type", "Covisheld");
				map.put("Number", "15");
				map.put("City", "Tirupati");
				map.put("Street", "Ramnagar");
				map.put("Number1", "15");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C014");
				map.put("Type", "Covisheld");
				map.put("Number", "44");
				map.put("City", "Tirupati");
				map.put("Street", "Balajicolony");
				map.put("Number1", "17");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C015");
				map.put("Type", "Covisheld");
				map.put("Number", "15");
				map.put("City", "Tirupati");
				map.put("Street", "Srinagar");
				map.put("Number1", "5");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C016");
				map.put("Type", "Covisheld");
				map.put("Number", "25");
				map.put("City", "Tirupati");
				map.put("Street", "Gopalnagar");
				map.put("Number1", "7");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C001");
				map.put("Type", "Sputnik");
				map.put("Number", "27");
				map.put("City", "Hyd");
				map.put("Street", "Secunderabad");
				map.put("Number1", "7");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C002");
				map.put("Type", "Sputnik");
				map.put("Number", "34");
				map.put("City", "Hyd");
				map.put("Street", "Amerpet");
				map.put("Number1", "6");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C003");
				map.put("Type", "Sputnik");
				map.put("Number", "32");
				map.put("City", "Hyd");
				map.put("Street", "Panjagutta");
				map.put("Number1", "8");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C004");
				map.put("Type", "Sputnik");
				map.put("Number", "9");
				map.put("City", "Hyd");
				map.put("Street", "Bharatnagar");
				map.put("Number1", "6");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C005");
				map.put("Type", "Sputnik");
				map.put("Number", "10");
				map.put("City", "Vijayawada");
				map.put("Street", "Benzcircle");
				map.put("Number1", "7");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C006");
				map.put("Type", "Sputnik");
				map.put("Number", "19");
				map.put("City", "Vijayawada");
				map.put("Street", "labbipet");
				map.put("Number1", "8");
				myArrList.add(map);map = new LinkedHashMap<String, String>();
				map.put("CentreID","C007");
				map.put("Type", "Sputnik");
				map.put("Number", "38");
				map.put("City", "Vijayawada");
				map.put("Street", "Autonagar");
				map.put("Number1", "5");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C008");
				map.put("Type", "Sputnik");
				map.put("Number", "31");
				map.put("City", "Vijayawada");
				map.put("Street", "Gandhinagar");
				map.put("Number1", "4");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C009");
				map.put("Type", "Sputnik");
				map.put("Number", "34");
				map.put("City", "Vizag");
				map.put("Street", "Vizag east");
				map.put("Number1", "8");
				myArrList.add(map);
				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C010");
				map.put("Type", "Sputnik");
				map.put("Number", "11");
				map.put("City", "Vizag");
				map.put("Street", "Vizag west");
				map.put("Number1", "7");
				myArrList.add(map);





				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C011");
				map.put("Type", "Sputnik"); map.put("Number", "25");
				map.put("City", "Vizag");
				map.put("Street", "Vizag south");
				map.put("Number1", "6");
				myArrList.add(map);


				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C012");
				map.put("Type", "Sputnik");
				map.put("Number", "33");
				map.put("City", "Vizag");
				map.put("Street", "Vizag north");
				map.put("Number1", "6");
				myArrList.add(map);


				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C013");
				map.put("Type", "Sputnik");
				map.put("Number", "42");
				map.put("City", "Tirupati");
				map.put("Street", "Ramnagar");
				map.put("Number1", "19");
				myArrList.add(map);



				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C014");
				map.put("Type", "Sputnik");
				map.put("Number", "55");
				map.put("City", "Tirupati");
				map.put("Street", "Balajicolony");
				map.put("Number1", "5");
				myArrList.add(map);


				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C015");
				map.put("Type", "Sputnik");
				map.put("Number", "45");
				map.put("City", "Tirupati");
				map.put("Street", "Srinagar");
				map.put("Number1", "5");
				myArrList.add(map);



				map = new LinkedHashMap<String, String>();
				map.put("CentreID","C016");
				map.put("Type", "Sputnik");
				map.put("Number", "43");
				map.put("City", "Tirupati");
				map.put("Street", "Gopalnagar");
				map.put("Number1", "10");
				myArrList.add(map);
				

		 writeToFile();
        
    }
	
	public void writeToFile()  {
		try {
			File Employee =new File("Centres.csv");
			FileWriter writer;
			writer = new FileWriter(Employee, false);  
			writer.write("Centre Id");
			writer.write(",");
			writer.write("Vaccination Tye");
			writer.write(",");
			writer.write("No.of Vaccines available");
			writer.write(",");
			writer.write("City");
			writer.write(",");
			writer.write("Street");
			writer.write(",");
			writer.write("No.of People vaccinated");
			writer.write("\r\n");
			
			for (int i = 0; i < myArrList.size(); i++) {	 
				writer.write(myArrList.get(i).get("CentreID").toString());
				writer.write(",");
				writer.write(myArrList.get(i).get("Type").toString());
				writer.write(",");
				writer.write(myArrList.get(i).get("Number").toString());
				writer.write(",");
				writer.write(myArrList.get(i).get("City").toString());
				writer.write(",");
				writer.write(myArrList.get(i).get("Street").toString());
				writer.write(",");
				writer.write(myArrList.get(i).get("Number1").toString());
				writer.write("\r\n");
			}
			
			
			writer.close();
			
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void LinkedHashMapFromTextFile()
	{
		
		System.out.println("Vaccination Centre Details:");
		BufferedReader br = null;

		try {

			
			File file = new File("Centres.csv");

			br = new BufferedReader(new FileReader(file));

			String line = null;

			
			br.readLine();
			while ((line = br.readLine()) != null) {
		
				
				
               String [] arr = line.split(",");
               System.out.println(" ");
               System.out.println("Vaccine Id: " + arr[0]);
               System.out.println("Vaccine Type: " + arr[1]);
               System.out.println("Number of vaccines available: " + arr[2]);
               System.out.println("City: " + arr[3]);
               System.out.println("Street: " + arr[4]);
               System.out.println("Number of people vaccinated: " + arr[5]);
               System.out.println(" ");
				


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
	

}

