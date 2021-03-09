import java.util.Scanner;
public class task4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int [] a = new int[n];
    for(int i=0; i<a.length;i++){
      int num = scan.nextInt();
      for(int j=0; j<a.length;j++){
        if(num==a[j]){
          System.out.println("Another number");
          a[i]=scan.nextInt();
        }
        else{
          a[i]=num;
          break;
        }
      }
    }
  }
}