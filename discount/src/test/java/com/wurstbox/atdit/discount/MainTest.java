package com.wurstbox.atdit.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void noDiscount() {
        var cut = new Main();
        cut.computeDiscount(0, 1);
        var expected = 0;

        //act
        var actual = cut.computeDiscount( 100, 0 );

        //assert
        Assertions.assertEquals( expected, actual );
    }
}
