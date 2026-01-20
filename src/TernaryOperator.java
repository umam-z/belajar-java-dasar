public class TernaryOperator {
    public static void main(String[] args){
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        }else{
            ucapan = "Silahkan coba lagi";
        }

        System.out.println(ucapan);

        String ucapan2 = nilai >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi";
        System.out.println(ucapan2);
    }
}
