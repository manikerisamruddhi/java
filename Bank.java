import java.util. *;
class Bank {
    static int balance=500;
    int ch,b;
    Scanner sc=new Scanner(System.in);
    void Deposit() {
        System.out.println("Enter amount:");
        b=sc.nextInt();
        balance=balance+b;
    }
    void Withdraw() {
        System.out.println("Enter amount:");
        b=sc.nextInt();
        balance=balance-b;
    }
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        Bank b1=new Bank();
        System.out.println("Enter choice:");
        ch=sc.nextInt();


        switch(ch) {
            case 1:
            b1.Deposit();
            break;
            case 2:System.out.println("Enter amount:");
            b1.Withdraw();
            break;
            default:System.out.println("Enter correct choice!");
        }
    }
}