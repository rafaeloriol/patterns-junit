package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopCartTest {

    @Test
    @BeforeEach
    void setUp() {

        ShopCart trolley = new ShopCart();
        assertNotNull(trolley);
    }


}