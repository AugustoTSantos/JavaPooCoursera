package Semana1;

import java.text.DecimalFormat;

public class Paciente {
	private String nome;
	private float quilos;
	private float altura;
	private float imc;
	private String resultado;

	
	public Paciente(String nome, float quilos, float altura) {
		this.nome = nome;
		this.quilos = quilos;
		this.altura = altura;
	}
	

	DecimalFormat dFormat = new DecimalFormat("0.00");
	
	public float calculoImc() {
		float imc = quilos / (altura * altura);
		this.imc = imc;
		return imc;
	}

	public void resposta(Paciente paciente) {
		System.out.println(paciente.getNome() + ", Seu IMC é de: " + paciente.calculoImc() + ", " +
		paciente.diagnostico() + "\n");
	}

	public String diagnostico() {
		if(imc < 16) {
			resultado = "Baixo peso muito grave";
		} else if(imc <= 16.99) {
			resultado = "Baixo peso grave";
		} else if(imc <= 18.49) {
			resultado = "Baixo peso";
		} else if(imc <= 24.99) {
			resultado = "Peso normal";
		} else if(imc <= 29.99) {
			resultado = "Sobrepeso";
		} else if(imc <= 34.99) {
			resultado = "Obesidade grau I";
		} else if(imc <= 39.99) {
			resultado = "Obesidade grau II";
		} else {
			resultado = "Obesidade grau III";
		}
		return resultado;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQuilos() {
		return quilos;
	}
	public void setQuilos(float quilos) {
		this.quilos = quilos;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
