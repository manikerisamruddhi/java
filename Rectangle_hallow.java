import java.util. *;
class Rectangle_hollow {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(j==i && j==n ) {
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }