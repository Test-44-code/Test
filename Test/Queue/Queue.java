package algo2;

public class Queue<T>
{
	private Knoten<T> head = null;
	private Knoten<T> tail = null;
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	public T front()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("Queue is empty");
		}
		return head.getElemnt();
	}
	
	public Queue<T> enqueue(T value) 
	{
		Knoten<T> neuerKnoten = new Knoten<T>(value, null);
		if(isEmpty())
		{
			head = neuerKnoten;
		}
		else 
		{
			tail.setNext(neuerKnoten);
		}
		tail = neuerKnoten;
		return this;
	}
	
	public T dequeue() 
	{
		if(isEmpty())
		{
			throw new IllegalStateException();
		}
		T elemnt = head.getElemnt();
		head = head.getNext();
		if(head == null)
		{
			tail = null;
		}
		return elemnt;
	}
	
}
