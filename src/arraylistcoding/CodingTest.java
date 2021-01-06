package arraylistcoding;

public class CodingTest {

  public static void main(String[] args) {
    int total = 0;
    String str = "";
    Student student = new Student(1, "leo");

    student.addSubject("math", 100);
    student.addSubject("eng", 50);
    student.addSubject("culture", 80);
    for (int i = 0; i < student.subjectList.size(); i++) {
      int subjectScore = student.subjectList.get(i).getScore();
      total += subjectScore;
      str += student.subjectList.get(i).getSubjectName();
    }

    System.out.println(total);
    System.out.println(str);

  }

}
