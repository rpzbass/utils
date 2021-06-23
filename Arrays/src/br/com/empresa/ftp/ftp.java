package br.com.empresa.ftp;

import org.graalvm.compiler.lir.CompositeValue.Component;

@Component
public class ftp {
	
		
	
	/* 
	 * Buscando parametros vindo do aplication properties
	 * 
	 * aplication.properties
	 * ftp.login = mjv
	   ftp.password = 123  
	   
	 */
	

	@Value("${ftp.login}")
	private String login;

	@Value("${ftp.password}")
	private String senha;

	
	
	
	
}
