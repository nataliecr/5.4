import java.util.Scanner;

public class MilesToKilometers {
  public static void main(String[] args){
    int miles = 1;
    System.out.printf("%-10s%15s\n", "Miles", "Kilometers");
    
    while (miles <= 10){
      double kilometers = miles * 1.609;  
      System.out.printf("%-15d%-1.3f \n", miles, kilometers);
      miles++;
    } // while
    
  } // main 
} // MilesToKilometers
