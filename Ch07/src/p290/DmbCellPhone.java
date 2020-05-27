package p290;

public class DmbCellPhone extends CellPhone {
	
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드
	public void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신시작합니다.");
	}
	public void changeChannelDmb(int channel) {
		System.out.println("채널"+channel+"번 으로 바꿉니다");
	}
	public void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}

}
