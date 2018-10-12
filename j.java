import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class j {
	public static void main (String [] args) throws Exception {
			homePage();
		}
	
	public static void homePage() throws Exception {
		try {
		    URL myURL = new URL("http://www.worklisting.org/start/#studentwork");
		    URLConnection myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    
		    BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
		    		String inputLine;
		    		while ((inputLine = in.readLine()) != null) 
		    			System.out.println(inputLine);
		    		in.close();
		    System.out.println("Success");

		} 
		catch (MalformedURLException e) { 
		    System.out.println("new URL() failed");
		   
		} 
		catch (IOException e) {   
		    System.out.println("openConnection() failed");		

		}
		main(null);

    }
		 
	}


