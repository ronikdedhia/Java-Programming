//This class sets up the server.

import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer implements Serializable{
	
	static int portnumber;
     //String remoteObject ="remoteObject";
	static String start = "start";

	public static void main(String[] args) {
		
		try{

			portnumber = 1100;
				
			Registry reg = LocateRegistry.createRegistry(portnumber);   //Creates and exports a Registry instance on the local host that accepts requests 
																		//on the specified port.

			RmiImplementation imp =  new RmiImplementation("C:/ServerStorage");
			reg.bind("remoteObject", imp);
			System.out.println(reg);
			System.out.println("Server is ready.");
			System.out.println(portnumber);
		}
		catch(Exception e){
			System.out.println("Server failed: " + e);
		}
	}
}
