package Simple_code;

public class ArrayMinMax {
    public static void main(String[] args){
        int[] numbers = {15, 8, 42, 3, 27, 19};
        int min = numbers[0];
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);
    }
}
