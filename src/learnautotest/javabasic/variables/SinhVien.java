package learnautotest.javabasic.variables;
public class SinhVien {
   public void showName(){
       //bien local
       String name ="Truong Sinh";
       System.out.println("Name is "+name);
       System.out.println("Age is "+age);
       System.out.println("Sex is "+sex);
         }

         //bien instance
         public int age=25;

   //bien static
    static String sex = "Female";

    public static void main(String[] args) {
        SinhVien svlocal = new SinhVien();
        svlocal.showName();
        System.out.println("Full name is "+ThongTin.fullname);

    }
}
