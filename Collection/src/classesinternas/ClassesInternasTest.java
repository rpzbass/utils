package classesinternas;

public class ClassesInternasTest {

	private String nome = "Dev Training";

	class Interna {

		public void verClasseExterna() {
			System.out.println(nome);
		}
	}
	public static void main(String[] args) {

		ClassesInternasTest externa = new ClassesInternasTest();
		ClassesInternasTest.Interna in = externa.new Interna();
		ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
		Externa.Interna in3 = new Externa().new Interna();
		in.verClasseExterna();
		in2.verClasseExterna();
		in3.verClasseExterna();
	}
}
	class Externa {

		private String nome = "Dev Training";

			class Interna {

				public void verClasseExterna() {
					System.out.println(nome);
		}
	}
}
