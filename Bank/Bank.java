public class Bank{
  public double balance;
  
  public void setBalance(double d){ 
    balance = d; 
  }
  public double getBalance(){ 
    return balance; 
  }
  public void profit(double p){
    if(p>=10000.00) setBalance(p+((p*20.00)/100.00));
    else if(p>=5000.00) setBalance(p+((p*15.00)/100.00));
    else if(p>=1000.00) setBalance(p+((p*10.00)/100.00));
    else if(p>=500) setBalance(p+((p*5.00)/100.00));
  }
}