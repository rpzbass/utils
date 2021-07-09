package jdbc.classes;

public class ObjetoNaoEncontrado extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public  ObjetoNaoEncontrado(String erro) {
		System.out.println("Registro não encontrado");
	}
	
}
