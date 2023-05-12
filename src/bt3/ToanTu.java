package bt3;

public class ToanTu {
    //toán tử logic
    public static int tt1 = 15;
    public static String auto = "Automation test";
    public static int tt2 = 5;
   public static int number = (tt1 / tt2);

    public  static void ToanTuSoHoc(){
        String s = (tt1 % tt2 == 1) ? "15 chia het cho 5" : "15 khong chia het cho 5";
        System.out.println(s);
        System.out.println("15 chia 5 =" + number);
    }
    public static void ToanTuLogic() {

        // tt1(15)>tt2(5) => true
        System.out.println(tt1 > tt2);

        //tt1 =15 lớn hơn 7 AND tt2(5) lớn hơn tt1(15) là: false
        System.out.println((tt1 > 7) && (tt2 > tt1));



        // so sánh biến number với 3, ở đây number =3 thì true. tt2 > tt1 = false => true
        System.out.println((number == 3) ^ (tt2 > tt1));
        //cả 2 true => false
        System.out.println("15 chia 5 =3, và 5 < 15 thì :");
        System.out.println((number == 3) ^ (tt2 < tt1));
    }

    public static void ToanTuQuanHe() {
        // so sánh biến auto có = chuỗi Automation test không => true
        System.out.println((auto == "Automation test"));

        // biến auto khác chuỗi Automation test => false
        System.out.println((auto != "Automation test"));


    }
    public static void main(String[] args) {
        ToanTuSoHoc();
        ToanTuLogic();
        ToanTuQuanHe();
    }
}