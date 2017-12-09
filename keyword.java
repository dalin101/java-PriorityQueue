package edu.nccu.misds.stu105306064.hw7;

public class keyword 

{	
	public String name;
	public int count;
    public double weight;
	
    public keyword(String name, int count,  double weight)
    {
    	this.name = name;
    	this.count = count;
    	this.weight = weight;
    }
    
	public String toString()
	{
		return "["+name+","+count+","+weight+"]";
	}

}
