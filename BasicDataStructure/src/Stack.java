
public class Stack {
	int arr[] = null;
	int capacity = 5;
	int top = -1;
	public Stack() {
		this.arr = new int[capacity];
	}
	public void push(int data) {
		if(top+1==capacity) {
			System.out.println("stack is full");
			return;
		}
		arr[++top]=data;
		System.out.println(data+"is inserted data");
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
		}
		int data = arr[top--];
		System.out.println(data+"is removed data");
	}
	public boolean isFull() {
		return (top+1) == capacity;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[top];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack st = new Stack();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
       System.out.println("The peek element"+st.peek());
       System.out.println("The peek element"+st.peek());
       System.out.println("Before removing elements");
       System.out.println("Stack is overflow"+" "+st.isFull());
       System.out.println("Stack is underflow"+" "+st.isEmpty());
       System.out.println("After removing elements");
       st.pop();
       st.pop();
       st.pop();
       st.pop();
       st.pop();
       st.pop();
       
	}

}
