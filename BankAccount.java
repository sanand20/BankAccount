public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    accountID = a;
    password = p;
    balance = 0;
  }
  public int accountID (){
    return accountID;
  }
  public double balance (){
    return balance;
  }
  public String password (){
    return password;
  }



}
