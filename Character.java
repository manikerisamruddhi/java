import java.util. *;
class Character {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter :");
        int n=sc.nextInt();
        char ch= 'A';
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}