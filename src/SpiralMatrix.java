import java.util.Scanner;

public class SpiralMatrix {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
        
        StringBuilder result = new StringBuilder();
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i]).append(" ");
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(" ");
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }
        
        System.out.println(result.toString().trim());
        sc.close();
    }
    
}
