package algo101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 다음줄이 null이면 에러나므로 ""인 string에 입력을 넣어주는 식으로 처리해야 에러가 나지 않는다.
		String input = "";
		while((input = br.readLine()) != null) {
			String[] str = input.split(" ");
			System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
		}
	}

}
