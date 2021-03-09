import java.util.Scanner;
public class task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x,n=2.5;
    int a[]=new int[n];
    try{
      a[5]=99;
    }
    catch(Exception e){
      System.out.println("Error on : "+e);
    }
    try{
      x=n/0;
    }
    catch(Exception e){
      System.out.println("Error on : "+e);
    }
    finally{
      System.out.println("The end");
    }
  }
}

