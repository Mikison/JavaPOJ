import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3};
        int[] secondArray = {4,5,6};
        System.out.println(sumOfArrays(firstArray,secondArray));
        System.out.println();


        int bok = 4;
        Kwadrat kwadrat = new Kwadrat(bok);
        System.out.println(kwadrat.getObwod());
        System.out.println(kwadrat.getPole());
        System.out.println();


        Punkt punkt = new Punkt(4,5);
        Punkt punkt2 = new Punkt(10,5);
        System.out.println(punkt.calculateDistanceBetweenPointsWithHypot(10, 5));
        System.out.println(punkt.calculateDistanceBetweenPointsWithHypot(punkt2));
        System.out.println();

        MyCircle circle = new MyCircle(5);
        System.out.println(circle.obwodCircle());
        System.out.println(circle.poleCircle());
        System.out.println(circle.srednicaCircle());


        Wiatrak wiatrak = new Wiatrak(Wiatrak.FAST, false, 2, "Czerwony");
        System.out.println(wiatrak.getInformation());
    }


    public static String sumOfArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        if (array1.length != array2.length) return Arrays.toString(newArray);

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] + array2[i];
        }
        return Arrays.toString(newArray);
    }

}