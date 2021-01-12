package object;

class Book implements Cloneable {
  String title;
  String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return title+","+author;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
public class ToStringTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Book book = new Book("Harry", "Joanne");
    Book book2 = new Book("Harry", "Joanne");
    String string = new String("Harry");

    System.out.println(book.hashCode());
    System.out.println(book2.hashCode());
    System.out.println(book);
    System.out.println(string);

    Book book3 = (Book) book.clone();
    Book book4 = book;
    System.out.println(System.identityHashCode(book));
    System.out.println(System.identityHashCode(book3));
    System.out.println(System.identityHashCode(book4));


  }

}
