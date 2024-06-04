public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Mohammad";
        stringArray[1] = "Sirajul";
        stringArray[2] = "Umam";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        
        stringArray[0] = "Ahmad";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[4];

        String[] namaNama = {
            "Mohammad", "Sirajul", "Umam"
        };
        namaNama[0] = null;

        int[] arrayInt = new int[]{
            1,5,2,3
        };

        long[] arrayLong = {
            10L,50L,89L
        };
        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        String[][] members = {
            {"Mohammad", "Sirajul", "Umam"},
            {"Ahmad", "Mutafa"},
            {"Hasan"},
        };

        System.out.println(members[0][2]);
        System.out.println(members[1][1]);
        System.out.println(members[2]);
    }
}
