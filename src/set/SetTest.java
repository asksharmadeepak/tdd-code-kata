package set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetTest {

    Set set;

    @Before
    public void setUp(){
        set = new Set();
    }

    @Test
    public void shouldCheckForEmptySet(){
        Assert.assertTrue(set.isEmpty());
    }

    @Test
    public void shouldAddElementToSet(){
        set.add(1);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 1);
    }

    @Test
    public void shouldAddMultipleElementToSet(){
        set.add(1);
        set.add(4);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 2);
    }

    @Test
    public void shouldAddMultipleUniqueElementToSet(){
        set.add(1);
        set.add(1);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 1);
    }

    // For removeFromIndex there are two scenario do we want to removeFromIndex from index position or where the element matches.

    @Test
    public void shouldRemoveElementFromSet(){
        set.add(1);
        Assert.assertEquals(set.size, 1);
        Assert.assertFalse(set.isEmpty());
        set.removeFromIndex(0);
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(set.size, 0);
    }

    @Test
    public void shouldRemoveElementFromSetWhichContainsMultipleElement(){
        set.add(1);
        set.add(2);
        set.add(3);
        Assert.assertEquals(set.size, 3);
        Assert.assertFalse(set.isEmpty());

        set.removeFromIndex(2);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 2);
    }

    @Test
    public void shouldRemoveElementWhichMatchesInSet(){
        set.add(123);
        set.add(456);
        Assert.assertEquals(set.size, 2);
        Assert.assertFalse(set.isEmpty());

        set.removeFromMatch(123);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 1);
        set.show();
    }

    @Test
    public void shouldRemoveMiddleElementWhichMatchesInSet(){
        set.add(123);
        set.add(456);
        set.add(789);

        Assert.assertEquals(set.size, 3);
        Assert.assertFalse(set.isEmpty());

        set.removeFromMatch(456);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size, 2);
        set.show();
    }

}
