class stringPool{
	public static void main(String[] args){
		String a="Kritika";
		String b=new String("Kritika");
		if(a.equals(b)){
			System.out.println("same");
		}
		else{
			System.out.println("Different");
			System.out.println(b);
		}
	}
}