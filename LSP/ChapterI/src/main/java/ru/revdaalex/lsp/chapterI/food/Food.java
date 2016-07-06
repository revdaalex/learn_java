package ru.revdaalex.lsp.chapterI.food;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Food class.
 * Created by revdaalex on 27.06.2016.
 */
public class Food {
    /**
     * Variable name.
     */
    private String name;
    /**
     * Variable createDate.
     */
    private GregorianCalendar createDate;
    /**
     * Variable expaireDate.
     */
    private GregorianCalendar expaireDate;
    /**
     * Variable price.
     */
    private double price;
    /**
     * Variable disscount.
     */
    private int disscount;

    /**
     * Food class constructor.
     * @param name
     * @param expaireDate
     * @param createDate
     * @param price
     */
    public Food(String name, GregorianCalendar expaireDate, GregorianCalendar createDate, double price) {
        this.name = name;
        this.expaireDate = expaireDate;
        this.createDate = createDate;
        this.price = price;
    }

    /**
     * Setter disscount.
     * @param disscount
     */
    public void setDisscount(int disscount) {
        this.disscount = disscount;
    }

    /**
     * Calculation expiry date in percents.
     * @return long expiry date in percents.
     */
    public long getExpiryDateInPercents(){
        GregorianCalendar expaireDate = this.expaireDate;
        GregorianCalendar createDate = this.createDate;
        GregorianCalendar calendar = new GregorianCalendar();
        int y = calendar.get(Calendar.YEAR);
        int m = 1+calendar.get(Calendar.MONTH);
        int d = calendar.get(Calendar.DATE);
        GregorianCalendar currentTime = new GregorianCalendar(y, m, d);
        long left = currentTime.getTimeInMillis() - createDate.getTimeInMillis();
        long total = expaireDate.getTimeInMillis() - createDate.getTimeInMillis();
        long test = (left * 100 / total);
        return test;
    }
}