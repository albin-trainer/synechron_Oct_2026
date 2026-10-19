package com.synechron;

public class StaticDemo1 {
public static void main(String[] args) {
    Student.setCourseName("Java");
    Student s1=new Student();
    s1.setStudId(101);
    s1.setStudName("Raj");
    s1.setMarks(90);

    Student s2=new Student();
    s2.setStudId(102);
    s2.setStudName("Sanjay");
    s2.setMarks(99);

    System.out.println(s1.getStudName()+" scored "
    +s1.getMarks()+" "+s1.getCourseName());
      System.out.println(s2.getStudName()+" scored "
    +s2.getMarks()+" "+s2.getCourseName());

}
}
