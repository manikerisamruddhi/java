import java.util. *;
class Square {
   public static void main(String args[]) {
    int side,ans;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter side of square:");
     side=sc.nextInt();
     ans=side*side;
     System.out.println("Square of square is :"+ans);
   }
}
