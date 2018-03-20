package util;

import java.util.concurrent.TimeUnit;

public class UtilFacade {
	public int getRandomNumber(){
		try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (new RandomNumberGeneratorImpl().generateRandomNumber());
	}
}


