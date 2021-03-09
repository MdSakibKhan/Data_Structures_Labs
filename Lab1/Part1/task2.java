import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int [] a = new int[10];
    for(int i =0; i<a.length; i++){
      a[i]= scan.nextInt();
    }
    int small=a[0];
    int big=a[0];
    int bigIndex=0;
    int smallIndex=0;
    for(int i =1; i<a.length; i++){
      if(a[i]<small){
        small=a[i];
        smallIndex=i;
      }
      if(a[i]>big){
        big=a[i];
        bigIndex=i;
      }
    }
    int temp=a[bigIndex];
    a[bigIndex]=a[smallIndex];
    a[smallIndex]=temp;
    System.out.println(small);
    System.out.println(big);
    for(int i =0; i<a.length; i++){
     System.out.print(a[i]+" ");
    }
  }
}
        
        
    
    
    