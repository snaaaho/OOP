package Simple_code;

public class ArraySearch {
    public static void main(String[] args){
        int[] numbers = {12, 25, 35, 48, 60, 75};
        int target = 35;
        boolean found = false;
        int idx = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                idx = i;
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(target + " found at index: "+ idx);
        } else{
            System.out.println(target + " Not found");
        }
    }
}