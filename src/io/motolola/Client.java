package io.motolola;

public class Client {
    public static void main(String[] args)
    {
        MyGeneric<String> str = new MyGeneric<String>("Daddy");
        System.out.println(str.getT());

        System.out.println("--------------");

        Student student = new Student(23, "Mike", 43);

        MyGeneric<Student> stu = new MyGeneric<>(student);

        System.out.println(stu.getT().toString());
    }
}
