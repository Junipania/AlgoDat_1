package list;

public class Stack {
	int i;
	int n;
	char[]stack;
	
	public Stack(int n){
		this.n = n;
		this.stack = new char[n];
		this.i = -1;
	}
		
	boolean full(){
		return (i == n-1);
	}
	
	boolean empty(){
		return (i == -1);
	}
		
	public void push(char operator){
		if(!full()){
			++i;
			stack[i] = operator;
		}
		else{
			System.out.println("Stack ist voll");
		}
	}
	
	public void pop(){
		if(!empty()){
			i--;
		}
		else{
			System.out.println("Stack ist leer");
		}
	}
	
	public char getLast(){
		return (stack[i]);
	}
	
	public void print(){
		for(int counter = 0; counter <= i; counter++){
			System.out.println(stack[counter]);
		}
	}
}
