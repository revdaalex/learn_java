package ru.revdaalex.arrayConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ConvertList class.
 * Created by revdaalex on 11.07.2017.
 */
public class ConvertList {
    /**
     * Method Convert Array to ArrayList.
     * @param array
     * @return List<Integer>.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int[] one : array) {
            for (int element : one){
                intList.add(element);
            }
        }
        return intList;
    }

    /**
     * Method Convert ArrayList to Array[][].
     * @param list
     * @param rows
     * @return array.
     */
    public  int[][] toArray (List<Integer> list, int rows) {
        int column = rows;
        int[][] test = new int[column][rows];
        if (list.size()%rows == 0) {
            for (int i = 0; i < column; i++) {
                for (int b = 0; b < rows; b++) {
                    Object o = list.iterator().next();
                    int m = (Integer) o;
                    test[i][b] = m;
                    list.remove(o);
                }
            }
        } else
            for (int i = 0; i < column; i++){
                for (int b = 0; b < rows; b++){
                    if (list.iterator().hasNext()){
                        Object o = list.iterator().next();
                        int m = (Integer) o;
                        test[i][b] = m;
                        list.remove(o);
                    } else
                        test[i][b] = 0;
                }
            } return test;
    }

    /**
     * Method convert List<int[]> to List<Integer>.
     * @param list
     * @return
     */
    public List<Integer> convert (List<int[]> list){
        List<Integer> result = new ArrayList<Integer>();
        for (int[] a : list) {
            for (int i : a) {
                result.add(i);
            }
        }
        return result;
    }
}