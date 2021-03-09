import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int []A= new int[n];
    int []B= new int[n];
    for(int i = 0; i<A.length; i++){
      A[i]= scan.nextInt();
    }
    for(int i = 0; i<B.length; i++){
      B[i]= scan.nextInt();
    }
    int []C = new int [n];
    for(int i =0; i<C.length; i++){
      C[i]= (A[i]*5)-B[i];
      System.out.print(C[i]+" ");
    }
  }
}
