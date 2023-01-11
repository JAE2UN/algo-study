package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		int not = 0; // 그룹단어가 아닌 단어의 개수
		boolean[] ascii = new boolean[26];
		for(int i=0; i<no; i++) {
			char now = 0;
			// 이전 글자랑 입력된 글자가 다르면 update, 같으면 넘어감
			// 현재 글자가 이전 글자와 다른데 ascii가 true면 그룹 단어 X
			String word = br.readLine();
			Arrays.fill(ascii, false); // 단어마다 알파벳 아스키 초기화
			for(int c=0; c<word.length(); c++) {
				if(now != word.charAt(c)) {
					now = word.charAt(c);
					// 이미 true면 그룹단어 X -> not+1, false면 true로 바꿔줌
					if(ascii[now-97]) {
						not += 1;
						break;
					} else {
						ascii[now-97] = true;
					}
				}
			}
		}
		System.out.println(no - not);
	}

}
