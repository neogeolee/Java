package p349;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
	}//main end

}
