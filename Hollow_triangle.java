import  java.util. *;
class Hollow_triangle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++) {
                if(i==n || j==1 || i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
}
