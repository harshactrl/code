
public class OutsideClass {
	
int instanceVariable;
void method(int a) {
	instanceVariable= a;
	System.out.println("m1");
}
void method1() {
	System.out.println(instanceVariable);
}
public static void main(String[] args) {
	OutsideClass ot=new OutsideClass();
	
	ot.method(1202);
	ot.method1();
}
}
