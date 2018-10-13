import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class htmlextractor {
	public static void main (String [] args) throws Exception {
			homePage();
		}
	
	public static void homePage() throws Exception {
		try {
			Scanner URL = new Scanner (System.in);
		    System.out.println("Type your URL (Format http://www.example.com):");
			String ScanURL = URL.nextLine();
		    URL myURL = new URL(ScanURL);
		    URLConnection myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    		    
		    System.out.println("Success");

		    BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
		    		String inputLine;
		    		while ((inputLine = in.readLine()) != null) 
		    			System.out.println(inputLine);
		    		in.close();

		} 
		catch (MalformedURLException e) { 
		    System.out.println("new URL() failed");
		   
		} 
		catch (IOException e) {   
		    System.out.println("openConnection() failed");		

		}
		Scanner choice = new Scanner (System.in);
		System.out.println("Fetch Another?");
		String continuechoice = choice.nextLine();
		if (continuechoice.equalsIgnoreCase("Yes")) {
		main(null);
		} else {
			System.out.println("Program Terminated.");
		}
		

    }
		 
	}



