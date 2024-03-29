public class PrimeGenertor extends Thread{
	@Override
	public void run(){
		long number=1L;
		while(true){
			if(isPrime(number)){
				System.out.printf("Number %d is Prime",number);
			}
			if(isInterrupted()){
				System.out.printf("The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}
	}
	private boolean isPrime(long number){
		if(number<=2){
			return true;
		}
		for(long i=2;i<number;i++){
			if((number%i)==0){
				return false;
			}
		}
		return true;
	}

public class PrimeGeneratorMain{
	public static void main(String[] args){
		Thread task=new PrimeGenertor();
		task.start();
			
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		task.interrupt();
	}
}
}