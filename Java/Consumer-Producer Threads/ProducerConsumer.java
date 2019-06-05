public class ProducerConsumer {
	public static void main(String args[]){
		SharedVariables sv = new SharedVariables();
		Producer p = new Producer(sv);
		Consumer c = new Consumer(sv);
		p.start();
		c.start();
	}
}