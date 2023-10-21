import java.util. *;
class Rectangle_hollow {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows :");
        int n=sc.nextInt();
        System.out.println("Enter column :");
        int m=sc.nextInt(n);
        for(int i=n;i>=;i) {
            for(int j=1;j<=m;j++) {
                if(i==1 || i==n || j==1 || j==m ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}