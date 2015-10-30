package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of Strings");
        int stringNumber = Integer.parseInt(reader.readLine());

        String[] firstArray = createArray(stringNumber);
        System.out.println("Here is initial array:");
        printArray(firstArray);
        String[] secondArray = sortArray(firstArray);
        System.out.println("Here is sorted array:");
        printArray(secondArray);

    }

    public static String[] createArray(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + (i + 1) + " string");
            array[i] = reader.readLine();
        }

        return array;
    }

    public static String[] sortArray(String[] array){
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j].length() > array[j+1].length()){
                    String buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }

        }
        return array;
    }

    public static void printArray(String[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
}