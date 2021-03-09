public class EitaIntegerNoyException extends Exception{
  boolean r2;
  String s2;
  public EitaIntegerNoyException(boolean t,String s){
    r2=t;
    s2=s;
  }
  public String toString(){
    if(r2==false){
      s2="Eita integer noy";
    }
    return s2;
  }
}