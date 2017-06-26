package ru.revdaalex.performanceTest;

import java.util.*;

/**
 * PerformanceTest class.
 * Created by revdaalex on 26.06.2017.
 */
public class PerformanceTest {

    /**
     * Add method with random string.
     * @param collection
     * @param amount
     * @return long.
     */
    public long add(Collection<String> collection, int amount) {
        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randString = new StringBuilder();
        Date start = new Date();

        for (int i = 0; i < amount; i++){
            randString.append(symbols.charAt((int)(Math.random()*symbols.length())));
            collection.add(String.valueOf(randString));
        }
        Date finish = new Date();

        long time = finish.getTime() - start.getTime();
        return time;
    }

    /**
     * Delete method.
     * @param collection
     * @param amount
     * @return long.
     */
    public long delete(Collection<String> collection, int amount) {
        Date start = new Date();

            for (int i = 0; i < amount; i++){
                Object o = collection.iterator().next();
                    collection.remove(o);
            }
        Date finish = new Date();

        long time = finish.getTime() - start.getTime();
        return time;
    }
}
