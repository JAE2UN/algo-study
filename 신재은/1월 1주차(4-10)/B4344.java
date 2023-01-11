package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine()); // tc 개수
		for(int i=0; i<tc; i++) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]); // 학생 수
			int[] score = new int[str.length-1];
			for(int s=1; s<str.length; s++) {
				score[s-1] = Integer.parseInt(str[s]);
			}
			double avg = Arrays.stream(score).average().orElse(0); // 평균
			int up = 0;
			// 평균을 넘는다 = 평균보다 점수가 높아야함(같으면 X)
			for(int s: score) {
				if(s > avg) up += 1;
			}
			String ans = String.format("%.3f", (double)up/n * 100);

			System.out.println(ans + "%");
			
		}
		
	}

}
