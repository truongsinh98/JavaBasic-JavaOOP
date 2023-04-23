package learnautotest.javabasic.variables;

public class Calculator {
    public static int Tinhtong() {
        int sum, a = 3, b = 4;
        sum = a + b;
        return sum;
    }

    public static double TinhTich(double a, double b) {

        return a*b;
    }

    public static void main(String[] args) {
        Tinhtong();
        System.out.println("Tong la: " + Tinhtong());

        System.out.println("Tich la: " + TinhTich(7.5,8.5  ));

    }
}
