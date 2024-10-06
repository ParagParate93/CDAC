//Q1 Array implementaion
class StackAr{
	static final int MAX = 10;
	int top;
	int a[] = new int[MAX];
	
	StackAr()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	boolean push(int x)
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}
	
	
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return a[top--];
		
		
	}
	
	int peek()
	{
		return (top < 0)? -1: a[top]; 
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty stack!");
			
		}
		else
			System.out.println("Stack elements are:");
			show(top);
			System.out.println();
	}
	
	void show(int index)
	{
		if(index < 0 )
			return;
		System.out.println(a[index] + "");
		show(index-1);
	}

	public static void main(String args[])
	{
		StackAr s1 = new StackAr();
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		s1. display();		
		
		System.out.println("Popped element = "+s1.pop());
		System.out.println();
		s1. display();
		
	}
}