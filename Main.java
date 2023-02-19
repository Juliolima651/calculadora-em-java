package br.com.julio;



public class Main {

	public static void main(String[] args) {
	
	soma1(10, 20, 30);
	soma2(10, 20);
	subtracao1(30, 20, 10);
	subtracao2(30, 20);
	divisao1(20, 2, 2);
	divisao2(20, 5);
	multiplicacao1(10,20,40);
	multiplicacao2(30,40);
	
	int resultado = (3+(6*8/2)-4);
	System.out.println(resultado);
	}
	static void soma1(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	static void soma2(int x, int y) {
		System.out.println(x + y);
	}
	static void subtracao1(int x, int y, int z) {
		System.out.println(x - y - z);
	}
	static void subtracao2(int x, int y) {
		System.out.println(x - y);
	}
	static void divisao1(int x, int y, int z) {
		System.out.println(x / y / z);
	}
	static void divisao2(int x, int y) {
		System.out.println(x / y);
	}
	static void multiplicacao1(int x, int y, int z) {
		System.out.println(x * y * z);
	}
	static void multiplicacao2(int x, int y) {
		System.out.println(x * y);


	}
	
}
  





