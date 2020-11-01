public class Testerbank{
  public static void main(String[] args){
    BankAccount x = new BankAccount(5213452, "1234");
    BankAccount y = new BankAccount(4357345, "4586");
    System.out.println(x.deposit(100));
    x.setPassword("1222");
    System.out.println(x.transferTo(y, 23.4, "1222"));
  /*  System.out.println("Test 1: Bank Account with accountID 4357345, password 4586, testing methods accountID(), balance(), deposit(-10), deposit(10), withdraw(-10), withdraw(15), withdraw(5), and toString()");
    System.out.println(y.getAccountID());
    System.out.println(y.getBalance());
    System.out.println(y.deposit(-10));
    System.out.println(y.deposit(10));
    System.out.println(y.withdraw(-10));
    System.out.println(y.withdraw(15));
    System.out.println(y.withdraw(5));
    System.out.println(y.toString());
    System.out.println("Test 2: Bank Account with accountID 5213452, passwd 1234, deposits of 234.45 and 121.99, withdraws of 72.30 and 44.29");
    System.out.println(x.deposit(234.45));
    System.out.println(x.deposit(121.99));
    System.out.println(x.withdraw(72.30));
    System.out.println(x.withdraw(44.29));
    System.out.println(x.toString());
    */
  }
}
