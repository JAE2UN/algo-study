package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int ans = 1;
		
		int now = (input % 10) * 10 + (((input / 10) + ((input % 10))) % 10); // 반복문을 돌리기 위해 처음 한 번은 사이클 돌린 값으로 가정
		// 계산한 숫자가 처음 입력값과 같아질때까지 반복
		while(input != now) {
			ans += 1;
			int first = now % 10;
			int second = ((now/10) + first) % 10;
			now = first * 10 + second;
		}
		
		System.out.println(ans);
	}

}
