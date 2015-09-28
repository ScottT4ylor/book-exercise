/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Scott Taylor
 * @version 9/21/2015
 */
class Book
{
    // Fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    
    //Constructors
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    //Methods
    
    //Getters
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
        public String getRefNumber()
    {
        return refNumber;
    }
    
    //Setters
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Must be at least 3 characters");
        }
    }
    
    //Accessors
        
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        if(refNumber.length() > 0)
        {
            System.out.println(title + " by " + author + " is " + pages + " pages long. Reference number: " + refNumber);
        }
        else
        {
            System.out.println(title + " by " + author + " is " + pages + " pages long. Reference Number: ZZZ");
        }
    }
}
