package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by LordwolF on 8/9/2016.
 */
public class App {
    public static void main(String[] args) {

        File file = new File("test.txt");

        // much better to show the end user a notice instead of a stacktrace
        //hence the sysout instead of stacktrace
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found:  " + file.toString());
        }

        System.out.println("Finished!!");
    }
}
