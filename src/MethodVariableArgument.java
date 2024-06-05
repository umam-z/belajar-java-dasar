public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 80, 80};
        sayCongrats("Ahmad", values);
        sayCongrats("Mustafa", 90, 80, 70, 60, 50);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;

        for (int value : values) {
           total += value; 
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
