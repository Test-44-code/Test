package zusatz;

public class Main {

	public static void main(String[] args) 
	{
		Queue<Integer> queue = new Queue<Integer>();
		int [] input = {1,2,3,4,5,6,7,8};
		for (int i = 0; i < input.length / 2; i++) 
		{
			queue.enqueue(input[i*2]);
			queue.enqueue(input[i*2 + 1]);
			
			System.out.println("Hinzufügt " + input[i*2] + " und " +input[i*2+1]);
			System.out.println("Entfernt " + queue.dequeue());
			System.out.println("Head " + queue.front());
		}
		System.out.println("Verbleibende Elemente: ");
		while (!queue.isEmpty()) 
		{
			System.out.print(queue.dequeue() + " ");
		}
	}

}
