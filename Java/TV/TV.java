import java.util.Scanner;
public class TV{
	int channel;
	int volume;
	boolean turnedOn;
	public TV(){
		channel=2;
		volume=0;
		turnedOn=false;
	}
	public void increaseChannel(){
		if (turnedOn){
			if (channel>=13){
				channel=2;
			} else{
				channel++;
			}
		} 
	}
	public void decreaseChannel(){
		if (turnedOn){
			if (channel<=2){
				channel=13;
			} else{
				channel--;
			}
		} 
	}
	public void increaseVolume(){
		if (volume==0){
			turnedOn=true;
			volume=1;
		} else if (volume<11){
			volume++;
		}
	}
	public void decreaseVolume(){
		if (volume==0){
			turnedOn=false;
		} else if (volume<=11){
			volume--;
		}
	}
	public void display(){
		if (turnedOn){
			System.out.println("Channel:"+channel);
			System.out.println("Volume:"+volume);
		} else{
			System.out.println ("TV is turned off.");
		}
	}
}