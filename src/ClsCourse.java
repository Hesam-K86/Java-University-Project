public class ClsCourse implements IORM {
    @Override
    public boolean Insert(){
        System.out.println("افزودن دوره");
        return true;
    }
    @Override
    public boolean Update(){
        System.out.println("ویرایش دوره");
        return true;
    }
    @Override
    public boolean Delete(){
        System.out.println("حذف دوره");
        return true;
    }
    @Override
    public boolean Search() {
        System.out.println("جستجو دوره");
        return true;
    }
    @Override
    public boolean Show() {
        System.out.println("نمایش دوره ها");
        return true;
    }
}
