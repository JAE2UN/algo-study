package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4948 {
	static int N = -1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while((N = Integer.parseInt(br.readLine())) != 0) {
			// n<input<=2n의 소수의 개수, 에라토스테네스의 체로 풀이
			boolean[] isPrime = new boolean[2*N+1];
			Arrays.fill(isPrime, true); // 소수가 아니면 false로 변경
			isPrime[0] = isPrime[1] = false;
			// 배수를 확인하므로 계산할 값의 1/2 제곱보다 작은 수까지만 확인하면 됨
			for(int i=2; i*i<isPrime.length; i++) {
				if(isPrime[i]) { // 소수이거나 점검 안 된 수 i
					// i의 배수는 전부 소수 X -> false로 변경
					// i^2 미만의 배수는 다른 소수의 배수에 의해 지워지므로 i^2부터 지움
					for(int j=i*i; j<isPrime.length; j+=i) {
						isPrime[j] = false; 
					}
				}
			}
			
			int ans = 0;
			for(int i=N+1; i<=2*N; i++) {
				if(isPrime[i]) ans += 1;
			}
			System.out.println(ans);
		}
		
	}

}
