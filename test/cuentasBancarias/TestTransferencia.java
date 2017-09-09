package cuentasBancarias;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class TestTransferencia {
	CuentaBancaria cuentaOrigen;
	CuentaBancaria cuentaDestino;
	
	@Before
	public void inicializaObjetos() {
		cuentaOrigen = new CuentaBancaria(3500);
		cuentaDestino = new CuentaBancaria(0);
	}
		
	@Test
	public void queInicializeSaldo(){
		Assert.assertEquals(3500, cuentaOrigen.obtenerSaldo(), 0);
	}
	
	@Test
	public void queTransfieraMonto(){
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
		
		Assert.assertFalse(cuentaOrigen.validarSaldo(4000));
		Assert.assertTrue(cuentaOrigen.validarSaldo(2000));
		Assert.assertTrue(cuentaOrigen.validarSaldo(3500));
	}
	
	@Test
	public void queValideSaldoAntesDeTransferir(){

		cuentaOrigen.transferirMontoHacia(4000, cuentaDestino);
		Assert.assertFalse(cuentaOrigen.getEstado());//Verifica estado de transferencia
		cuentaOrigen.transferirMontoHacia(700, cuentaDestino);
		Assert.assertTrue(cuentaOrigen.getEstado());//Verifica estado de transferencia
		cuentaOrigen.transferirMontoHacia(2800, cuentaDestino);
		Assert.assertTrue(cuentaOrigen.getEstado());//Verifica estado de transferencia
		cuentaOrigen.transferirMontoHacia(1, cuentaDestino);
		Assert.assertFalse(cuentaOrigen.getEstado());//Verifica estado de transferencia
		
	}
	
}


