package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dice = br.readLine().split(" ");
		// 값이 같으면 true, 다르면 false를 입력하는 배열 boolean[] check
		boolean[] check = new boolean[3]; // default가 false
		// true인 경우 같은 수와 true의 개수를 업데이트
		int no = Math.max(Math.max(Integer.parseInt(dice[0]), Integer.parseInt(dice[1])), Integer.parseInt(dice[2])); // 셋 중 최대값으로 초기화
		int tno = 0;
		if(dice[0].equals(dice[1])) {
			check[0] = true;
			no = Integer.parseInt(dice[0]);
			tno++;
		}
		if(dice[1].equals(dice[2])) {
			check[1] = true;
			no = Integer.parseInt(dice[1]);
			tno++;
		}
		if(dice[2].equals(dice[0])) {
			check[2] = true;
			no = Integer.parseInt(dice[2]);
			tno++;
		}
		
		// true 개수에 따라 맞는 상금 출력(2는 불가능)
		switch(tno) {
		case 1: // 2개의 수가 같은 경우
			System.out.println(no*100 + 1000);
			break;
		case 3: // 모두 같은 경우
			System.out.println(no*1000 + 10000);
			break;
			default: // 셋 다 다른 경우(0)
				System.out.println(no*100);
				break;
		}
		
	}

}
