import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MainTest {
    private int max;
    private int divider;
    private int reminder;
    private int collectionDivider;
    private int expectResult;

    public MainTest(int max, int divider, int reminder, int collectionDivider, int expectResult) {
        this.max = max;
        this.divider = divider;
        this.reminder = reminder;
        this.collectionDivider = collectionDivider;
        this.expectResult = expectResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {1000, 7, 2, 2, 143},
                {1000, 5, 4, 3, 200},
                {1000, 200, 4, 1, 5},
                {20, 1, 0, 2, 20},
                {1000, 499, 1, 1, 3},
                {999, 999, 2, 1, 1}
        });
    }

    @Test
    public void test() {
        Assert.assertEquals(expectResult, Main.printAmountOfNumbersWithReminder(max, divider, reminder, collectionDivider));
    }
}
