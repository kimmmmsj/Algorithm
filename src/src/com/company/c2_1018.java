package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c2_1018 {
    public static int N, M;
    public static String[][] map;
    public static int ans = 0;
    public static String first;
    public static int line = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new String[N][M];


        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = String.valueOf(str.charAt(j));
            }
        }

        first = map[0][0];

//        for(int i = 0; i < M; i++){
//            for(int j = 0; j < N; j++){
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println("\n");
//        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(line % 2 == 0){
                    //짝수 라인
                    if(j % 2 == 0){
                        //첫번째 숫자와 같은 거
                        if(!map[i][j].equals(first)){
                            ans++;
                        }
                    }
                    else{
                        if(map[i][j].equals(first)){
                            ans++;
                        }
                    }
                }
                else{
                    //홀수 라인
                    if(j % 2 == 0){
                        if(map[i][j].equals(first)){
                            ans++;
                        }
                    }
                    else{
                        if(!map[i][j].equals(first)){
                            ans++;
                        }
                    }
                }
            }
            line++;
        }

        System.out.println(ans);

    }
}
