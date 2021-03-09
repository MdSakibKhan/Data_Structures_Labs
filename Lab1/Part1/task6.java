import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int []a = new int[5];
    for(int i =0; i<a.length; i++){
      a[i] = scan.nextInt();
    }
    boolean result=true;
    for(int i = 0; i< a.length/2; i++ ){
      if(a[i]!=a[a.length-(i+1)]){
        result=false;
        break;
      }
    }
    if(result==true){
      System.out.println("This is a pelindrom");
    }
    else{
      System.out.println("This is not a pelindrom");
    }
  }
}