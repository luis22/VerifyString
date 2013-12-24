package br.luis.util;
import java.io.Serializable;



public class VerifyString implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int numero;
	//metodo para verificar se a string contem um número inteiro
	public int verifyString(String value){
		try{
		numero = Integer.parseInt(value);
		}catch(Exception e){
			e.printStackTrace();
			System.exit(1);  
		}
		return numero;
	}
	

}
