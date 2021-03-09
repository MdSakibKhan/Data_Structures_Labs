public class BankAccount{
  String name;
  String id;
  double ammount;
  String address;
  public void setName(String n){
    name = n;
  }
  public void setAccountId(String i){
    id = i;
  }
  public void setAddress(String a){
    address = a;
  }
  public void setBalance(double b){
    ammount = b;
  }
  public void addInterest(){
  ammount = ammount + (ammount * (7.0/100));
  }
  public String toString(){
    return name+"     "+id+"      "+address+"    "+ammount; 
  }
}