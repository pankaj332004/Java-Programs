package exceptionhand;

import java.io.*;
import java.io.FileInputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\self\\src\\exceptionhand\\abc.txt");
        // statements
    }
    void saveFile() throws FileNotFoundException{
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
        // statements
    }
}
