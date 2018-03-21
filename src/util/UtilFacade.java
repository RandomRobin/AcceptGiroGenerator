package util;


public class UtilFacade {
	public int getRandomNumber(){
		Timer detimer = new Timer();
		detimer.delay(30);
		return (new RandomNumberGeneratorImpl().generateRandomNumber());
	}
}


