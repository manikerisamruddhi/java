import java.util.*;
class Even {
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        if (n%2==0) {
            System.out.println("Even number!!");
        }
        else {
            System.out.println("Odd number!!");
        }
    }
}