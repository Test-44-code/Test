package algo;


public class Cursor {
	private Stack<String> leftStack;
	private Stack<String> rightStack;
	
	public Cursor() 
	{
		leftStack = new Stack<>();
		rightStack = new Stack<>();
	}

	public Stack<String> getLeftStack() 
	{
		return leftStack;
	}

	public Stack<String> getRightStack() 
	{
		return rightStack;
	}


	public void moveLeft() 
	{
		if(!leftStack.isEmpty())
		{
			rightStack.push(leftStack.pop());
		}
	}
	public void moveright() 
	{
		if(!rightStack.isEmpty())
		{
			leftStack.push(rightStack.pop());
		}
	}
	
	public void delete() 
	{
		if(!leftStack.isEmpty())
		{
			leftStack.pop();
		}
	}
	
	public void typ(String c) 
	{
		leftStack.push(c);
	}
	
	
}
