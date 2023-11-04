/*
    2. Declare a class called book having author_name as private data member.
    Extend book class to have two sub classes called book_publication &
    paper_publication. Each of these classes have private member called
    title. Write a complete program to show usage of dynamic method
    dispatch (dynamic polymorphism) to display book or paper publications
    of given author.Use command line arguments for inputting data.
*/
class Book{
    private String author_name;
    
}
class Book_publication extends Book{
    private String title;
    void get_data(String author_name,String title)
    {
        this.title=title;
        author_name=author_name;
    }
    void print_data(){
        
    }
}
class Paper_publication extends Book{
    private String title;
    void get_data(String author_name,String title)
    {
        this.title=title;
        author_name=author_name;
    }
    void print_data(){
        
    }
}
class Book_Info{
    public static void main(String[] args) {
        Book b=null;
        Book_publication bp=new Book_publication();
        Paper_publication pp=new Paper_publication();
        
    }
}