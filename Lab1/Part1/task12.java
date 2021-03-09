import java.util.Scanner;
public class task12{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int d1 = scan.nextInt();
    int m1 = scan.nextInt();
    int d2 = scan.nextInt();
    int m2 = scan.nextInt();
    System.out.println(methodR(d1,m1,d2,m2));
  }
  public static boolean methodR(int d1,int m1,int d2, int m2){
    boolean r=false;
    if(m1<=m2 && d1<d2){
      r = true;
    }
    return r;
  }
}
