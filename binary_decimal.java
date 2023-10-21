import java.util. *;
class binary_decimal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number:");
        int n=sc.nextInt();
        int i,ld,dec=0,p=0;
        while(n>0) {
            ld=n%10;
            dec=dec+(ld*(int) Math.pow(2,p));
            p++;
            n=n/10;
        }
        System.out.println("The decimal number is:"+dec);
    }
}