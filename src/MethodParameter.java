public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Moh. Sirajul", "Umam");
        sayHello("Ahmad", "Mustafa");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
