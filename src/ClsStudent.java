import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class ClsStudent implements IORM {
    private static String[] FileContent;
    private static String FilePath="Files/DbStudent.txt";
    public ClsStudent() {
        try {
            File MyFile = new File(FilePath);
            if(!MyFile.exists()){
               MyFile.createNewFile();
            }else {
                FileReader FR=new FileReader(FilePath);
                FileContent =FR.readAllLines().toArray(new String[FileContent.length]);
//                System.out.println(ّFileContent[0].toString());
            }
        } catch (Exception e) {

        }
    }
    @Override
    public boolean Insert(){
        System.out.println("افزودن دانشجو");
        return true;
    }
    @Override
    public boolean Update(){
        System.out.println("ویرایش دانشجو");
        return true;
    }
    @Override
    public boolean Delete(){
        System.out.println("حذف دانشجو");
        return true;
    }
    @Override
    public boolean Search() {
        System.out.println("جستجو دانشجو");
        return true;
    }
    @Override
    public boolean Show() {
        System.out.println("نمایش دانشجو ها");
        return true;
    }
}
