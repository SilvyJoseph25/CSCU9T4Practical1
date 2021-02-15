// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
    
     public void addSwimEntry(Entry w)
   {
       tr.add(w);    
   } 
   
   public void addCycleEntry(Entry c)
   {
       tr.add(c);    
   }s
   
   public void addSprintEntry(Entry t)
   {
       tr.add(t);    
   } 
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result= "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String[] lookupWholeEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String[] result= new String[tr.size()];
       int size=result.length;
       for(int i=0;i<=size;i++)
       {
    	   if (iter.hasNext())
    	   {
    	          Entry current = iter.next();
    	          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
    	          {
    	        	  result[i] = current.getEntry(); 
    	          }
    	             
             }
    	   else
    		   result[i]="No entries found";
       
            }
       return result;
   } // lookupWholeEntry
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord
