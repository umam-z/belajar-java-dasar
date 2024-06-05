public class MethodReturnValue {
    public static void main(String[] args) {
        byte natural = 10;
        int result = sumOfNaturalNumber(natural);
        System.out.println("The sum of the first " + natural + " natural numbers is " + result);

        int result2 = sum(100, 100);

        System.out.println(result2);

        System.out.println(hitung(100, "+" , 200));
        System.out.println(hitung(100, "-" , 200));
        System.out.println(hitung(100, "/" , 200));

    }

    static int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    static int sumOfNaturalNumber(byte natural) {
        return (natural * (natural + 1)) / 2;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default :
                return 0;
        }
    }
}
