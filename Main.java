public class Main
{
	public static void main(String[] args)
	{

		//Write code to test your implementation.
		Queue<String> Q = new Queue<>();
		Q.enqueue("1");
		Q.enqueue("2");
		System.out.println(Q.toString());

		Stack<String> S = new Stack<>();
		S.push("1");
		S.push("2");
		System.out.println(S.toString());
	}
}