package Simple_code;

public class EnhancedLoop {
    public static void main(String[] args){
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for(int num : numbers){
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum: "+ sum);
    }    
}
