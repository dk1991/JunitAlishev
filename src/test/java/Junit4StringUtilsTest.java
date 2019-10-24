import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.bcel.internal.classfile.Utility.toHexString;

public class Junit4StringUtilsTest extends Assert {
    private static final Map<String, byte[]> toHexStringData = new HashMap<String, byte[]>();

    @Before
    public void setUpToHexStringData() {
        toHexStringData.put("", new byte[0]);
        toHexStringData.put("01 02 0d 11 2d 7f", new byte[]{1,2,13,17,45,127});
        toHexStringData.put("00 ff f2 11 80", new byte[]{0,-1,-14,17,-128});
    }

    @Test
    public void testToHexString() {
        for (Map.Entry<String,byte[]> entry : toHexStringData.entrySet()) {
            final byte[] testData = entry.getValue();
            final String expected = entry.getKey();
            final String actual = toHexString(testData);
            assertEquals(expected, actual);
        }
    }

    @After
    public void tearDownToHexStringData() {
        toHexStringData.clear();
    }
}
