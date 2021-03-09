import java.util.*;
public class RecursionPractice{
  
  public static void printdigits(int num){
    System.out.println(num);
    if(num<10){
      printdigits(num+1);
    } 
  }
  public static int fibo(int num){
    int result =0;
    
    if(num>2){ 
      result = fibo(num-1)+fibo(num-2);
    }
  return result;
  
  }
  
  
  
  public static void main(String[] args){
    Scanner scann = new Scanner(System.in);
    printdigits(1);
    System.out.println(fibo(3));
  }
  
}