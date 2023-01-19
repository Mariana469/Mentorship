package com.collections;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollection {
    private static final String REGEX = "[,.]";
    private List<String> wordCollection;

    public TestCollection(String someText) {
        this.wordCollection = new ArrayList(Arrays.asList(someText.replaceAll(REGEX, StringUtils.EMPTY).split(StringUtils.SPACE)));
    }

    public int getWordsCount() {
        return this.wordCollection.size();
    }

    //printing by using iterator
    public void printCollectionToConsoleSortedUsingIterator() {
        Collections.sort(wordCollection);
        ListIterator<String> iterator = wordCollection.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void deleteEachElementBiggerThenSix() {
        wordCollection = wordCollection.stream().filter(e -> !e.matches("[a-zA-Zа-яА-ЯіІїЇєЄҐґ]{6,}")).collect(Collectors.toList());
    }

    public List<String> addAsteriskToEachElementLessThenThreeAndSort() {
        wordCollection = wordCollection.stream().filter(e -> e.length() <= 3).map(s -> s.length() == 2 ? s + "*" : (s.length() == 1 ? s + "**" : s)).collect(Collectors.toList());
        return wordCollection;
    }

    public void findUniqueElements() {
        TreeSet<String> uniqueWords = new TreeSet<>(wordCollection);
        for (String s : uniqueWords) {
            System.out.println(s);
        }

    }
}
