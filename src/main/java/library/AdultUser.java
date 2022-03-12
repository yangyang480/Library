package library;

public class AdultUser implements LibraryUser{
    public int age;
    public String booktype;

    @Override
    public void registerAccount() {
        if (age > 12)
        {
            System.out.println("You have successfully registered under an Adult Account");
        }
        else if (age < 12)
        {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (booktype == "Fiction")
        {
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else
        {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
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
