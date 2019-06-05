public class Stack {
	int array[] = new int[100];
	int top = 0;
	
	public void push(int i) {
		if (top < 100) {
			array[top] = i;
			top++;
			System.out.println("Successfully Pushed.");
		} else {
			System.out.println("Stack is full.");
		}
	}
	
	public int pop() {
		if (top > 0) {
			top--;
			System.out.println("Successfully Popped.");
			return array[top];
		} else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}
	
	public boolean isFull() {
		return top == array.length;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}


}