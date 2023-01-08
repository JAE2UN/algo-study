package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		int need = Integer.parseInt(br.readLine());
		
		int h = 0; // 결과 시
		int m = 0; // 결과 분
		int plus = min + need;
		h = plus / 60;
		m = plus % 60;
		
		StringBuilder sb = new StringBuilder();
		// 24 이상이면 다시 0부터 시작해야함
		if(hour+h >= 24) {
			sb.append(hour+h - 24); //24<=총합<48이므로 24만 빼서 계산
		} else {
			sb.append(hour+h);
		}
		sb.append(" " + m);
		System.out.println(sb);
		
	}

}
