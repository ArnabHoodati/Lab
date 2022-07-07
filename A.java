

/*
@author: Arnab Kumar Hoodati
*/

public class A {	//parent class
	void call_A()
	{
		System.out.println("Java");
	}
}
		class B extends A {	//child class
			void call_B() {
				System.out.println("Python");
		}
	}
		class C extends B {	//child class
			void call_C() {
				System.out.println("C++");
		}
	}

		class Testmultiinherit{	//main class
			public static void main (String args[]) {
				A d = new A();		//obj of child class
				B d1 = new B();
				C d2 = new C();
				d.call_A();	//parent class method
				d1.call_B(); 	//child class method
				d2.call_C(); 	//C class method
			}
		}	

