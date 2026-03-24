package loopdiamond;
public class LoopDiamond {
public static void main(String[] args) {
        int size = 5; 
        char[][] diamond = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                diamond[i][j] = ' ';
            }
        }
        int mid = size / 2;
        for (int i = 0; i <= mid; i++) {
            diamond[i][mid - i] = '*';
            diamond[i][mid + i] = '*';
        } 
        for (int i = mid + 1; i < size; i++) {
            diamond[i][i - mid] = '*';
            diamond[i][size - (i - mid) - 1] = '*';
        }
        for (char[] row : diamond) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }  
}
