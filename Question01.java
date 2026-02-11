import java.util.Scanner;
public class Question01{

  public static boolean isPrime(int n){
    if(n <= 1){
      return false;
    }

    for(int i=2; i<=n/2; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static boolean isPerfect(int n){
    int sum = 0;

    for(int i=1; i<n; i++){
      if(n % i == 0){
        sum = sum + i;
      }
    }

    if(sum == n){
      return true;
    }
    else{
      return false;
    }
  }

  public static int special_sum(int n){
    int sum = 0;

    for(int i=1; i<=n; i++){
      if(isPrime(i) == true || isPerfect(i) == true){
        sum = sum + i;
      }
    }
    return sum;
  }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = special_sum(n);
    System.out.println(result);
  }
}
import java.util.Scanner;
public class Question01{

  public static boolean isPrime(int n){
    if(n <= 1){
      return false;
    }

    for(int i=2; i<=n/2; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static boolean isPerfect(int n){
    int sum = 0;

    for(int i=1; i<n; i++){
      if(n % i == 0){
        sum = sum + i;
      }
    }

    if(sum == n){
      return true;
    }
    else{
      return false;
    }
  }

  public static int special_sum(int n){
    int sum = 0;

    for(int i=1; i<=n; i++){
      if(isPrime(i) == true || isPerfect(i) == true){
        sum = sum + i;
      }
    }
    return sum;
  }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = special_sum(n);
    System.out.println(result);
  }
}
