package edu.nccu.misds.stu105306064.hw7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		priorityQueue queue = new priorityQueue();
		
	    Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
		    String operation = in.next();
		
	    	switch(operation)
		    {
		
		    case "add":
		    	String name = in.next();
			    int count = in.nextInt();
			    double weight = in.nextDouble();
			    keyword k = new keyword(name, count, weight);
			    queue.add(k);
			    break;
			
		    case "peek":
			    queue.peek();
			    break;
			
		    case "removeMin":
			    queue.removeMin();
			    break;
			
		    case "output":
			    queue.output();
			    break;
			
		    default:
		    	System.out.println("InvalidOperation");
			    break;			
		    }
			
		}
	}
}
