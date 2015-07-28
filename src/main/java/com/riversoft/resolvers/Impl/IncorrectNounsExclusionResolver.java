package com.riversoft.resolvers.Impl;


import com.riversoft.resolvers.SpellExclusionResolver;

import java.util.HashMap;
import java.util.Map;

public class IncorrectNounsExclusionResolver implements SpellExclusionResolver {

    private final Map<String, String> words;

    public IncorrectNounsExclusionResolver(Map<String, String> words) {
        this.words = new HashMap<>(words);
    }

    @Override
    public String resolve(String word) {
        return this.words.get(word);
    }
}
