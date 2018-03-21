package util;

import java.util.concurrent.TimeUnit;

public class Timer {
	public void delay(int amount){
		try {
			TimeUnit.SECONDS.sleep(amount);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
