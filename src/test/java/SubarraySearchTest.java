import static org.junit.jupiter.api.Assertions.*;

import org.aon.arrays.SubarraySearch;
import org.junit.jupiter.api.Test;

public class SubarraySearchTest {

    @Test
    public void testFound() {
        assertEquals(2, SubarraySearch.findSubarrayIndex(new int[]{4, 9, 3, 7, 8}, new int[]{3, 7}));
    }

    @Test
    public void testNotFound() {
        assertEquals(-1, SubarraySearch.findSubarrayIndex(new int[]{1, 2, 3, 4}, new int[]{2, 4}));
    }

    @Test
    public void testAtStart() {
        assertEquals(0, SubarraySearch.findSubarrayIndex(new int[]{5, 6, 7, 8}, new int[]{5, 6}));
    }

    @Test
    public void testAtEnd() {
        assertEquals(2, SubarraySearch.findSubarrayIndex(new int[]{5, 6, 7, 8}, new int[]{7, 8}));
    }

    @Test
    public void testEmptySubarray() {
        assertEquals(0, SubarraySearch.findSubarrayIndex(new int[]{1, 2, 3}, new int[]{}));
    }

    @Test
    public void testSubarrayLongerThanMain() {
        assertEquals(-1, SubarraySearch.findSubarrayIndex(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    @Test
    public void testExactMatch() {
        assertEquals(0, SubarraySearch.findSubarrayIndex(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }

    @Test
    public void testMultipleOccurrences() {
        assertEquals(0, SubarraySearch.findSubarrayIndex(new int[]{1, 2, 3, 1, 2}, new int[]{1, 2}));
    }
}
