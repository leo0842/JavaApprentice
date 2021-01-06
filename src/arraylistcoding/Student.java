package arraylistcoding;

import java.util.ArrayList;

public class Student {
  int studentId;
  String studentName;
  ArrayList<Subject> subjectList;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
    subjectList = new ArrayList<Subject>();

  }

  public void addSubject(String name, int score){
    Subject subject = new Subject();
    subject.setScore(score);
    subject.setSubjectName(name);
    subjectList.add(subject);
  }



}
