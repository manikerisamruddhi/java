import java.util. *;
class JavaBasic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int fact=1;
        int m;
        System.out.println("TAble is: ");

        for(int i=1;i<=10;i++) {
          m=n*i;
          System.out.println(m);

           }

    }
}