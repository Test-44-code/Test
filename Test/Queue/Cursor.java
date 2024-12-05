package algo2;


public class Cursor {
	private Queue<String> leftQueue;
	private Queue<String> rightQueue;
	
	public Cursor() 
	{
		leftQueue = new Queue<>();
		rightQueue = new Queue<>();
	}

	public Queue<String> getLeftQueue() 
	{
		return leftQueue;
	}

	public Queue<String> getRightQueue() 
	{
		return rightQueue;
	}


	public void moveLeft() 
	{
		if(!leftQueue.isEmpty())
		{
			rightQueue.enqueue(leftQueue.dequeue());
		}
	}
	public void moveright() 
	{
		if(!rightQueue.isEmpty())
		{
			leftQueue.enqueue(rightQueue.dequeue());
		}
	}
	
	public void delete() 
	{
		if(!leftQueue.isEmpty())
		{
			leftQueue.dequeue();
		}
	}
	
	public void typ(String c) 
	{
		leftQueue.enqueue(c);
	}
	
	
}
