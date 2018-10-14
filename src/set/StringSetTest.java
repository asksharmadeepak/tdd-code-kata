package set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringSetTest {

    StringSet stringSet;

    @Before
    public void setUp(){
        stringSet = new StringSet();
    }

    //Empty set
    @Test
    public void shouldCheckForEmptySet(){
        Assert.assertTrue(stringSet.isEmpty());
    }

    // Add Element ** Need of size
    @Test
    public void shouldAddElementToSet(){
        stringSet.add("RAM");
        Assert.assertFalse(stringSet.isEmpty());
    }

    //Add Get method for Set

    //Add Multiple element ** Size works for us
    @Test
    public void shouldAddMultipleElementsToSet(){
        stringSet.add("RAM");
        stringSet.add("SAM");
        Assert.assertFalse(stringSet.isEmpty());
        //Assert.assertEquals(stringSet.size, 2); Use instead of True false
        Assert.assertTrue(stringSet.size == 2);

    }

    //Add Multiple element ** Need unique element ** size fails ** Needed Array
    @Test
    public void shouldAddUniqueElementsToSet(){
        stringSet.add("RAM");
        stringSet.add("SAM");
        stringSet.add("SAM");
        Assert.assertFalse(stringSet.isEmpty());
        Assert.assertEquals(stringSet.size, 2);
        /**/
    }


    // Remove element from set ** On Basis of index ** In remove we have index we can reach directly to the element
    @Test
    public void shouldRemoveElementFromSet(){
        stringSet.add("RAM");
        stringSet.add("SAM");
        stringSet.add("JAM");
        Assert.assertFalse(stringSet.isEmpty());
        Assert.assertEquals(stringSet.size, 3);

        stringSet.removeFromIndex(1);
        Assert.assertFalse(stringSet.isEmpty());
        Assert.assertEquals(stringSet.size, 2);
        stringSet.show();
    }


}
