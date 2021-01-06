package book;

public class StudentBookTest {

  public static void main(String[] args) {
    Student studentKim = new Student(1, "Kim");
    Student studentLee = new Student(2, "Lee");
    Student studentCho = new Student(3, "Cho");

    for (int i = 0; i < 2; i++){
      studentLee.bookArrayList.add(new Book());
      studentLee.bookArrayList.get(i).setBookId(i+1);
      studentLee.bookArrayList.get(i).setBookName("태백산맥");
    }
    for (int i = 0; i < 3; i++){
      studentKim.bookArrayList.add(new Book());
      studentKim.bookArrayList.get(i).setBookId(i+1);
      studentKim.bookArrayList.get(i).setBookName("토지");
    }
    for (int i = 0; i < 6; i++){
      studentCho.bookArrayList.add(new Book());
      studentCho.bookArrayList.get(i).setBookId(i+1);
      studentCho.bookArrayList.get(i).setBookName("해리포터");
    }

    studentLee.showBookInfo();
    studentKim.showBookInfo();
    studentCho.showBookInfo();

  }

}
