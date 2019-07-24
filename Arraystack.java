package Stack;

class StackProgram{
	int stack[]=new int[4];
			int currentposition=0;
			public int push(int element) {
				stack[currentposition]=element;
				currentposition++;
				return element;
			}
			public int pop() {
				currentposition--;
				int element=stack[currentposition];
			
				return element;
			}
	}

public class Arraystack {
public static void main(String args[]) {
	StackProgram sp=new StackProgram();
	int result=sp.push(71);
	System.out.println(result);
	int result1=sp.push(52);
	System.out.println(result1);
	int result2=sp.push(42);
	System.out.println(result2);
	int result3=sp.push(64);
	System.out.println(result3);
	int value=sp.pop();
	System.out.println("pop element " +  value  );
}
}
