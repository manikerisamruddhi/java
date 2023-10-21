import java.util. *;
class Large{
   static int a,b,c;
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number:");
    a=sc.nextInt();
    System.out.println("Enter second number:");
    b=sc.nextInt();
    System.out.println("Enter third number:");
    c=sc.nextInt();

    if (a>b && a>c) {
        System.out.println(a+"is greatest number");
    }
    else if(b>a && b>c) {
        System.out.println(b+"is greatest number");
    }
    else {
        System.out.println(c+"is greatest number");
    }
}
}