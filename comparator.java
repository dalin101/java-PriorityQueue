package edu.nccu.misds.stu105306064.hw7;

import java.util.Comparator;

public class comparator implements Comparator<keyword>

{
	
	@Override
	public int compare(keyword k1, keyword k2) {
		// TODO Auto-generated method stub
		
		if(k1.count>k2.count)
		{
			return 1;
		}
		if(k1.count<k2.count)
		{
			return -1;
		}
		if(k1.count==k2.count)
		{
			if(k1.weight>k2.weight)
			{
			    return 1;
			}
			else
			{
				return -1;
			}
		}
		
		else
		{
		    return 0;
		}
	}
}
