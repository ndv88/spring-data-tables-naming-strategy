package com.riversoft.data.naming_strategies;

import com.riversoft.builders.IncorrectNounsExclusionResolverBuilder;

public class RiversoftTableNamingStrategyWithSpellResolver extends RiversoftTableNamingStrategy {

    @Override
    public void initializeSpellExclusionResolver() {
        super.initializeSpellExclusionResolver();
        spellExclusionResolver = new IncorrectNounsExclusionResolverBuilder()
                .addWord("details")
                .addWord("child", "children")
                .addWord("human", "people")
                .build();
    }
}
