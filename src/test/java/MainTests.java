import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class MainTests {
    @Test
    public void test_min() {
        Main.numbers = new int[]{0, 1, 2, 3, 0};
        Assertions.assertEquals(0, Main._min());
    }

    @Test
    public void test_max() {
        Main.numbers = new int[]{7, 1, 2, 3, 0};
        Assertions.assertEquals(7, Main._max());
    }

    @Test
    public void test_sum() {
        int[] numbers = new int[]{1, 2, 3, 0};
        Assertions.assertEquals(6, Main._sum());
    }

    @Test
    public void test_mult() {
        Main.numbers = new int[]{1, 2, 3, 7};
        Assertions.assertEquals(42, Main._mult());
    }

    @Test
    public void test_mult_zero() {
        Main.numbers = new int[]{1, 2, 3, 0};
        Assertions.assertEquals(0, Main._mult());
    }

    @Test
    public void test_loadFile() {
        Assertions.assertThrows(FileNotFoundException.class, ()->{Main.loadFile("no_file");});
    }
}
