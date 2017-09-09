package cuentasBancarias;

public class CuentaBancaria {
    
	private double saldo;
	
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double obtenerSaldo(){
		return this.saldo;
	}
	
	public void transferirMontoHacia(double monto, CuentaBancaria cuentaDestino){
		this.saldo -= monto;
		cuentaDestino.saldo += monto;
	}
	
	public boolean validarSaldo(double monto){
		return this.saldo >= monto;
	}
}
