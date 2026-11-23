package Simple_code;

public class Array {
    public static void main(String[] args){
        int sum = 0;
        double avg = 0;
        int[] numbers = {15, 25, 35, 45, 55};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        avg = (double)sum / numbers.length;

        System.out.println("Sum is: "+ sum);
        System.out.println("Avg is: "+ avg);

    }
}
