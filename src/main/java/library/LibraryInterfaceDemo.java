package library;

import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers ku = new KidUsers();
        ku.setAge(10);
        ku.setAge(18);
        ku.registerAccount();
        ku.setBooktype("Kids");
        ku.setBooktype("Fiction");
        ku.requestBook();

        AdultUser au = new AdultUser(); //object
        au.setAge(5); 
        au.setAge(23);
        au.registerAccount(); //invoke
        au.setBooktype("Kids");
        au.setBooktype("Fiction");
        au.requestBook(); //invoke the method

    }
}
