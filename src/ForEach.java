public class ForEach {
    public static void main(String[] args){
        String[] names = {
            "Mohammad", "Sirajul", "Umam","Zuper","Programmer"
        };

        for(var i = 0; i < names.length; i += 1){
            System.out.println(names[i]);
        }

        System.out.println("For Each");
        for(var value : names){
            System.out.println(value);
        }
    }
}
