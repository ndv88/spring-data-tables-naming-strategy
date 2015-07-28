package com.riversoft.builders;


import com.riversoft.resolvers.Impl.IncorrectNounsExclusionResolver;

import java.util.HashMap;
import java.util.Map;

public class IncorrectNounsExclusionResolverBuilder {

    private Map<String, String> words = new HashMap<>();

    public IncorrectNounsExclusionResolverBuilder addWord(String src, String dist) {
        words.put(src, dist);
        return this;
    }

    public IncorrectNounsExclusionResolverBuilder addWord(String word, Boolean unique) {
        words.put(word, word);
        return this;
    }

    public IncorrectNounsExclusionResolver build() {
        return new IncorrectNounsExclusionResolver(words);
    }

}
