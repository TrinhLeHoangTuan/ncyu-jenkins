import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GradeConveterTest {
        private GradeConveter converter;

        @Before
        public void setup() throws Exception{
            converter = new GradeConveter();
        }
        @Test
        public void testConvert1() {
            String expected = "A";
            String actual = converter.convert(100);
            assertEquals(expected, actual);

        @Test
        public void testConverter2({
            String expected = "B";
            String actual = converter.convert(90);
            assertEquals(expected, actual);
        }
}
