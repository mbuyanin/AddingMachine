package cse360assignment02;

/*
 * <h1> This program is tasked with adding and subtracting numbers</h1>
 * 
 * <p>
 * <b>Note</b>: The code has been adjusted slightly because I like it to look this way rather than the way it was provided.
 * 
 * @author 		Michael Buyanin
 * @version 		2.0
 * @since		October 7th, 2020
 */


public class AddingMachine 
{
  private int total;
  private String output = "0 ";
  
  
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
  }
  
  // @return		int total
  public int getTotal () 
  {
    return total;
  }
  
  // @param			int value
  public void add (int value) 
  {
	  total += value;
	  output += "+ " + value + " ";
  }

  // @param			int value
  public void subtract (int value) 
  {
	  total -= value;
	  output += "- " + value + " ";
  }

  // @return		string output
  public String toString () 
  {
    return output; 
  }

  // Just clears both the total and the output string.
  public void clear() 
  {
	  total = 0;
	  output = "";
  }
}