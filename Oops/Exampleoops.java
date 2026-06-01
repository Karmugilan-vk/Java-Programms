package Oops;

class Student{
    String name;
    int rollno;
    int marks;
    int age;

    Student(String name, int rollno, int marks, int age) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.age = age; 
    }
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks +  ", Age: " + age);

    }
    public static void main(String[] args) {
        Student obj = new Student("kaushik", 107, 90, 20);
        obj.display();
        Student obj1 = new Student("kar", 105,95 , 20);
        obj1.display();
    }
}
