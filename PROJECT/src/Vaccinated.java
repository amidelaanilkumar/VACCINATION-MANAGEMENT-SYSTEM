
public class Vaccinated implements Runnable  {
    public void run()  
    {    
         System.out.println("Getting Vacinated");  
         try{Thread.sleep(20000);}catch(InterruptedException e){System.out.println(e);}   
         System.out.println("Vacination is Done");


    }
}
