import  java.util. *;
class decimal_binary {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int n=sc.nextInt();
        int bin_num=0,rem;
        int p=0;
        while(n>0) {
            rem=n%2;
            bin_num=bin_num+rem*(int) Math.pow(10,p);
            p++;
            n=n/2;
        }
        System.out.println("Binary number is:"+bin_num);
    }
}