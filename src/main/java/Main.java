public class Main {
    public static void main(String[] args) throws InterruptedException {
        // your code here
        SavingsAccount anugAccount = new SavingsAccount();

        Thread t1 = new Thread(()-> anugAccount.deposit(1_000));
        Thread t2 = new Thread(()-> anugAccount.deposit(3_000));
        Thread t3 = new Thread(()-> anugAccount.withdraw(200));
        Thread t4 = new Thread(()-> anugAccount.withdraw(600));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();


        System.out.println("Total in account: " + anugAccount.getTotal());
    }
}
