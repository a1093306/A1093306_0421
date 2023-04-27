import java.util.*;
public class A1093306_0421_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入日期(西元年/月/日、月/日/西元年)：");
        String date=input.nextLine();
        if(date.matches("[0-9]{4}/[0]{1}[1-9]{1}/[0-3]{1}[0-9]{1}")||date.matches("[0-3]{1}[0-9]{1}/[0]{1}[1-9]{1}/[0-9]{4}")
        ||date.matches("[0-9]{4}/[1]{1}[0-2]{1}/[0-3]{1}[0-9]{1}")||date.matches("[0-3]{1}[0-9]{1}/[1]{1}[1-9]{1}/[0-9]{4}")){
            System.out.println("輸入日期為："+date);
        }else{
            System.out.println("輸入錯誤");
        }
    }
}
