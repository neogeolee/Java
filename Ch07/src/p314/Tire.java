package p314;

public class Tire {
	//�ʵ�
	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
	//������
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation<maxRotation) {
			System.out.println(location+"Tire ���� : "+(maxRotation-accumlatedRotation)+"ȸ");
		}else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
		}
		return false;
		
	}

}
