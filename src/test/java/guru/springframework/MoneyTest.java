package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 2018-10-04.
 */
public class MoneyTest {

    @Test
    void testMultiplication() {
    	//given
        Dollar five = new Dollar(5);
        
        //when
        five.times(2);
        
        //then
        assertEquals(10, five.amount);

    }
}


