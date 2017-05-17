package list;

public class Operators {
	public static int calculate(int a, int b, char operator){
		if(operator == '+'){
			return (a + b);
		}
		else if(operator == '-'){
			return (a - b);
		}
		else if(operator == '*'){
			return (a * b);
		}
		else{
			return (a/b);
		}
	}
	
	public static boolean isOperator(char op){
		return (op == '+'||op == '-'||op == '*'||op == '/');
	}
}
