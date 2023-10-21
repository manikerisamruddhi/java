import java.util. *;
class Tax {
    public static void main(String args[]) {
    int income,tax;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter income");
    income=sc.nextInt();
    if(income < 500000) {
        System.out.println("No any tax!!");
    }
    else if(income >500000 && income < 1000000) {
        tax=(int) (income*(20/100));
        System.out.println("Tax:"+tax);
    }
    else if(income > 3000000) {
        tax=(int) income*(30/100);
        System.out.println("Tax:"+tax);
    }
}
}