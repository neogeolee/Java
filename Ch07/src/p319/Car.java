package p319;

import p314.Tire;

public class Car {
	
	//�ʵ�
	Tire[] tires = {
			new Tire("�� ����", 6),
			new Tire("�� ������", 6),
			new Tire("�� ����", 6),
			new Tire("�� ������", 6)
	};
	
	//�޼ҵ�
	int run() {
		System.out.println("|�ڵ����� �޸��ϴ�|");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("|�ڵ����� ����ϴ�|");
	}

}
