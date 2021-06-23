package entidade;

public class Program {

	public static void main(String[] args) {

		/*
		  Alocação do vetor de 4 posições do tipo Pessoa
		 */
		Pessoa[] pessoa = new Pessoa[4];
		/* laço para instanciar a posição */
		for (int i = 0; i < pessoa.length; i++) {

			pessoa[i] = new Pessoa();
			pessoa[i].setNome("Nome");
			pessoa[i].setIdade(30);
			pessoa[i].setPeso(83);
		}
		/* laço para imprimir a estrutura preenchida pessoa */
		/* toString foi criado dentro da classe pessoa */
		for (int i = 0; i < pessoa.length; i++) {
			
			System.out.println(pessoa[i].toString());
		}

	}

}
