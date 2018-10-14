package roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanConverterTest {

    RomanConverter romanConverter;


    @Before
    public void setUp(){
        romanConverter = new RomanConverter();
    }

    @Test
    public void shouldConvertSingleLetterIToArabic(){
        int actualResult = romanConverter.convertToArabic("I");
        Assert.assertEquals(1, actualResult);
    }

    @Test
    public void shouldConvertSingleLetterVToArabic(){
        int actualResult = romanConverter.convertToArabic("V");
        Assert.assertEquals(5, actualResult);
    }

    @Test
    public void shouldConvertSingleLetterXToArabic(){
        int actualResult = romanConverter.convertToArabic("X");
        Assert.assertEquals(10, actualResult);
    }

    @Test
    public void shouldConvertSingleLetterLToArabic(){
        int actualResult = romanConverter.convertToArabic("L");
        Assert.assertEquals(50, actualResult);
    }

    @Test
    public void shouldConvertTwoRomanLetterVIToArabic(){
        int actualResult = romanConverter.convertToArabic("VI");
        Assert.assertEquals(6, actualResult);
    }

    @Test
    public void shouldConvertTwoRomanLetterLToArabic(){
        int actualResult = romanConverter.convertToArabic("IV");
        Assert.assertEquals(4, actualResult);
    }

    //DCCCLXXXVIII
    //888
    @Test
    public void shouldConvertComplexRomanLetterToArabic(){
        int actualResult = romanConverter.convertToArabic("DCCC");
        Assert.assertEquals(800, actualResult);
    }
    //DCCCLXXX
    //880
    @Test
    public void shouldConvertComplexRomanLetterDCCCLXXXToArabic(){
        int actualResult = romanConverter.convertToArabic("DCCCLXXX");
        Assert.assertEquals(880, actualResult);
    }
}
