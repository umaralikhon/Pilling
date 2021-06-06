package entityTest;

import com.pilling.entity.Pills;
import org.junit.Assert;
import org.junit.Test;

public class PillsTest {
    @Test
    public void testForIdMethods() {
        Pills pills = new Pills();
        pills.setId(1);

        Assert.assertEquals(1, pills.getId());
    }

    @Test
    public void testForNameMethods() {
        Pills pills = new Pills("Pill1", 10, 20);
        pills.setName("Pill1");

        Assert.assertEquals("Pill1", pills.getName());
    }

    @Test
    public void testForCostMethods() {
        Pills pills = new Pills();
        pills.setCost(50);
        Assert.assertEquals(50, pills.getCost());
    }

    @Test
    public void testForAmountMethods() {
        Pills pills = new Pills();
        pills.setAmount(10);
        Assert.assertEquals(10, pills.getAmount());
    }

    @Test
    public void testForNameSetter() {
        Pills pills = new Pills();
        pills.setName("Pill2");
        Assert.assertEquals("Pill2", pills.getName());
    }
}
