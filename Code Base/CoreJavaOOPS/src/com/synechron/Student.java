package com.synechron;

public class Student {
private int studId;
private String studName;
private float marks;
private static String courseName;

public int getStudId() {
    return studId;
}
public void setStudId(int studId) {
    this.studId = studId;
}
public String getStudName() {
    return studName;
}
public void setStudName(String studName) {
    this.studName = studName;
}
public float getMarks() {
    return marks;
}
public void setMarks(float marks) {
    this.marks = marks;
}
public static String getCourseName() {
    return courseName;
}
public static void setCourseName(String courseName) {
    Student.courseName = courseName;
}

}
