package cuentasBancarias;

public class CuentaBancaria {
    
	private double saldo;
	
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double obtenerSaldo(){
		return this.saldo;
	}
}
