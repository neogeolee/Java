package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/05/20
 * 이름 : 이태훈
 * 내용 : TreeSet 실습하기 교재 p757
 */
public class TreeSetTest {
	public static void main(String[] args) {
		
		//TreeSet 생성 및 숫자 데이터 저장
		// - 제일 처음 들어온 데이터를 기준으로 작으면 왼쪽 크면 오른쪽에 저장
		// - 왼쪽에서 오른쪽으로 저장
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for(int num : tree) {
			System.out.print(num+", ");
		}
		
	}//main end

}
