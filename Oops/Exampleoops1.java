package Oops;

class Student{
    String name;
    int rollno;
    int marks;
    int age;
    void display(){
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks +  ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Kaushik";
        obj.rollno = 107;
        obj.marks = 90;
        obj.age = 20;
        obj.display();
        
        Student obj1 = new Student();
        obj1.name = "Kar";
        obj1.rollno = 105;
        obj1.marks = 100;
        obj1.age = 20;
        obj1.display();
    }
}
