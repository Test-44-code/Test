package algo;

public class Main {

	public static void main(String[] args) 
	{
		Cursor cursor = new Cursor();
		
		cursor.typ("H");
		cursor.typ("a");
		cursor.typ("l");
		cursor.typ("l");
		cursor.typ("o");
		cursor.typ(" ");
		cursor.typ("W");
		cursor.typ("ä");
		cursor.typ("l");
		cursor.typ("t");
		cursor.typ("!");
		
		printCursorState(cursor);
		
		cursor.moveLeft();
		cursor.moveLeft();
		cursor.moveLeft();
		printCursorState(cursor);
		cursor.delete();
		cursor.getRightStack().push("e");
		printCursorState(cursor);
		while (!cursor.getLeftStack().isEmpty()) {
			cursor.moveLeft();
		}
		printCursorState(cursor);
		
	}
	private static void printCursorState(Cursor cursor) 
	{
        System.out.print("Left Stack: ");
        printStack(cursor.getLeftStack());
        System.out.print("| Right Stack: ");
        printStack(cursor.getRightStack());
        System.out.println();
    }

    private static void printStack(Stack<String> stack) 
    {
        Stack<String> temp = new Stack<String>();
        while (!stack.isEmpty()) 
        {
            String c = stack.top();
            System.out.print(c);
            temp.push(c);
            stack.pop();
        }
        while (!temp.isEmpty()) 
        {
            stack.push(temp.top());
            temp.pop();
        }
    }

}
