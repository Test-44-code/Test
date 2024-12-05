package algo;

public class Knoten<T> 
{
	private T objekt;
	private Knoten<T> next;
	
	public Knoten(T objekt, Knoten<T> next) 
	{
		this.objekt = objekt;
		this.next = next;
	}

	public Knoten<T> getNext() 
	{
		return next;
	}

	public void setNext(Knoten<T> next) 
	{
		this.next = next;
	}
	
	public T getElemnt() 
	{
		return objekt;
	}
	
}
