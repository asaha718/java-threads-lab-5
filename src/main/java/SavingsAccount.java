public class SavingsAccount {

  private volatile long total = 0;

  public boolean withdraw(long amount) {
    if(total > amount) {
      total -= amount;
      return true;
    }else{
      System.out.println("not enough in account to withdraw");
      System.out.println("Currently in account: " + getTotal());
      return false;
    }
  }

  public void deposit(long amount) {
    total += amount;
  }

  public long getTotal() {
      return total;
  }
}