package entidade;

public class Program {

	public static void main(String[] args) {

		/*
		  Aloca��o do vetor de 4 posi��es do tipo Pessoa
		 */
		Pessoa[] pessoa = new Pessoa[4];
		/* la�o para instanciar a posi��o */
		for (int i = 0; i < pessoa.length; i++) {

			pessoa[i] = new Pessoa();
			pessoa[i].setNome("Nome");
			pessoa[i].setIdade(30);
			pessoa[i].setPeso(83);
		}
		/* la�o para imprimir a estrutura preenchida pessoa */
		/* toString foi criado dentro da classe pessoa */
		for (int i = 0; i < pessoa.length; i++) {
			
			System.out.println(pessoa[i].toString());
		}

	}

}
