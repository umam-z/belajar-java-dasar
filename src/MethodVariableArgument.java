public class MethodVariableArgument{
    public static void main(String[] args){
        int[] values = { 80, 50, 50, 50, 80 } ;
        sayCongrats("Eko", values );
        sayCongrats2("Fulan", values);
        sayCongrats2("Suryo", 70, 30, 90, 60, 40);
    }

    static void sayCongrats(String name, int[] values){
        var total = 0;

        for(int value : values){
            total += value;
        }
        var finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ",  Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    static void sayCongrats2(String name, int... values){
        var total = 0;

        for(int value : values){
            total += value;
        }
        var finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ",  Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

}
