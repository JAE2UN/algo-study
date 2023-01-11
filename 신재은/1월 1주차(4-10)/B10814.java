package algo101;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10814 {
	
	// 나이와 이름 2개의 정보를 저장하기 위한 배열 생성, 정렬을 위해 Comparable 상속받아 사용
	static class Info implements Comparable<Info>{
		private int age;
		private String name;
		public Info(int age, String name) {
			this.age = age;
			this.name = name;
		}
		// 나이 오름차순으로 정렬
		@Override
		public int compareTo(Info info) {
			return this.age - info.age;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str;
		Info[] info = new Info[n];
		
		for(int i=0; i<n; i++) {
			str = br.readLine().split(" ");
			info[i] = new Info(Integer.parseInt(str[0]), str[1]);
		}
		
		Arrays.sort(info);
		for(int i=0; i<n; i++) {
			System.out.println(info[i].age+" "+info[i].name);
		}
	}

}
