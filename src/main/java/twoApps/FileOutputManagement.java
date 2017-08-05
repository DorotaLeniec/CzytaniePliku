package main.java.twoApps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by RENT on 2017-08-05.
 */
public class FileOutputManagement {
    private String fileName;
    private File file;
    private boolean isReopen;

    public FileOutputManagement(String fileName, boolean isReopen) {
        this.fileName = fileName;
        this.file = new File(fileName+".txt");
        this.isReopen = isReopen;
    }

    public String getFileName() {
        return fileName;
    }

    public PrintWriter getOutputStream(){
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(file,isReopen));
            return writer;
        }catch (FileNotFoundException fnfe){

        }
        return null;
    }




}
