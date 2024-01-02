package in.ashokit;

public class Car extends Engine{ // It is example for inheritance
	public void drive() {
		int status = super.start();
		if(status >=1) {
			
			System.out.println("Journey Started...");
			
		}else {
			System.out.println("Engine Having Some Problem...");
		}
		
	}

}
