package NumberEight;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("NumberEight\\FileWriter.txt");){
            fw.write("Java");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
