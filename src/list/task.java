package list;

public class task {
	
	public static Queue postfix (String scanning) {
		Stack s = new Stack(scanning.length());
		Queue q = new Queue(scanning.length());
		for(int i = 0;i < scanning.length(); i++){
			char input = scanning.charAt(i);
			if (Character.isDigit(input)|| Character.isLetter(input)){
				q.enqueue(input);
			}
			else if (Operators.isOperator(input)){
				if(s.empty()){
					s.push(input);
				}
				else{
					if(input == '*' && s.getLast() == '+' || input == '*' && s.getLast() == '-' || 
							input == '/' && s.getLast() == '+' || input == '/' && s.getLast() == '-'){
						s.push(input);
					}
					else if(input == '+' && s.getLast() == '*' || input == '-' && s.getLast() == '*' || 
							input == '+' && s.getLast() == '/' || input == '-' && s.getLast() == '/'){
						q.enqueue(s.getLast());
						s.pop();
						s.push(input);
					}
					else if(input == '+' && s.getLast() == '+' || input == '-' && s.getLast() == '-' || 
							input == '+' && s.getLast() == '-' || input == '-' && s.getLast() == '+'){
						q.enqueue(s.getLast());
						s.pop();
						s.push(input);
					}
					else if(input == '*' && s.getLast() == '*' || input == '/' && s.getLast() == '/'){
						q.enqueue(s.getLast());
						s.pop();
						s.push(input);
					}
				}
			}
		}
		while(!s.empty()){
			q.enqueue(s.getLast());
			s.pop();
		}
		return q;
	}

}
