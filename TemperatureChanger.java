/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
    // TODO - scan for input in the format 175F or 18C 
    // TODO - perform correct conversion
    // TODO - print out results to the screen
Scanner scan = new Scanner(System.in);
System.out.println("Please enter the temperature as an int");
double temp= scan.nextDouble();
System.out.println("Please enter whether it is farenheit or celcius using F or C");
String fOrC = scan.next();
if(fOrC.equals("C")){
double tempResult = (double)temp*1.8 + 32;
System.out.println(tempResult + "The the converted temperature");
}else if(fOrC.equals("F")){
double tempResult = (double)(temp - 32) / 1.8;
System.out.println(tempResult + "The the converted temperature");
}


  }
  
}


