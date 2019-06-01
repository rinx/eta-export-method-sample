package io.github.rinx.etaexportmethodsample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import io.github.rinx.etaexportmethodsample.Numbers;
import static io.github.rinx.etaexportmethodsample.Arrays.mapProd;

public class EtaExportMethodSample {

	@Test
	public void callEtaMethods() {
            assertEquals(0, Numbers.zero());
            assertEquals(1, Numbers.one());
            assertEquals(2, Numbers.addTwo(0));
	}

	@Test
	public void testMapProd() {
            int[] xs = {1, 2, 3, 4, 5};
            assertArrayEquals(xs, mapProd(1, xs));
            assertArrayEquals(new int[]{3, 6, 9, 12, 15}, mapProd(3, xs));
	}
}
