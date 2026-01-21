public class Break {
    public static void main (String[] args){
        var counter = 1;

        while(true){
            System.out.println("Perulangan ke " + counter);
            counter = counter + 1;

            if(counter > 10 ){
                break;
            }
        }

        System.out.println("Perulangan berhenti");
    }
}
