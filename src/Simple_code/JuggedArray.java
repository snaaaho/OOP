package Simple_code;

public class JuggedArray {
    public static void main(String[] args){
        int[][] matrix = {
                {5, 10},
                {15, 20, 25},
                {30, 35, 40, 45}
        };
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum: "+ sum);
    }
}
