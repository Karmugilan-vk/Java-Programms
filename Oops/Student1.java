package Oops;

class Student{
    String name ;
    int rollno;
    int marks;
    int age;
    Student(String a, int b, int c, int d) {
        name = a;
        rollno = b;
        marks = c;
        age = d;
    }
    void display(){
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks +", Age: " + age);
    }
        public static void main(String[] args) {
        Student obj = new Student("Kaushik", 107, 90,20);
        obj.display();
        Student obj1 = new Student("kar", 105, 95, 20);
        obj1.display();
        }
}

