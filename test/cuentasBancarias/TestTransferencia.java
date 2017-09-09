package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class TestTransferencia {

	@Test
	public void queInicializeSaldo(){
		CuentaBancaria cuenta = new CuentaBancaria(3500);
		Assert.assertEquals(3500, cuenta.obtenerSaldo(), 0);
	}
	
	@Test
	public void queTransfieraMonto(){
		CuentaBancaria cuentaOrigen = new CuentaBancaria(3500);
		CuentaBancaria cuentaDestino = new CuentaBancaria(0);
		double saldoInicialOrigen = cuentaOrigen.obtenerSaldo();
		double saldoInicialDestino = cuentaDestino.obtenerSaldo();
		double monto = 400;
		
		cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);
		
		//Verifica saldo cuenta origen
		Assert.assertEquals(saldoInicialOrigen-monto, cuentaOrigen.obtenerSaldo(), 0);
		//Verifica saldo cuenta destino
		Assert.assertEquals(saldoInicialDestino+monto, cuentaDestino.obtenerSaldo(), 0);
	}
	
	@Test
	public void queValideSaldo(){		
		CuentaBancaria cuentaOrigen = new CuentaBancaria(3500);
		
		Assert.assertFalse(cuentaOrigen.validarSaldo(4000));
		Assert.assertTrue(cuentaOrigen.validarSaldo(2000));
		Assert.assertTrue(cuentaOrigen.validarSaldo(3500));
	}
}


