
public class StaticOverride {
	public static void method11() {
		System.out.println("Static method executed...");
	}
	public void method1() {
		System.out.println("Method executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOverride st=new StaticOverride();
		st.method1();
		st.method11();
	}

}
