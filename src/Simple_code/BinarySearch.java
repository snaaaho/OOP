package Simple_code;

public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 65;
        boolean found = false;

        int left = 0;
        int right = numbers.length -1;
        int mid = -1 ;

        while(left <= right){
            mid = (left + right)/2;
            if(numbers[mid] == target){
                found = true;
                break;
            } else if(numbers[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        if(found){
            System.out.println(target + " found at index: " + mid);
        } else{
            System.out.println(target + " not found");
        }
    }
}
