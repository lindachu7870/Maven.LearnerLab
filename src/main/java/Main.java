public class Main {
    public static void main(String[] args) {

        Person one = new Person(123, "Steven");

        System.out.println(one.getName());
        one.setName("Linda");
        System.out.println(one.getName());
    }
}
