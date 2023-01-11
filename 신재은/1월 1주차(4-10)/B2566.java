package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		int[][] arr = new int[9][9];
		int max = -1; // 최댓값
		int r = 0, c = 0; // 최댓값의 행열 좌표
		
		for(int i=0; i<9; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
				if(max < arr[i][j]) {
					max = arr[i][j];
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(max+"\n"+(r+1)+" "+(c+1));
	}

}
