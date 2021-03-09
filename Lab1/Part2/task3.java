import java.util.Scanner;
public class task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x,n=sc.nextInt();
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

