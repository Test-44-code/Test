package algo2;

public class Main {

	public static void main(String[] args) {
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
		cursor.moveLeft();
		cursor.moveLeft();
		cursor.moveLeft();
		cursor.moveLeft();
		printCursorState(cursor);
		cursor.delete();
		cursor.getRightQueue().enqueue("e");
		printCursorState(cursor);
		cursor.moveLeft();
		cursor.moveLeft();
		cursor.moveLeft();
		printCursorState(cursor);
		
	}
	private static void printCursorState(Cursor cursor) 
	{
        System.out.print("Left Queue: ");
        printQueue(cursor.getLeftQueue());
        System.out.print("| Right Queue: ");
        printQueue(cursor.getRightQueue());
        System.out.println();
    }

    private static void printQueue(Queue<String> queue) 
    {
        Queue<String> temp = new Queue<String>();
        while (!queue.isEmpty()) 
        {
            String c = queue.front();
            System.out.print(c);
            temp.enqueue(c);
            queue.dequeue();
        }
        while (!temp.isEmpty()) 
        {
            queue.enqueue(temp.front());
            temp.dequeue();
        }
    }
}
