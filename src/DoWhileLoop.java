public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

        do {
            System.out.println("Perulangan Ke - " + counter);
            counter++;
        } while (counter <= 10);

        System.out.println(counter);
    }
}