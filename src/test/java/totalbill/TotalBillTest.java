package totalbill;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalBillTest {

    TotalBill total;

    @BeforeEach
    void setup(){
        total = new TotalBill((float) 9.99);
        System.out.println("Testing before Each");
    }
    @Test
    void setPriceOfItem() {
        total.setPriceOfItem((float) 10.99);
    }

    @Test
    void getPriceOfItem() {

        assertEquals(9.99,total.getPriceOfItem());
    }

    @Test
    void totalCost() {
        assertEquals("15.58",total.totalCost());
    }


    @Test
    void toCvsFile1() {
    }

    @Test
    void toCvsFile() {
    }

    @Test
    void testToString() {
    }

    @AfterEach
    void test(){
        System.out.println("Testing After Each");
    }
}