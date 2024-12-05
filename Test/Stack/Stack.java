package algo;

public class Stack<T> 
{
	private Knoten<T> topKnoten = null;
	
	public Stack<T> push(T element)
	{
		topKnoten = new Knoten<T>(element, topKnoten);
		return this;
	}
	public T pop() 
	{
		if(isEmpty())
		{
			throw new IllegalStateException("Stack ist Empty");
		}
		T myFirstElement = topKnoten.getElemnt();
		topKnoten = topKnoten.getNext();
		return myFirstElement;
	}
	
	public boolean isEmpty() 
	{
		return topKnoten == null;
	}
	
	public T top() 
	{
		if(isEmpty())
		{
			throw new IllegalStateException("Stack ist Empty");
		}
		return topKnoten.getElemnt();
	}
}
