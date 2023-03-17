package com.wurstbox.atdit.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DiscountComputerImplementationTest {

    DiscountComputer computer = DiscountComputer.getInstance();

    @Test
    public void noDiscount() {

        //act
        var actual = computer.compute( 100, 0 );

        // List size should be 1 (aggregate)
        Assertions.assertEquals(actual.size(), 1);

        // Percentage should be 0 in total
        Assertions.assertEquals(actual.get(0).percentage(), 0);

        // Amount should be 0
        Assertions.assertEquals(actual.get(0).amount(), 0);
    }

    @Test
    public void discountListForCustomer4() {
        var actual = computer.compute(100, 4);

        // List size should be 3
        Assertions.assertEquals(actual.size(), 3);

        // Percentage should be 8 in total
        Assertions.assertEquals(actual.get(0).percentage(), 8);

        // Amount should be 100 * 0.08
        Assertions.assertEquals(actual.get(0).amount(), 100 * 0.08);
    }
}
