package classesinternas;

class Extern {

	static class Intern {

		public void imprimir() {

			System.out.println("Oi");

		}
	}

}

public class ClassesInternasEstaticasTest {

	public static void main(String[] args) {

		Extern.Intern teste = new Extern.Intern();   /* Para invocar uma classe Estatica não é preciso utilizar o New */

		teste.imprimir();
		
		Interna2 in = new Interna2();  /* Nesse utilizamos o new pois estamos no mesmo escopo */
		
		in.imprimir();
		
	}

	static class Interna2 {

		public void imprimir() {

			System.out.println("Oi dentro da interna 2");

		}
	}

}
