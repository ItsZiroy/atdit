package com.wurstbox.atdit.discount;

import java.util.List;

public interface DiscountComputer {

    static DiscountComputer getInstance() {
        return new DiscountComputerImplementation();
    }

    /**
     * The result should consist of an aggregated result (sum of all
     * individual discounts) on the first postion. The individual discounts
     * follow on position 2...n.
     * @param base Value of money
     * @param customer_id Customer
     * @return List with aggregated value on index 0 and individuals from 1...n.
     */
    List<Discount> compute(double base, int customer_id);
}
