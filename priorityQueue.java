package edu.nccu.misds.stu105306064.hw7;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class priorityQueue 
{
	comparator compare = new comparator();
	private PriorityQueue queue;
	
	public priorityQueue()
	{
		queue = new PriorityQueue(10, compare);
		
	}
	
	public void add(keyword k)
	{
		queue.add(k);
		System.out.println("Done!");
	}
	
	public void peek()
	{
		if(queue.peek()==null)
		{
			System.out.println("InvalidOperation");
		}
		else
		{
			System.out.println(queue.peek());
		}
	}
	
	public void removeMin()
	{
		if(queue.peek()==null)
		{
			System.out.println("InvalidOperation");
		}
		else
		{
			System.out.println(queue.poll());
		}	
	}
	
	public void output()
	{
		if(queue.peek()==null)
		{
			System.out.println("InvalidOperation");
		}
		else
		{
			ArrayList<String> lst = new ArrayList<String>();
		    while(queue.peek()!=null)
		    {
			    lst.add(queue.peek().toString()+" ");
		        queue.poll();
		    }
	       	for(int i=0; i<lst.size(); i++)
		    {
			    System.out.print(lst.get(i));
		    }
		}
	}
}
