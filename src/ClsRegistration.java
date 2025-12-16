public class ClsRegistration implements  IORM{
    @Override
    public boolean Insert(){
        System.out.println("افزودن کلاس");
        return true;
    }
    @Override
    public boolean Update(){
        System.out.println("ویرایش کلاس");
        return true;
    }
    @Override
    public boolean Delete(){
        System.out.println("حذف کلاس");
        return true;
    }
    @Override
    public int Search() {
        System.out.println("جستجو کلاس");
        return -1;
    }
    @Override
    public boolean Show() {
        System.out.println("نمایش کلاس ها با شاگرداش");
        return true;
    }
}
