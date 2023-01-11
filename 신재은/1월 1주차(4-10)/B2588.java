package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2588 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String y = br.readLine();
		int xint = Integer.parseInt(x);
		// 각자 계산할 뒤에 입력받은 수만 자리별로 나눠서 배열에 넣어줌
		int[] num = new int[3];
		for(int i=0; i<3; i++) {
			num[i] = y.charAt(i) - '0';
		}
		// 단게별 계산 결과를 stringbuilder에 엔터와 함께 넣어 한 번에 출력
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(xint*num[2])+"\n");
		sb.append(Integer.toString(xint*num[1])+"\n");
		sb.append(Integer.toString(xint*num[0])+"\n");
		sb.append(Integer.toString(xint*Integer.parseInt(y)));
		System.out.println(sb);
		
	}

}
