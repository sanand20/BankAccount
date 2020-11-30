public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    accountID = a;
    password = p;
    balance = 0;
  }
  public int getAccountID (){
    return accountID;
  }
  public double getBalance (){
    return balance;
  }
  public void setPassword (String newpass){
    password = newpass;
  }

  public boolean deposit(double amount){
    if (amount<0){
      return false;
    }
    else{
      balance+= amount;
      return true;
    }
  }
  public boolean withdraw(double amount){
    if (amount>balance || amount<0){
      return false;
    }
    else {balance -= amount;
    return true;}
  }
  public String toString(){
    return "#" +accountID + "\t$" + balance;
  }
  private boolean authenticate(String pwd){
    return this.password.equals(password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password)&&withdraw(amount)){
      if (other.deposit(amount)){
        return true;
      }
      else {
        System.out.println ("CRITICAL ERROR! $" + amount + "withdrawn from Account #" + getAccountID() +"Failed to add to Account" + other.getAccountID());
      }
    }
    return false;
  }

}
