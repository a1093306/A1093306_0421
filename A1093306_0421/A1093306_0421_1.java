import java.util.*;
public class A1093306_0421_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入電子郵件信箱：");
        String mail=input.nextLine();
        if(mail.matches("[a-zA-Z0-9]{1,15}+@gmail.com")||mail.matches("[a-zA-Z0-9]{1,15}+@mailnuk.edu.tw")||mail.matches("[a-zA-Z0-9]{1,15}+@yahoo.com.tw")){
            System.out.println("輸入正確");
        }else{
            System.out.println("輸入錯誤");
        }
    }
}
