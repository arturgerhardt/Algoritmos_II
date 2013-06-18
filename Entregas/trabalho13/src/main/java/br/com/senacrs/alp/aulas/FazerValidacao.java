package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class FazerValidacao implements ValidarRequisicaoGet {
	
	private static String GET = "GET / http/1.1";
	private static String HOST = "Host: www.google.com";
	
	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		String[] linha = new String[2];

		boolean resultado = false;

		if(requisicao == null){
			throw new IllegalArgumentException();
		}

		linha = lerReader(requisicao);

		if(linha[0] == null){
			return resultado;
		} else if(linha[1] == null){
			return resultado;
		}
		if(linha[0].equals(GET) && linha[1].equals(HOST)){
			resultado = true;
		}

		return resultado;	
	}
	private String[] lerReader(Reader requisicao) {

		String[] resultado = new String[2];
		BufferedReader buff = new BufferedReader(requisicao);
		
		try {
		
			resultado[0] = buff.readLine();
			resultado[1] = buff.readLine();
		
		} catch (IOException e) {	
				throw new IllegalArgumentException(e);
		}
		
		return resultado;
	}
}
