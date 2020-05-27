package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public synchronized void setNum() {
		//동기화 선언으로 줄을 세움(오직 하나의 쓰레드만 메서드를 실행 가능)
		//동기화 블록선언으로 스레드간 경합을 막는
		num++;
	}

}
