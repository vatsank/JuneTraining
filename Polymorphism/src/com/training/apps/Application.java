package com.training.apps;

import java.util.*;

import com.training.domains.NewShowRoom;
import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		String ch="Y";
		Scanner sc = new Scanner(System.in);
		do{
				
		System.out.println("Enter 1 for Maruti 2 for Toyoto 3 Bike");
		
		  int key=sc.nextInt();
		
		  ShowRoom obj = new NewShowRoom();
		  
		     Automobile polyAuto = obj.getModel(key);
		     
		     if(polyAuto==null)
		     {
		    	 System.out.println("invalid Choice");
		     }
		     else
		     {
		    	 obj.printQuote(polyAuto);
		 
		     }
		    
		      System.out.println("Y To Continue N  To Exit");
		       ch = sc.next();
			}

		      while(ch.equalsIgnoreCase("Y"));
		
		   
		 sc.close();
	}

}
