import  java.util. *;
class Palindrom {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int rem,reverse=0;
        int mynum=n;
        while(n>0) {  
            rem=n%10;
            n=n/10;
            reverse=reverse*10+rem;
        }
        if(mynum==reverse) {
            System.out.println(mynum+" is palindrom");
        }
        else {
            System.out.println("not palindrom!!");
        }
    }
}