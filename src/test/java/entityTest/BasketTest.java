package entityTest;

import com.pilling.entity.Basket;
import org.junit.Assert;
import org.junit.Test;

public class BasketTest {
    @Test
    public void testForIdMethod(){
        Basket basket = new Basket();
        basket.setId(1);

        Assert.assertEquals(1, basket.getId());
    }

    @Test
    public void testForCostMethods(){
        Basket basket = new Basket("Pill", 100);
        Assert.assertEquals(100, basket.getCost());
    }

    @Test
    public void testForCostSetter(){
        Basket basket = new Basket();
        basket.setCost(50);
        Assert.assertEquals(50, basket.getCost());
    }

    @Test
    public void testForNameMethods(){
        Basket basket = new Basket();
        basket.setName("Pill2");
        Assert.assertEquals("Pill2", basket.getName());
    }

    @Test
    public void testForSumMethods(){
        Basket basket = new Basket();
        basket.setSum(1000);
        Assert.assertEquals(1000, basket.getSum());
    }
}
