import  java.util. *;
class Sum_digit {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int rem,sum=0;
        int mynum=n;
        while(n>0) {  
            rem=n%10;
            n=n/10;
           sum=sum+rem;
        }
        System.out.println("The sum is :"+sum);
    }
}