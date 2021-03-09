import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any number");
    String s = scan.nextLine();
    try{
      method(s);
    }
    catch(EitaIntegerNoyException e){
      System.out.println(e);
    }
  }
  public static void method(String s)throws EitaIntegerNoyException{
    String r;
    boolean t=true;
    for(int i =0; i<s.length(); i++){
      if(s.charAt(i)=='.'){
        r = s+" Kono integer na ";
        t=false;
        break;
      }
    }
    throw new EitaIntegerNoyException(t,s);
  }
}