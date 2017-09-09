package cuentasBancarias;

public class CuentaBancaria {
    
	private double saldo;
	private boolean estadoTransferencia;
	
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double obtenerSaldo(){
		return this.saldo;
	}
	
	public void transferirMontoHacia(double monto, CuentaBancaria cuentaDestino) {
		if (this.validarSaldo(monto)) {
			this.saldo -= monto;
			cuentaDestino.saldo += monto;
			this.estadoTransferencia = true;
		} else {
			this.estadoTransferencia = false;
		}
	}
	
	public boolean validarSaldo(double monto){
		return this.saldo >= monto;
	}
	
	public boolean getEstado(){
		return this.estadoTransferencia;
	}
}
