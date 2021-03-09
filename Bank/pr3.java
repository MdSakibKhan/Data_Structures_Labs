import java.util.Scanner;
public class pr3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Bank Sakib = new Bank();
    Bank Sayem = new Bank();
    Bank Rakib = new Bank();
    Bank interest = new Bank();
    Sakib.setBalance(scan.nextDouble());
    Sayem.setBalance(scan.nextDouble());
    Rakib.setBalance(scan.nextDouble());
    Sakib.profit(Sakib.getBalance());
    Sayem.profit(Sayem.getBalance());
    Rakib.profit(Rakib.getBalance());
    System.out.println("Balance with interest for Sakib = "+Sakib.getBalance());
    System.out.println("Balance with interest for Sayem = "+Sayem.getBalance());
    System.out.println("Balance with interest for Rakib = "+Rakib.getBalance());
  }
}