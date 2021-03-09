package lab2;
public class LinearArray{
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 }
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 }
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
  }
  
  
  public static int[] copyArray(int a[], int len){
    int [] r = new int[len];
    for(int i =0; i < len; i++){
      r[i]=a[i];
    }
    return r;
  }
  public static void printArray(int [] b){
    for(int i =0; i<b.length; i++){
      System.out.print(b[i]+" ");
    }
  }
  public static void printReverse(int []a){
    System.out.println();
    for(int i = a.length-1; i>=0; i--){
      System.out.print(a[i]+" ");
    }
  }
  public static void reverseArray(int b[]){
    int [] rv = new int[b.length];
    for(int i =0; i<rv.length; i++){
      rv[i]=b[b.length-(i+1)];
    }
    for(int i =0; i<b.length; i++){
      b[i]=rv[i];
    }
    
  }
  public static int[] shiftLeft(int a[],  int len){
    int j = 1;
    int sf[] = new int[a.length];
    for(int i =0; i<len; i++){
      sf[i]=a[a.length-j];
      j++;
    }
    return sf;  
  }
  public static int[] rotateLeft(int []b,int len){
    System.out.println();
    int []b2 = new int[b.length];
    for(int i =0; i<len; i++){
      b2[i]=b[len+i];
      b2[i+len]=b[i];
    }
    return b2;
  }
  public static int[] shiftRight(int a[],  int len){
    System.out.println();
    int j = 1;
    int sf[] = new int[a.length];
    for(int i =0; i<len; i++){
      sf[i+len]=a[len+i];
      j++;
    }
    return sf;  
  }
  public static int[] rotateRight(int []b,int len){
    System.out.println();
    int []b2 = new int[b.length];
    for(int i =0; i<len; i++){
      b2[i]=b[len+i];
      b2[i+len]=b[i];
    }
    return b2;
  }
  public static boolean insert(int [] arr, int size, int elem, int index){
    System.out.println();
    boolean r = true;
    int sz=size;
    int j=1;
    int vl;
    if(index<arr.length && size<arr.length){
      for(int i = size; i>index; i--){
        arr[i]=arr[size-j];
        j++;
      }
      arr[index]=elem;
      System.out.println("Number of elements after insertion: "+ (++sz)); 
    }
    else{
      System.out.println("No space Left");
      r=false;
    }
    return r;
  }
  public static boolean removeAll(int [] arr, int size, int elem){
    System.out.println();
    boolean r=false;
    int idx=0;
    int j=0;
    int nr[];
    for(int i =0; i<arr.length; i++){
      if(elem==arr[i]){
        idx++;
        r=true;
      }
    }
    if(r==true){
      nr = new int[arr.length];
      for(int i = 0; i<arr.length; i++){
        if(arr[i]!=elem){
          nr[j]=arr[i];
          j++;
        }
      }
      for(int k = 0; k<nr.length; k++){
        arr[k]=nr[k];
      }
    }
    return r;
  }
} 