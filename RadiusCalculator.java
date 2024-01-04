// Jose Guzman
// September 17, 2023
// Description: calculates and displays the area 
//of the circle using the radius
// File name: RadiusCalculator.java
// To Compile in terminal type: javac RadiusCalculator.java
// To Run in terminal type: java RadiusCalculator

import java.io.*; // needed to access input stream classes

public class RadiusCalculator
{
  public static void main (String [] args)
  throws java.io.IOException // need this for readLine()
  {
    String s1;
    double radius, area;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter the radius of a circle: ");                 
    //               ^^^^^^^^^^^^^^^^^^ PROMPT 
    // Prompt is a message that tells the user what to enter
    s1 = br.readLine();

    radius = Double.parseDouble(s1);


    System.out.println("Radius of  " + s1);

    
    area = 3.1416 * radius * radius;

    System.out.println("The area of the circle with radius " + radius + " is: " + area);
  }
}

/*
javac RadiusCalculator.java
java RadiusCalculator  
Enter the radius of a cirlce: 12
Radius of: 12
The area of the circle with radius 12 is: 452.3904
*/