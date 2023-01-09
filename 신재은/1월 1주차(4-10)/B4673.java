package algo101;

public class B4673 {
	public static void main(String[] args) {
		// 셀프 넘버가 아닌 생성자가 있는 수들을 표시(true), 아닌 값만 출력
		boolean[] notself = new boolean[10001];
		
		for(int i=1; i<notself.length; i++) {
			// 현재 숫자가 생성자가 되는 수가 범위 내(10000 이하)면 그 수를 true로 변경
			int made = checkSelf(i);
			if(made < notself.length) {
				notself[made] = true;
			}
		}
		// 결과 출력
		for(int i=1; i<notself.length; i++) {
			if(!notself[i]) System.out.println(i);
		}
	}

	private static int checkSelf(int no) {
		// 자기 자신 + 각 자리수의 합으로 숫자를 제작
		int not = no;
		// 각 자리수를 더하고 해당 자리를 없애서 계산할 수 있게 변경
		if(no >= 10000) { // 10000의 자리
			not += no/10000;
			no = no % 10000;
		}
		if(no >= 1000) { // 1000의 자리
			not += no/1000;
			no = no % 1000;
		}
		if(no >= 100) { // 100의 자리
			not += no/100;
			no = no % 100;
		}
		if(no >= 10) { // 10의 자리
			not += no/10;
			no = no % 10;
		}
		// 1의 자리
		not += no/1;

		return not;
	}

}
