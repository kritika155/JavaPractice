package gfg.L1;

import javax.sql.rowset.serial.SQLOutputImpl;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person("sachin", 42);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.setName("rohit");
		p.setAge(38);
		p.show();

	}

}
