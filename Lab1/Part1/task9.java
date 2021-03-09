import java.util.Scanner;
public class task9{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    int []a = new int[10];
    for(int i =0; i<a.length; i++){
      a[i]=scan.nextInt();
    }
    sqr(a);
  }
  public static void sqr(int []a){
    for(int i =0; i<a.length; i++){
      System.out.print((int)Math.pow(a[i],2)+" ");
    }
  }
}

