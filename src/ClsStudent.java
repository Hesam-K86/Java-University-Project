import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ClsStudent implements IORM {
    private static String[] FileContent;
    private static String FilePath="Files/DbStudent.txt";
    public ClsStudent() {
        try {
            File MyFile = new File(FilePath);
            if (!MyFile.exists()) {
                MyFile.createNewFile();
                FileContent = new String[0];
            } else {
                BufferedReader reader = new BufferedReader(new FileReader(MyFile));
                List<String> linesList = new ArrayList<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    linesList.add(line);
                }
                reader.close();
                FileContent = linesList.toArray(new String[0]);
            }
        } catch (Exception e) {
            e.printStackTrace(); // این خط مهم است!
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
