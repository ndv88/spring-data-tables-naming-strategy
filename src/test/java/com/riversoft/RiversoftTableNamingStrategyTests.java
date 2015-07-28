package com.riversoft;


import com.riversoft.builders.IncorrectNounsExclusionResolverBuilder;
import com.riversoft.data.naming_strategies.RiversoftTableNamingStrategy;
import com.riversoft.resolvers.Impl.IncorrectNounsExclusionResolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RiversoftNamingStrategyApplication.class)
public class RiversoftTableNamingStrategyTests {


    @Test
    public void withSpellExclusionResolver() {

        IncorrectNounsExclusionResolver resolver = new IncorrectNounsExclusionResolverBuilder().addWord("details", "details").build();
        RiversoftTableNamingStrategy namingStrategy = new RiversoftTableNamingStrategy();


        String expected = namingStrategy.transformToPluralForm("details");
        assertEquals(expected, "details");

        expected = namingStrategy.transformToPluralForm("car");
        assertEquals(expected, "cars");

    }

}
