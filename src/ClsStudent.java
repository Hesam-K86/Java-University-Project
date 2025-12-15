import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public boolean Insert(){
        try{
            Scanner SC = new Scanner(System.in);
            String FName,CodeD,CodeM,Tel;
            boolean IsComplete=true;
            System.out.println("--------------فرم ثبت نام---------------");
            System.out.println();
            System.out.println("--------------اعلان---------------");
            System.out.println("برای خروج نام کامل را برابر -1 قرار دهید");
            System.out.println("--------------اعلان---------------");
            do{
                System.out.println("نام کامل خود را وارد کنید: ");
                FName=SC.nextLine();
                if(FName.equals("-1"))
                    return false;
                System.out.println("کد دانشجویی خود را وارد کنید: ");
                CodeD=SC.nextLine();
                System.out.println("کد ملی خود را وارد کنید: ");
                CodeM=SC.nextLine();
                System.out.println("شماره تلفن خود را وارد کنید: ");
                Tel=SC.nextLine();
                if(FName.isEmpty()||CodeD.isEmpty()||CodeM.isEmpty()||Tel.isEmpty()){
                    IsComplete=true;
                    System.out.println("--------------اخطار---------------");
                    System.out.println("اطلاعات خود را کامل وارد کنید");
                    System.out.println("--------------اخطار---------------");
                }
                else
                    IsComplete=false;
            }while(IsComplete);
            FileWriter FW = new FileWriter(FilePath,true);
            FW.write("\n"+FName+"|"+CodeD+"|"+CodeM+"|"+Tel);
            FW.close();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
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
        try {
            Scanner SC = new Scanner(System.in);
            System.out.println("--------------فرم جستجو---------------");
            System.out.println();
            System.out.println("کد ملی دانشجو مورد نظر را وارد کنید: ");
            String CodeM = SC.nextLine();
            for (int i = 0; i < FileContent.length; i++) {
                String[] Row = FileContent[i].split("\\|");
                if (Row[2].equals(CodeM)) {
                    System.out.println(FileContent[i]);
                    return true;
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    @Override
    public boolean Show() {
        System.out.println("نمایش دانشجو ها");
        return true;
    }
}
