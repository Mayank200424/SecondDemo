public class p2{
    public static void main(String[] args) {
       int balance = 1000;

       //System.out.println("Deposit : " + Deposit(balance, 1100));
       System.out.println("Deposit : " + withdow(balance, 100));
    }

    public static int Deposit(int balance,int amount){
        if(balance < amount){
            System.out.println("Insufficient balance");
        }else{
            balance = balance + amount;
        }
        return balance;
    }

    public static int withdow(int balance,int amount){
        if(balance < amount){
            System.out.println("Insufficient balance");
            return balance;
        }else{
            balance = balance - amount;
        }
        return balance;
    }
}