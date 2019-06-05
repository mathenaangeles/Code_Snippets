//Linked Queue 
public class LinkedQueue{
	Node head;
	Node tail;
	public void enqueue(String i){
		Node node=new Node (i);
		if (head==null){
			head=node;
			tail=node;
		} else{
			tail.next=node;
			tail=node;
		}
	}
	public String dequeue(){
		if (head != null){
			String result=head.data;
			head=head.next;
			if (head==null){
				tail=null;
			}
			return result;
		} else{
			return "Nothing";
		}
	}
	public String peek(){
		if (head!=null){
			String result=head.data;
			return result;
		} else {
			return "Nothing";
		}
	}
	public int visualizeQueue(){
		Node rover=head;
		int counter=0;
		while (rover != null){
			rover.visualizeNode();
			counter=counter+1;
			rover=rover.next;
		}
		return counter;
	}
	public boolean isEmpty(){
		return head ==null;
	}
}