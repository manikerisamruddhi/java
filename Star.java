import java.util. *;
class Star {
    int n;
    int i,j;
    void Stars() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numner");
    n=sc.nextInt();
    for(i=0;i<n;i++) {
        for(j=0;j<n;j++) {
            System.out.println("*"); 
        }
         System.out.println("\n");
    }
    }
    public static void main(String args[]) {
        Star s=new Star();
        s.Stars();
    } 
}