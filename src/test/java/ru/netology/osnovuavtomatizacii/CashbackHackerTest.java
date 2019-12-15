package ru.netology.osnovuavtomatizacii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    @Test
    void remainThatNeedAdd100() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected, actual);

    }

    @Test
    void remainThatNotNeedAdd() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);

    }

}