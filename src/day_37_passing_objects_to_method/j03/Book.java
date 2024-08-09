package day_37_passing_objects_to_method.j03;

public class Book {

    String author;
    String name;
    int year;


    public Book(String author,String name,int year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
