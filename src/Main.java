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
                case 4: return;
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
        try {
            do {
                IORM Reg=new ClsStudent();
                System.out.println("--------------منو دانشجو---------------");
                System.out.println("1_ افزودن دانشجو");
                System.out.println("2_ ویرایش دانشجو");
                System.out.println("3_ جستجو دانشجو");
                System.out.println("4_ حذف دانشجو");
                System.out.println("5_ لیست دانشجو ها");
                System.out.println("6_ بازگشت");
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
                    case 1:
                        if (Reg.Insert()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("ثبت دانشجو با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 2:
                        if (Reg.Update()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("ویرایش دانشجو با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                            }
                        break;
                    case 3:
                        if (Reg.Search()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("دانشجو پیدا شد");
                            System.out.println("--------------اعلان---------------");
                        }else {
                            System.out.println("--------------اعلان---------------");
                            System.out.println("دانشجویی با کد ملی وارد شده پیدا نشد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 4:
                        if (Reg.Delete()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("حذف دانشجو با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 5: Reg.Show(); break;
                    case 6: return;
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
                System.out.println("5_ نمایش دوره ها");
                System.out.println("6_ بازگشت");
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
                    case 1:
                        if (Reg.Insert()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("ثبت دوره با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 2:
                        if (Reg.Update()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("ویرایش دوره با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 3:
                        if (Reg.Search()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("دوره پیدا شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 4:
                        if (Reg.Delete()){
                            System.out.println("--------------اعلان---------------");
                            System.out.println("حذف دوره با موفقیت انجم شد");
                            System.out.println("--------------اعلان---------------");
                        }
                        break;
                    case 5: Reg.Show(); break;
                    case 6: return;
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