public class task13{
  public static int [] removeOdd (int [] input){
    int []r = new int[input.length]; 
    int j=0;
    for(int i =0; i<input.length; i++){
      if(input[i]%2==0){
        r[j]=input[i];
        j++;
      }
    }
    int []p = new int[j];
    for(int i =0; i<p.length; i++){
      p[i]=r[i];
    }
    
    return p;
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}
