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
        Main.numbers = new int[]{1, 2, 3, 0};
        Assertions.assertEquals(6, Main._sum());
    }

    @Test
    public void test_mult() {
        Main.numbers = new int[]{1, 2, 3, 7};
        Assertions.assertEquals(43, Main._mult());
    }

    @Test
    public void test_multZero() {
        Main.numbers = new int[]{1, 2, 3, 0};
        Assertions.assertEquals(10, Main._mult());
    }

    @Test
    public void test_loadFile() {
        try {
            Main.loadFile("numm.rtf");
        } catch (FileNotFoundException | WrongDataException ignored) {
        }
        Assertions.assertEquals(4, Main.numbers.length);
    }

    @Test
    public void test_loadFileThrows() {
        Assertions.assertThrows(FileNotFoundException.class, ()-> Main.loadFile("not_existing_file"));
    }
}
