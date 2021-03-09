public class task11{
  public static void main(String[] args){
    int []a= {1,3,5,3,1,9};
    int []b= {9,1,4,5,2,9,3};
    System.out.println(allDigitsOdd(a));
    System.out.println(allDigitsOdd(b));
  }
  public static boolean allDigitsOdd(int []a){
    boolean r=true;
    for(int i=0; i<a.length;i++){
      if((a[i]%2==0)||(a[i]<0)){
        r = false;
        break;
      }
    }
    return r;
  }
}