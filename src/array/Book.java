package array;

public class Book {
  int id;
  String title;

  public Book(int id, String title) {
    this.id = id;
    this.title = title;
  }

  public void showBookInfo(){
    System.out.println(id + "," + title);
  }
}
