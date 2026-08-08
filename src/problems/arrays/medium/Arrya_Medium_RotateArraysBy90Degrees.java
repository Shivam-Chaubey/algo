package problems.arrays.medium;

import java.util.Arrays;

import common.CommonUtility;

public class Arrya_Medium_RotateArraysBy90Degrees extends CommonUtility{

/*
 * 1 2 3 4
 * 6 7 8 9
 * 8 7 5 4
 * 9 8 6 5
 * 
 * 9 8 6 1
 * 8 7 7 2
 * 6 5 8 3
 * 5 4 9 4
 */
    private static int[][] rotateMatrix(int[][] matrix, int rows, int cols){
        int[][] res = new int[rows][cols];
        int newColPointer = cols-1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res[j][newColPointer] = matrix[i][j];
            }
            newColPointer--;
        }
        return res;
    }

 /*
 * 1 2 3 4
 * 6 7 8 9
 * 8 7 5 4
 * 9 8 6 5
 * 
 * 1 6 8 9
 * 2 7 7 8
 * 3 8 5 6
 * 4 9 4 5
 * 
 * 9 8 6 1
 * 8 7 7 2
 * 6 5 8 3
 * 5 4 9 4
 */
    private static int[][] transposeMatrix(int[][] matrix){
        int temp = 0;
        // transposing matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // revsering rows
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{6,7,8,9},{8,7,5,4},{9,8,6,5}};
        // int[][] res = rotateMatrix(matrix, 4, 4);
        int[][] res = transposeMatrix(matrix);
        for(int i = 0; i < res.length; i++){
            printArray(res[i]);
        }
    }
}