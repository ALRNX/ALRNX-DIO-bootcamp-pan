package br.com.dio.sistemaSmartTV;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class Usuario {

	public static void main(String[] args) {

		PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

		
		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		out.println("Canal atual: " + smartTv.canal);
		
		smartTv.mudarCanal(13);
		out.println("Canal atual: " + smartTv.canal);
		
		out.println("Volume atual: " +smartTv.volume);
		
		out.println("TV ligada ? " + smartTv.ligada);
		out.println("Volume atual: " +smartTv.volume);
		
		smartTv.ligar();
		out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
		
		smartTv.desligar();
		out.println("Novo Status -> TV ligada ? " + smartTv.ligada);
	}

}
