
public class CreatingMultipleThreadInSameObj implements Runnable {
	@Override
	public void run() {
		String methodName=Thread.currentThread().getName();
		for(int i=0; i<=10; i++) {
			System.out.println(methodName+" "+i);
			System.out.println("============================");
		}
		
	}

	

	public static void main(String[] args) {
		CreatingMultipleThreadInSameObj obj=new CreatingMultipleThreadInSameObj();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("Dhoni");
		t2.setName("Kohli");
		t1.setPriority(8);
		
		
		t2.setPriority(2);
		
		t1.start();
		t2.start();

	}

	
}
