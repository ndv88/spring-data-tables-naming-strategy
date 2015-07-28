package com.riversoft;
import com.riversoft.data.RiversoftTableNamingStrategy.TransformerToPluralForm;
import org.junit.Test;


import static org.junit.Assert.*;

public class SuffixResolverTests {

    private TransformerToPluralForm transformerToPluralForm = new TransformerToPluralForm();

    @Test
    public void endingTest() {

        String expected;

        expected = transformerToPluralForm.transform("boy");
        assertEquals(expected, "boys");

        expected = transformerToPluralForm.transform("box");
        assertEquals(expected, "boxes");

        expected = transformerToPluralForm.transform("cry");
        assertEquals(expected, "cries");

        expected = transformerToPluralForm.transform("play");
        assertEquals(expected, "plays");

        expected = transformerToPluralForm.transform("undo");
        assertEquals(expected, "undoes");

        expected = transformerToPluralForm.transform("wife");
        assertEquals(expected, "wives");

        expected = transformerToPluralForm.transform("leaf");
        assertEquals(expected, "leaves");

        expected = transformerToPluralForm.transform("city");
        assertEquals(expected, "cities");

        expected = transformerToPluralForm.transform("car");
        assertEquals(expected, "cars");

        expected = transformerToPluralForm.transform("company");
        assertEquals(expected, "companies");

        expected = transformerToPluralForm.transform("details");
        assertEquals(expected, "details");
    }

}
