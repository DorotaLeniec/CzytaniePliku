package main.java.recordDB;

import java.sql.Timestamp;

/**
 * Created by RENT on 2017-08-07.
 */
public class Tests {
    public static void main(String[] args) {

        DataBase db = new DataBase();
        db.addRecodr("czekolada", 200);
        db.addRecodr("kaczka", 6000);
        db.addRecodr("pomagier", 10000);
        db.addRecodr("mleko", 5000);
        db.addRecodr("zupa", 2000);
        db.addRecodr("knedla", 10000);
        System.out.println(db);
        try{
            Thread.sleep(2000);
            db.refresh();
        }catch (InterruptedException ie){

        }

        System.out.println(db);


    }
}
