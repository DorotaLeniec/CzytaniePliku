package main.java.twoApps;

import java.io.*;

/**
 * Created by RENT on 2017-08-05.
 */
public class FileInputManagement {
    private String fileName;
    private File file;

    public String getFileName() {
        return fileName;
    }

    public File getFile() {
        return file;
    }

    public FileInputManagement(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName+".txt");
    }

    public BufferedReader getBufferedReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            return reader;
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
            return null;
        }
    }

}
