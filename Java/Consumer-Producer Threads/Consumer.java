public class Consumer extends Thread{
	SharedVariables sv;
	public Consumer(SharedVariables sv){
		this.sv=sv;
	}
	public void run(){
		while (true){
			try {
				int delay = (int)(Math.random()*5000);
				Thread.sleep(delay);
			} catch (Exception e) { }
			int get = 0;
			synchronized(sv){
				if (sv.s.isEmpty()){
					System.out.println("Consumer: Zzz...");
					try{
						sv.wait();
					} catch (Exception e) { }
					System.out.println("Consumer: Hello");
				}
				get = sv.s.pop();
			}
			System.out.println("Consumer: " + get + " was popped from the stack.");
		}
	}
}