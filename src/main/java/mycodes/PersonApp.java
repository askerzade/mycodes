package mycodes;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "alex";
        p1.age = 33;
        Person p2 = new Person();
        p2.name = "Sergio";
        p2.age = 44;

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}
