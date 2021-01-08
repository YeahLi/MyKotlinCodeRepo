package com.henry.smartcast;

class Parent {
}

class Child extends Parent {
    public String getName(){
        return "Child";
    }
}

public class Cast {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(((Child)parent).getName());
    }
}
