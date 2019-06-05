public class Producer extends Thread{
	SharedVariables sv;
	public Producer(SharedVariables sv){
		this.sv=sv;
	}
	public void run(){
		while (true){
			try {
				int delay = (int)(Math.random()*5000);
				Thread.sleep(delay);
			} catch (Exception e) { }
			int enter = (int)(Math.random()*5000);
			synchronized(sv){
				sv.s.push(enter);
				try{
					sv.notify();
				} catch(Exception e) { }
				
			}
			System.out.println("Producer: " + enter + " has entered the stack.");
		}
	}
}