import java.awt.*;
import java.io.Console;
import java.util.Scanner;
public class Main {
    private static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            switch(Menu()){
                case 1:StudentAct(); break;
                case 2:CourseAct(); break;
                case 3: return;
                case 4:CourseAct(); return;
            }
        }while(true);
    }
    private static short Menu() {
        short Res = 0;
        try {
            System.out.println("--------------منو اصلی---------------");
            System.out.println("1_ مدیریت هنرجو");
            System.out.println("2_ مدیریت دوره");
            System.out.println("3_ ثبت نام دوره");
            System.out.println("4_ خروج");
            System.out.println("--------------منو اصلی---------------");
            Res = Sc.nextShort();
            Sc.nextLine();
            if (Res > 4 || Res < 1) {
                System.out.println("--------------اخطار---------------");
                System.out.println("گزینه انتخاب شده در لیست نیست");
                System.out.println("--------------اخطار---------------");
                return Menu();
            }
        } catch (Exception e) {
            System.out.println("--------------اخطار---------------");
            System.out.println("گزینه انتخاب شده در لیست نیست");
            System.out.println("--------------اخطار---------------");
            Sc.nextLine();
            return Menu();
        }
        return Res;
    }
    private static void StudentAct(){
        short Res = 0;
        IORM Reg=new ClsStudent();
        try {
            do {
                System.out.println("--------------منو دانشجو---------------");
                System.out.println("1_ افزودن دانشجو");
                System.out.println("2_ ویرایش دانشجو");
                System.out.println("3_ جستجو دانشجو");
                System.out.println("4_ حذف دانشجو");
                System.out.println("5_ بازگشت");
                System.out.println("--------------منو دانشجو---------------");
                Res = Sc.nextShort();
                Sc.nextLine();
                if (Res > 5 || Res < 1) {
                    System.out.println("--------------اخطار---------------");
                    System.out.println("گزینه انتخاب شده در لیست نیست");
                    System.out.println("--------------اخطار---------------");
                    continue;
                }
                switch(Res){
                    case 1: Reg.Insert(); break;
                    case 2: Reg.Update(); break;
                    case 3: Reg.Search(); break;
                    case 4: Reg.Delete(); break;
                    case 5: return;
                }
            } while(true);
        } catch (Exception e) {
            System.out.println("--------------اخطار---------------");
            System.out.println("گزینه انتخاب شده در لیست نیست");
            System.out.println("--------------اخطار---------------");
            Sc.nextLine();
        }
    }
    private static void CourseAct(){
        short Res = 0;
        IORM Reg=new ClsCourse();
        try {
            do {
                System.out.println("--------------منو دوره---------------");
                System.out.println("1_ افزودن دوره");
                System.out.println("2_ ویرایش دوره");
                System.out.println("3_ جستجو دوره");
                System.out.println("4_ حذف دوره");
                System.out.println("5_ بازگشت");
                System.out.println("--------------منو دوره---------------");
                Res = Sc.nextShort();
                Sc.nextLine();
                if (Res > 5 || Res < 1) {
                    System.out.println("--------------اخطار---------------");
                    System.out.println("گزینه انتخاب شده در لیست نیست");
                    System.out.println("--------------اخطار---------------");
                    continue;
                }
                switch(Res){
                    case 1: Reg.Insert(); break;
                    case 2: Reg.Update(); break;
                    case 3: Reg.Search(); break;
                    case 4: Reg.Delete(); break;
                    case 5: return;
                }
            } while(true);
        } catch (Exception e) {
            System.out.println("--------------اخطار---------------");
            System.out.println("گزینه انتخاب شده در لیست نیست");
            System.out.println("--------------اخطار---------------");
            Sc.nextLine();
        }
    }
}