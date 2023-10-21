import java.util. *;
class adult {
    public static void main(String args[]) {
         int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age=sc.nextInt();
       
        if (age >= 18) {
        System.out.println("Adult");
        }
        else {
            System.out.println("Not adult");
        }
    }
}