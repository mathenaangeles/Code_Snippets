public class LinkedQueue{
	Node head;
	Node tail;
	public void enqueue(Song s){
		Node newNode=new Node (s);
		if (head==null){
			head=newNode;
			tail=newNode;
		} else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public Song dequeue(){
		if (head != null){
			Song result=head.data;
			head=head.next;
			if (head==null){
				tail=null;
			}
			return result;
		} else{
			return null;
		}
	}
	public Song peek(){
		if (head!=null){
			Song result=head.data;
			return result;
		} else {
			return null;
		}
	}
	public void visualizeQueue(){
		Node rover=head;
		int total=0;
		while (rover != null){
			rover.visualizeNode();
			total=total+rover.data.duration;
			rover=rover.next;
		}
		String time=Integer.toString(total);
		System.out.println("Total Playlist Time:"+time+":00");
	}
	public boolean isEmpty(){
		return head ==null;
	}
}