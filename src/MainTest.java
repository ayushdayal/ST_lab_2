import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    void createTestAndAssertValue(int mint, int expectedValue) {
        float actualValue = Main.bill(mint);
        assertEquals(actualValue, expectedValue);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_1() {
        createTestAndAssertValue(-1, 0);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_2() {
        createTestAndAssertValue(0, 0);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_3() {
        createTestAndAssertValue(10, 300);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_4() {
        createTestAndAssertValue(120, 300);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_5() {
        createTestAndAssertValue(150, 330);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_6() {
        createTestAndAssertValue(190, 370);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_7() {
        createTestAndAssertValue(220, 394);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_8() {
        createTestAndAssertValue(240, 410);
    }

    @org.junit.jupiter.api.Test
    void bill_ECT_9() {
        createTestAndAssertValue(300, 434);
    }
}