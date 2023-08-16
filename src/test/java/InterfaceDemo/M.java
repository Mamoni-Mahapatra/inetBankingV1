package InterfaceDemo;

public class M implements InterfaceA {
	
	
	public void rollback()
	{
		
		
		System.out.println("This is rollback method in M");
	}
	public void commit()
	{
		System.out.println("This is commit method in M");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceA a=new InterfaceC();
		a.commit();
		a.rollback();
		InterfaceA b=new M();
		b.commit();
		b.rollback();

}
}