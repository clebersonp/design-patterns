package br.com.alura.strategy.depois.primeiraForma.enuns;

public enum TipoImposto {

	ISS(0.02),
	ICMS(0.04),
	IPI(0.1);
	
	private double percentual;

	private TipoImposto(double percentual) {
		this.percentual = percentual;
	}

	public double getPercentual() {
		return percentual;
	}
}
