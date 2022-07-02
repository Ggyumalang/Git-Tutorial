import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaInput {

	public static void main(String[] args) {
//		1. Swing�� �̿��ؼ� �޴� ���.
//		String myAddress = JOptionPane.showInputDialog("Enter Your Address"); 
//		String bright = JOptionPane.showInputDialog("Enter a Intense of Bright");

//      2. Configuration�� �̿��� Parameter, �Ű������� �޴� ���
		String myAddress = args[0];
		String bright = args[1];
		
		// 1. Elevator Call
		Elevator myElevator = new Elevator(myAddress);
		// ���������� Ÿ�� �ö󰡱� ���� 1������ ���ϴ� �޼ҵ�
		myElevator.callForUp(1);
		
		// 2. Security Off
		Security mySecurity = new Security(myAddress);
		//���� ��ġ off
		mySecurity.off();
		
		// 3. Light On
		Lighting hallLamp = new Lighting(myAddress + " / Hall Lamp");
		// hall�� �ִ� ���� on
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(myAddress + " / Floor Lamp");
		// floor�� �ִ� ���� on
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(myAddress + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		// 4. Aircon On
	}

}
