package com.collections;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollection {
    private static final String REGEX_SPECIAL_SYMBOLS = "[\\p{P}\\p{S}]";
    private static final String WORD_CHARS_BIGGER_THEN_SIX_REGEX = "[a-zA-Zа-яА-ЯіІїЇєЄҐґ]{6,}";
    private List<String> wordCollection;

    public TestCollection(String someText) {
        this.wordCollection = new ArrayList(Arrays.asList(someText.replaceAll(REGEX_SPECIAL_SYMBOLS, StringUtils.EMPTY).split(StringUtils.SPACE)));
    }

    public int getWordsCount() {
        return this.wordCollection.size();
    }

    /**
     * printing with iterator
      */
    public void printCollectionToConsoleSortedUsingIterator() {
        Collections.sort(wordCollection);
        for (String s : wordCollection) {
            System.out.println(s);
        }
    }

    public void deleteEachElementBiggerThenSix() {
        wordCollection = wordCollection.stream().filter(e -> !e.matches(WORD_CHARS_BIGGER_THEN_SIX_REGEX)).collect(Collectors.toList());
    }

    public void addAsteriskToEachElementLessThenThreeAndSort() {
        wordCollection = wordCollection.stream().filter(e -> e.length() <= 3).map(s -> s.length() == 2 ? s + "*" : (s.length() == 1 ? s + "**" : s)).collect(Collectors.toList());
    }

    public void printUniqueElements() {
        TreeSet<String> uniqueWords = new TreeSet<>(wordCollection);
        for (String s : uniqueWords) {
            System.out.println(s);
        }

    }
}
