package Homework5;
import java.io.*;

public class WriterToFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("src/main/java/Homework5/homework5.csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));){
            writer.flush();
            writer.write("value"+ ";" + "value2"
                               + ";" + "value3" + ";"+ System.getProperty("line.separator"));
            writer.write("100" + ";" + "200" + ";" + "123" + "\n");
            writer.write("300" + ";" + "400" + ";" + "500");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}




