import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int []a = new int[10];
    for(int i =0; i<a.length; i++){
      a[i] = scan.nextInt();
    }
    int n = scan.nextInt();
    if(n >=0 && n <=10){
      for(int j=0; j<a[n]; j++){
        System.out.print("*");
      }
    }
  }
}

