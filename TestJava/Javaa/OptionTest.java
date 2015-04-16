package Javaa;

import org.junit.Assert;
import org.junit.Test;

import Javaa.Option;

public class OptionTest {

	@Test
	public void test() {
		Option op1 = new Option(2000, "option1");
		Assert.assertEquals(2000, op1.prix);
		Assert.assertEquals("option1", op1.nom);
	}

}
