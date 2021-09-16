/*
name: Harman Kaur
Student id : 200456178
purpose: to create the harness for main class.
 */
public class BooksTestHarness {
    public static void main(String[] args) {
        try{
        Books books = new Books("fiction","Mark zukerberg","paperless",100, true);

        System.out.println(books);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("exception is handled gracefully:"+ex.getMessage());
        }
        System.out.print("Hobbies help us to follow the passion");
            }
}

