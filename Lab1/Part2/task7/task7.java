public class task7{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount();
    BankAccount acc2 = new BankAccount();
    BankAccount acc3 = new BankAccount();
    acc1.setName("sakib");
    acc2.setName("sayem");
    acc3.setName("sajib");
    BankAccount []a= new BankAccount[3];
    a[0]=acc1;
    a[1]=acc2;
    a[2]=acc3;
    acc1.setAccountId("10101");
    acc2.setAccountId("10102");
    acc3.setAccountId("10103");
    acc1.setAddress("Uttara");
    acc2.setAddress("Banani");
    acc3.setAddress("Gulshan");
    acc1.setBalance(20000.50);
    acc2.setBalance(20000.50);
    acc3.setBalance(20000.50);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println("name    AccountId    address   balance");
    for(int i =0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}


