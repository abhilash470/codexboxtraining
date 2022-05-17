package javatraining.inheritance;

public class MainPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("abhilash");
        System.out.println( p.getName());
        Person p1 = new Student();
        p1.setId(20221);
        System.out.println(p1.getId());
        Student s1 = new Student();
        System.out.println(s1.getName());

    }
}
