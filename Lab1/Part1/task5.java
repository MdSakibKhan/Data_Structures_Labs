import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int []a = new int[10];
    for(int i =0; i<a.length; i++){
      int num = scan.nextInt();
        a[num]++;
    }
    for(int i =0; i<a.length; i++){
        System.out.println(i+" was entered "+ a[i]+" times");
    }
  }
}