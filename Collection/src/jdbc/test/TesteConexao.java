package jdbc.test;

import java.util.List;
import java.util.Scanner;

import jdbc.classes.Comprador;
import jdbc.db.CompradorDB;

public class TesteConexao {

	public static void main(String[] args) {

		showMenu();
		//atualizar();
		//deletar();
		
		//Comprador object = (Comprador) encontrarPorNome("Joao");
		//List<Comprador> compList = encontrarPorNome("Ronaldo");
	/*	List<Comprador> resultadoList =  encontrarPorNome();
		
		if(resultadoList != null)
		resultadoList.forEach(System.out::println);	
		*/
		
		selecionarMetadados();
		
		CompradorDB.testTypeScroll();
		
		
		
		//CompradorDB.checkDriverStatus();
		
		
		
		/*	
		for(Comprador comp: compradorResource) {
			System.out.println(comp);
		}
	 */
	
	}

	public static void inserir() {

		Scanner input = new Scanner(System.in);
		System.out.print("Nome : ");
		String nome = input.nextLine();
		System.out.print("cpf : ");
		String cpf = input.nextLine();
		Comprador comprador2 = new Comprador(cpf, nome);
		CompradorDB.save(comprador2);
		input.close();

	}

	public static void deletar() {

		Scanner input = new Scanner(System.in);
		System.out.println("Informe o id do comprador para deletar ");
		Integer id = input.nextInt();
		Comprador comprador = new Comprador();
		comprador.setId(id);
		CompradorDB.delete(comprador);
		input.close();

	}
	
	public static void atualizar() {

		Scanner input = new Scanner(System.in);
		System.out.print("id : ");
		Integer id = input.nextInt();
		System.out.print("Nome : ");
		input.nextLine();
		String nome = input.nextLine();
		System.out.print("cpf : ");
		String cpf = input.nextLine();
		Comprador comprador = new Comprador(id,cpf,nome);
		CompradorDB.update(comprador);
		input.close();

	}
	
	public static List<Comprador> selecionarTodos() {
		
	  return CompradorDB.selectAll();
		
	}
	public static List<Comprador> encontrarPorNome() {
		Scanner input = new Scanner(System.in);
		System.out.print("Buscar nome: ");
		String nome = input.nextLine();
		input.close();
		return CompradorDB.searchByName(nome);
	}
	public static void selecionarMetadados() {
		
		CompradorDB.selectMetadata();
	
	}
	
	

	public static void showMenu() {

		System.out.println("-------------------------------------------------");
		System.out.println("|             CADASTRO TABAJARA vO.o             |");
		System.out.println("|             Modo Raiz  JDBC DRIVER             |");
		System.out.println("-------------------------------------------------\n");

	}

}
