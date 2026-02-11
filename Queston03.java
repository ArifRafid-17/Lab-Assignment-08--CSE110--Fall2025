import java.util.Scanner;
public class Question03{

  public static double calcTax(int age, double salary){

    if(age < 18){
      return 0.0;
    }
    else if(salary < 10000){
      return 0.0;
    }
    else if(salary <= 20000){
      return salary * 0.07;
    }
    else{
      return salary * 0.14;
    }
  }

  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    double totalTax = 0;

    for(int i=1; i<=12; i++){
      double income = sc.nextDouble();
      double tax = calcTax(age, income);
      System.out.println("Month" + i + " tax: " + tax);
      totalTax = totalTax + tax;
    }

    System.out.println("Total Yearly Tax: " + totalTax);
  }

  public static void main(String [] args){
    calcYearlyTax();
  }
}
