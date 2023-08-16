package InterfaceDemo;

public class NewDemo extends Practice {

	
	public void display()
	{
		System.out.println("This is display method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewDemo d=new NewDemo();
		d.show();
		d.display();
		Practice p=new NewDemo();
		p.show();
		p.display();
		
		
		
	}

}
