package br.com.dio.sistemaSmartTV;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class SmartTv {
	
	PrintStream out = new PrintStream(System.out, true, UTF_8); // true = autoflush

	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;	
		out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		out.println("Diminuindo o volume para: " + volume);
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}

}
