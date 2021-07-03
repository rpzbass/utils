package classesinternas;

public class ClassesLocaisTest {

	private String nome = "Chamando nome de dentro da classe interna de forma externa";

	public void fazAlgumaCoisa() {

		class Interna {

			public void imprimeNomeExterna() {
				System.out.println(nome);
			}
		}

		Interna in = new Interna();
		in.imprimeNomeExterna();
	}
	public static void main(String[] args) {

		ClassesLocaisTest externa = new ClassesLocaisTest();
		externa.fazAlgumaCoisa();

	}

}
