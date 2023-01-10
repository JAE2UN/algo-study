package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		// 3kg, 5kg로 구성된 설탕봉지만 존재
		// 순서: 1) 5의 배수, 2) 3, 5 둘 다 사용하는 경우, 3) 3의 배수, 4) 불가능(3, 5 어느쪽으로도 결론 안 남)
		if(n%5 == 0) ans = n / 5;
		else {
			while(n > 0) {
				// 5로 나눌 수 있을때까지는 3으로 나눠야함 -> 3씩 빼가며 5로 나눠지는지 체크
				n -= 3;
				ans += 1;
				if(n%5 == 0) {
					ans += n / 5;
					n = n % 5;
				}
			}
			if(n != 0) ans = -1; // 0이 아닌 1, 2일 경우
		}
		System.out.println(ans);
		
	}

}
