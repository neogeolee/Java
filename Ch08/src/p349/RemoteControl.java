package p349;

public interface RemoteControl {
	
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
		}else {
			System.out.println("���������մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
