import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //to parse in array list to json and vice versa

//        ArrayList list =new ArrayList();
//        list.add("hari");
//        list.add("123");
//        list.add("123");
//        System.out.println(list);

//        Gson json=new Gson().toJson(list);

        String jsonString = " 'name' : 'Ronaldo', 'nickname' : 'Sam', 'id' : 312, 'age' : 21, 'height' : 163,'lastOverScore' : [4, 1, 6, 6, 2, 1] ";
        Gson g = new Gson();
        Json s = g.fromJson(jsonString, Json.class);
        System.out.println(s.getName());
//        System.out.println(json);
    }
}