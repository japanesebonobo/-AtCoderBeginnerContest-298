import java.util.*;

public class B_ColoringMatrix  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A[][] = new int[N][N];
        int B[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        boolean canRotate = false;
        for (int k = 0; k < 4; k++) {
            A = rotate(A, N);
            if (check(A, B, N)) {
                canRotate = true;
                break;
            }
        }
        if (canRotate) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int[][] rotate(int[][] A, int N) {
        int[][] B = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[j][N-1-i] = A[i][j];
            }
        }
        return B;
    }

    private static boolean check(int[][] A, int[][] B, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] == 1 && B[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

