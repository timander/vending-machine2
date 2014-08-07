package net.timandersen;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vendingMachine;

	@Before
	public void setUp() {
		vendingMachine = new VendingMachine();
	}

	@Test
	public void takeOneDollar() {
		vendingMachine.takeMoney(1.00);
		assertEquals("$1.00", vendingMachine.displayCredit());
	}

	@Test
	public void takeFiftyCents() {
		vendingMachine.takeMoney(0.50);
		assertEquals("$0.50", vendingMachine.displayCredit());
	}

	@Test
	public void insertDimeThenNickel() {
		vendingMachine.takeMoney(0.10);
		vendingMachine.takeMoney(0.05);
		assertEquals("$0.15", vendingMachine.displayCredit());
	}

	@Test
	public void purchaseSeventyFiveCentProduct() {
		vendingMachine.takeMoney(1.00);
		vendingMachine.selectProduct("A1");
		assertEquals("$0.25", vendingMachine.displayCredit());
	}

	@Test
	public void purchaseOneDollarProduct() {
		vendingMachine.takeMoney(1.00);
		vendingMachine.selectProduct("A1");
		assertEquals("$0.00", vendingMachine.displayCredit());
	}

}
