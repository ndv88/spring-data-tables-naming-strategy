package com.riversoft.data;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.ImprovedNamingStrategy;

public class RiversoftTableNamingStrategy extends ImprovedNamingStrategy {

    private static final long serialVersionUID = 1L;
    private SuffixResolver suffixResolver;

    public RiversoftTableNamingStrategy() {
        super();
        suffixResolver = new SuffixResolver();
    }

    @Override
    public String classToTableName(String className) {
        String tableNameInSingularForm = super.classToTableName(className);
        return transformToPluralForm(tableNameInSingularForm);
    }

    private String transformToPluralForm(String tableNameInSingularForm) {

        String origiSufix = tableNameInSingularForm.substring(
                tableNameInSingularForm.length() - 1,
                tableNameInSingularForm.length());

        tableNameInSingularForm += suffixResolver.resolve(origiSufix);
        return tableNameInSingularForm;
    }

    static class SuffixResolver {
        private static final String PLURAL_SUFFIX_S = "s";
        private static final String PLURAL_SUFFIX_Y = "ies";
        private static final String PLURAL_SUFFIX_ES = "es";

        private List<String> consonants = new ArrayList<>();
        private List<String> vowels = new ArrayList<>();

        public String resolve(String arg) {
            if (vowels.contains(arg)) {
                return PLURAL_SUFFIX_S;
            }
            if (arg.equals("y")) {
                return PLURAL_SUFFIX_Y;
            }
            if (consonants.contains(arg)) {
                return PLURAL_SUFFIX_ES;
            }
            return "";
        }

        public SuffixResolver() {
            intiConsonants();
            initVowels();
        }

        void initVowels() {
            vowels.add("a");
            vowels.add("e");
            vowels.add("i");
            vowels.add("o");
            vowels.add("u");
        }

        void intiConsonants() {
            consonants.add("b");
            consonants.add("c");
            consonants.add("d");
            consonants.add("f");
            consonants.add("g");
            consonants.add("h");
            consonants.add("j");
            consonants.add("k");
            consonants.add("l");
            consonants.add("m");
            consonants.add("n");
            consonants.add("p");
            consonants.add("q");
            consonants.add("r");
            consonants.add("t");
            consonants.add("v");
            consonants.add("w");
            consonants.add("x");
            consonants.add("z");
        }
    }
}

