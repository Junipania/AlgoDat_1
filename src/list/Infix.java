package list;
import java.util.Scanner;

public class Infix {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		Queue q = task.postfix(input);
		System.out.println("Postfix:");
		q.print();
		
		Stacki s = new Stacki(input.length());
		while(!q.empty()){
			if (Character.isDigit(q.getTop())|| Character.isLetter(q.getTop())){
				s.push(Character.getNumericValue(q.getTop()));
				q.dequeue();
			}
			else if(Operators.isOperator(q.getTop())){
				int b = s.getLast();
				s.pop();
				int a = s.getLast();
				s.pop();
				s.push((Operators.calculate(a,b,q.getTop())));
				q.dequeue();
			}
		}
		System.out.println("Ergebnis:");
		s.print();
		
	}

}
