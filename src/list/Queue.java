package list;

public class Queue {
	int i;
	int n;
	char[]queue;
	
	public Queue(int n){
		this.n = n;
		this.queue = new char[n];
		this.i = 0;
	}
		
	boolean full(){
		return (i == n);
	}
	
	boolean empty(){
		return (i == 0);
	}
		
	public void enqueue(char input){
		if(!full()){
			queue[i] = input;
			i++;
		}
		else{
			System.out.println("Stack ist voll");
		}
	}
	
	public void dequeue(){
		if(!empty()){
			i--;
			for(int count = 1; count <= i; count++){
				queue[count-1] = queue[count];
			}
		}
		else{
			System.out.println("Stack ist leer");
		}
	}
	
	public char getTop(){
		return(queue[0]);
	}
	
	public void print(){
		for(int counter = 0; counter < i; counter++){
			System.out.println(queue[counter]);
		}
	}
	
}
