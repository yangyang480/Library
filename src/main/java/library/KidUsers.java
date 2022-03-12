package library;

import java.util.Scanner;

public class KidUsers implements LibraryUser{
    public int age;
    public String booktype;

    @Override
    public void registerAccount()
    {
        if (age > 0 && age < 12)
        {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else if (age > 12)
        {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook()
    {
        if (booktype == "Kids")
        {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else
        {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

}
