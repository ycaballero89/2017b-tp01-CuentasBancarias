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
		Assert.fail();
	}
}
