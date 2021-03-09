public class testpalindrom{
  public static void main(String [] args){
    String [] b = {"1","2","2","1"}; // suppose this is the String array - Palindrom
    String [] c = {"1","3","2","1"}; // suppose this is the String array - Not Palindrom
    System.out.println(palindromCheck(b)); // This will print true
    System.out.println(palindromCheck(c)); // This will print false  
    Object e = new String("hi");
  }
  
  // Only this part was to be created by us :)
  
  public static boolean palindromCheck(String[]b){
    for(int i=0 ; i<b.length/2 ; i++){
      if((Character.getNumericValue(b[i].charAt(0)))!=(Character.getNumericValue(b[b.length-1-i].charAt(0)))){
        return false;
      }
    }
    return true;
  }
}