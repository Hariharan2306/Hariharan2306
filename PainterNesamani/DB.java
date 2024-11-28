package PainterNesamani;

import java.util.Date;
import java.util.HashMap;

public class DB {

    public static HashMap<String, Customers> customers = new HashMap<>();
    public static HashMap<String, Painters> painter = new HashMap<>();

    public static Date[] dateFilter = { null, null };
    public static double costFilter;
}
