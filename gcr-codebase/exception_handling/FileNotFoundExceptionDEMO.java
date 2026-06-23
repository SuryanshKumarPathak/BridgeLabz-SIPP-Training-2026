//Create a method that just throws FileNotFoundException no use of try catch block


import java.io.*;

public class FileNotFoundExceptionDEMO {
    static void  calculateTotal() {
        File fr = new File ("abc.txt");
        FileReader fr1 = new FileReader(fr);
    }
}