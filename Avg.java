import java.util. *;
public class Avg {
    public static void main(String args[]) {
        int a,b,c;
    int averg;
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter number:");
            a = sc.nextInt();
            System.out.println("Enter second number:");
            b=sc.nextInt();
            System.out.println("Enter third number:");
            c=sc.nextInt();
            averg = (a+b+c)/3;
            System.out.println("Average is:"+averg);
    }
}