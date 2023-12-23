package LambaAndFunctional;

interface Test1 {
	void print();
}

public class GFG {
	// functional interface parameter is passed
	static void fun(Test1 t) { t.print(); }
	public static void main(String[] args)
	{
		// lambda expression is passed
		// without parameter to functional interface t
		Test1 t=() -> System.out.println("Hello");
//		t.print();
		fun(t);
	}
}

