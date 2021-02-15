// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.Calendar;
public class Entry {
  private String name;
  private Calendar dateAndTime;
  private float distance;
  
  public Entry (String n, int d, int m, int y, int h, int min, int s, float dist) {
    name = n;
    Calendar inst = Calendar.getInstance();
    inst.set(y,m-1,d,h,min,s);
    dateAndTime = inst;
    distance = dist;
  } //constructor
  
  public String getName () {
    return name;
  } //getName
  
  public int getDay () {
    return dateAndTime.get(Calendar.DATE);
  } //getDay
  
  public int getMonth () {
    int month =  dateAndTime.get(Calendar.MONTH) + 1;
    return month;
  } //getMonth
  
  public int getYear () {
    return dateAndTime.get(Calendar.YEAR);
  } //getYear

  public int getHour () {
    return dateAndTime.get(Calendar.HOUR);
  } //getHour

  public int getMin () {
    return dateAndTime.get(Calendar.MINUTE);
  } //getMin

  public int getSec () {
    return dateAndTime.get(Calendar.SECOND);
  } //getSec

  public float getDistance () {
    return distance;
  } //getYear

  public String getEntry () {
   String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
   return result;
  } //getEntry
   
} // Entry
public class CycleEntry extends Entry
{
private String name;
private Calendar dateAndTime;
private float distance;
private String terrain;
private String tempo;

	 CycleEntry(String n,float dist,int h, int min, int s,  int d, int m, int y,  String terr,String tem)
	{
		
		name = n;
	    Calendar inst = Calendar.getInstance();
	    inst.set(y,m-1,d,h,min,s);
	    dateAndTime = inst;
	    distance = dist;
	    terrain = terr;
	    tempo = tem;
	    
	  }
	
	public String getName()
	{
		return name;
	}
	
	public int getDay()
	{
		return dateAndTime.get(Calendar.DATE);
	}
	
	public int GetMonth()
	{
		 int month =  dateAndTime.get(Calendar.MONTH) + 1;
		    return month;
	}
	
	public int GetYear()
	{
		return dateAndTime.get(Calendar.YEAR);
	}
	
	public int GetHour()
	{
		return dateAndTime.get(Calendar.HOUR);
	}
	
	public int GetMin()
	{
		return dateAndTime.get(Calendar.MINUTE);
	}
	
	public int getSec()
	{
		 return dateAndTime.get(Calendar.SECOND);
	}
	
	public float getDistance()
	{
		return distance;
	}
	
	public String getTerrain()
	{
		return terrain;
	}
	
	public String getTempo()
	{
		return tempo;
	}
	
	public String getEntry()
	{
		String result = getName()+" ran " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear()+"\n on"+getTerrain()+"at"+getTempo()+"tempo \n";
	   return result;
	}
}



public class SprintEntry extends Entry
{
private String name;
private Calendar dateAndTime;
private float distance;
private int repetition;
private int recovery;

	public SprintEntry (String n, int rep, float dist, int h, int min, int s,int recov,int d,int m,int y)
	{
		
		name = n;
	    Calendar inst = Calendar.getInstance();
	    inst.set(y,m-1,d,h,min,s);
	    dateAndTime = inst;
	    distance = dist;
	    repetition = rep;
	    recovery = recov;
	    
	  }
	
	public String GetName()
	{
		return name;
	}
	
	public int GetDay()
	{
		return dateAndTime.get(Calendar.DATE);
	}
	
	public int GetMonth()
	{
		 int month =  dateAndTime.get(Calendar.MONTH) + 1;
		    return month;
	}
	
	public int GetYear()
	{
		return dateAndTime.get(Calendar.YEAR);
	}
	
	public int GetHour()
	{
		return dateAndTime.get(Calendar.HOUR);
	}
	
	public int GetMin()
	{
		return dateAndTime.get(Calendar.MINUTE);
	}
	
	public int GetSec()
	{
		 return dateAndTime.get(Calendar.SECOND);
	}
	
	public float GetDistance()
	{
		return distance;
	}
	
	public int GetRepetition()
	{
		return repetition;
	}
	
	public float GetRecovery()
	{
		return recovery;
	}
	
	public String GetEntry()
	{
		String result = GetName()+" sprinted " +GetRepetition()+"x"+ GetDistance() + " km in "
	             +GetHour()+":"+GetMin()+":"+ GetSec() + " with "
				+GetRecovery()+"recovery on "+GetDay()+"/"+GetMonth()+"/"+GetYear()+"\n";
	   return result;
	}
}


public class SwimEntry extends Entry
{
private String name;
private Calendar dateAndTime;
private float distance;
private String location;


	public SwimEntry (String n,float dist,String loc, int h, int min, int s,int d,int m,int y)
	{
		
		name = n;
	    Calendar inst = Calendar.getInstance();
	    inst.set(y,m-1,d,h,min,s);
	    dateAndTime = inst;
	    distance = dist;
	    location=loc;
	    
	  }
	
	public String GetName()
	{
		return name;
	}
	
	public int GetDay()
	{
		return dateAndTime.get(Calendar.DATE);
	}
	
	public int GetMonth()
	{
		 int month =  dateAndTime.get(Calendar.MONTH) + 1;
		    return month;
	}
	
	public int GetYear()
	{
		return dateAndTime.get(Calendar.YEAR);
	}
	
	public int GetHour()
	{
		return dateAndTime.get(Calendar.HOUR);
	}
	
	public int GetMin()
	{
		return dateAndTime.get(Calendar.MINUTE);
	}
	
	public int GetSec()
	{
		 return dateAndTime.get(Calendar.SECOND);
	}
	
	public float GetDistance()
	{
		return distance;
	}
	
	
	public float GetLocation()
	{
		return location;
	}
	
	public String GetEntry()
	{
		String result = GetName()+"swam " +GetDistance()+ " km "+GetLocation()+"in"+
	             +GetHour()+":"+GetMin()+":"+ GetSec() + " on "
				+GetDay()+"/"+GetMonth()+"/"+GetYear()+"\n";
	   return result;
	}
}

