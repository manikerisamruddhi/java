import java.util. *;
class Area {
     static int l,b,ans;
    void setDim() {
        System.out.println("Enter length:");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        System.out.println("Enter bredth:");
        b=sc.nextInt();
    }
    void getArea() {
        ans=l*b;
        System.out.println("Area of rectangle is "+ans);
    }
    public static void main(String args[]) {
    Area a=new Area();
    a.setDim();
    a.getArea();
}
}
