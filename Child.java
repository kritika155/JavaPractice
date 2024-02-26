class Parent{
	void public Print(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void public Print(){
		System.out.println("Child");
	}

}
class Sibling{
		void public  doPrint(){
		Print();
	}
	public static void main(String[]args){

	Parent p=new Parent();
	Parent p1=new Child();
	Child c=new Child();
	p.doPrint();
	p1.doPrint();
	c.doPrint();
	}
}