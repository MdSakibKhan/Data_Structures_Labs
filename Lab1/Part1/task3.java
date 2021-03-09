import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int []a = new int[5];
    for(int i =0; i<a.length; i++){
      a[i]= scan.nextInt();
    }
    int temp;
    for(int j =0; j<a.length; j++){
     for(int i =j+1; i<a.length; i++){
       if(a[i]<a[j]){
         temp= a[j];
         a[j]=a[i];
         a[i]= temp;
       }
     }
    }
    for(int i =0; i<a.length; i++){
     System.out.print(a[i]+" ");
    }
    System.out.println();
    for(int i =0; i<a.length; i++){
      if(a[i]%2==0){
      System.out.print(a[i]+" ");
    }
    }
  }
}
    
    