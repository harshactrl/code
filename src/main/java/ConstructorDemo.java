
public class ConstructorDemo {

	int j;
	String k;
	
ConstructorDemo(int  i, String s){
	j=i;
	k=s;
	System.out.println(j+" "+k);
	} 
ConstructorDemo(ConstructorDemo l){
	j=l.j;
	k=l.k;
}
	
public void constructorDemo() {
	System.out.println(j+""+k);
	
}
	public static void main(String[] args) {

		ConstructorDemo cd1= new ConstructorDemo(1, "srikanth");
		ConstructorDemo cd2=new ConstructorDemo(cd1);
		cd1.constructorDemo();
		cd2.constructorDemo();
	}

}
