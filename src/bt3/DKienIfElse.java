package bt3;

public class DKienIfElse {
public static  int n=100;
public static int XuLy( int i){
    if (n==i){
        System.out.println(" n = i " );
    }
    else if(n>i){
        System.out.println(" n lớn hơn");
    }
    else {
        System.out.println("n bé hơn");
    }
    return i;
}

    public static void main(String[] args) {
        XuLy(10);
    }

}
