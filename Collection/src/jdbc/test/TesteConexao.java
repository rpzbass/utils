package jdbc.test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import jdbc.classes.Comprador;
import jdbc.db.CompradorDB;


class CompareTo implements Comparator<Comprador> {

	@Override
	public int compare(Comprador o1, Comprador o2) {
		
		return o1.getCpf().compareTo(o2.getCpf());
	}
	
}


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
		
		/*for (Comprador comp:  selecionarTodos()) {
			System.out.println(comp);
		}
		*/
		//selecionarMetadados();
		
		//CompradorDB.testTypeScroll();
		
		//CompradorDB.updateNomeToLowerCase();
			
		/*List<Comprador> resultSet = CompradorDB.searchByNamePreparementStatement("Ronaldo");
		
		//resultSet.forEach(System.out::println);
		
		for(Comprador line: resultSet) {
			System.out.println(line);
		}*/
	
		/*for(Comprador line :CompradorDB.searchByNameCallableStatement("A"))
		{
			System.out.println(line);
		}
		*/
		
	//	CompradorDB.updatePreparedStatement(new Comprador(22,"Prepared Statement da silva","011.011.011-01"));
		
		//selecionarTodos().forEach(System.out::println);		
		
		//CompradorDB.checkDriverStatus();
		
		/*	
		for(Comprador comp: compradorResource) {
			System.out.println(comp);
		}
	 */
	/*
		List<Comprador> list_withjdbc =  CompradorDB.searchByNameRowSet("%a%");
		
		System.out.println("\n");
		for(Comprador line : list_withjdbc) {
			System.out.println(line);
		}
		
		*/
		/*Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		System.out.println("informe o valor: ");
		double x = in.nextDouble(200.0000);
		double [] n = new double[100];
		
		n[0] = x;
		
		for(int i = 1;i<100;i++ ) {
			
			n[i] = n[i-1]/2;
			
		}	
	
		for (int i =0;i< n.length;i++) {  	
			
			System.out.printf(String.format("N[" + i + "] = %.4f \n", n[i]));
			
		} 
		in.close();
	
		*/
		/*Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor:  ");
		double x = input.nextDouble()/10000;
		BigDecimal bD= new BigDecimal(x);
		BigDecimal round = bD.round(new MathContext(1, RoundingMode.HALF_EVEN));
		System.out.println(round);
		System.out.println(bD);
		input.close();
		*/
		 	Locale.setDefault(Locale.US);
	        Scanner leitor = new Scanner(System.in);
	        double x = leitor.nextDouble();
	        BigDecimal[] n = new BigDecimal[100];
	        n[0] = new BigDecimal(x).round(new MathContext(1,RoundingMode.HALF_UP));
	        
	        for (int i=1;i<100;i++) {
	        	  BigDecimal temp = n[i-1];
	        	  n[i] = temp.divide(new BigDecimal("2.00"),MathContext.UNLIMITED);
	        }
	        
	        for (int i=1;i<100;i++) {
	        	System.out.println(String.format("N["+ i + "] = %.4f \n", n[i].setScale(6,RoundingMode.HALF_EVEN)));
	        }
	       
	       
	        
	        
	        
	        leitor.close(); 

		

		
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
