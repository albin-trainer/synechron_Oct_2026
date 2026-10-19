package com.synechron.oops.part1;

public class Book extends Product {
private String genre;
private String authour;
//create only setters
public void setGenre(String genre) {
    this.genre = genre;
}
public void setAuthour(String authour) {
    this.authour = authour;
}
void display(){
    super.display();
    System.out.println("Authour : "+authour);
    System.out.println("Genre : "+genre);
}
}
