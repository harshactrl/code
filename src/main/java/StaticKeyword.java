
public class StaticKeyword {

	int i;
	String name;
	static String village_name="Mulasala";//its creates one time to entire class object
	static {
		System.out.println("Static Block");
		
	}
	
		public void staticMethod(int a, String b)
	{
			i=a;
			name=b;
		System.out.println(i+" "+name+" "+village_name);
	}
	public static void main(String[] args) {

		StaticKeyword sk= new StaticKeyword();
		sk.staticMethod(12124,"srikanth");
		sk.staticMethod(122,"sravan");
	}

}
