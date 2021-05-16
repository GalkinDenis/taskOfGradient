package com.example.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrix {
    public static void main(String[] args) {

        String[] parse;
        int[] str = new int[2];
        long sumRows = 0;
        long sumCols = 0;


        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            parse = bf.readLine().split(" ");

            str[0] = Integer.parseInt(parse[0]);
            str[1] = Integer.parseInt(parse[1]);

            long[][] map = new long[str[1]][str[0]];
            for (int i = 0; i < str[1]; i++) {
                for (int j = 0; j < str[0]; j++) {
                    long x1 = i + 1;
                    long y1 = j + 1;

                    long x2 = str[1] - i;
                    long y2 = str[0] - j;

                    map[i][j] = x1 * y1 * x2 * y2;
                    sumRows += map[i][j];
                }
                System.out.print(sumRows + " ");
                sumRows = 0;
            }

            System.out.println();

            for(int c = 0; c < str[0]; c++){
                for(int z = 0; z < str[1]; z++){
                    sumCols += map[z][c];
                }
                System.out.print(sumCols + " ");
                sumCols = 0;
            }


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
