package test08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTest8 {
	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size()==6) {
				break;
			}
		}
		//로또 번호 정렬
		TreeSet treeSet = new TreeSet<>(lottoSet);
		
		//로또번호 출력
		Iterator iter = treeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}//main end

}
