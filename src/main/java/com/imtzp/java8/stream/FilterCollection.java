package com.imtzp.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterCollection {

    private FilterCollection() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < 4) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
    	return null;
    }

}
