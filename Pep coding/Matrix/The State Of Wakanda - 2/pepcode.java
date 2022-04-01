import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void traverse(int r,int c,int [][] mat) {
        while(c<mat.length){
            System.out.println(mat[r][c]);
            r++;c++;
        }
    }

    public static void main(String[] args) throws Exception {
        //input
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [][] mat = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            traverse(0,i,mat);
        }



    }

}
