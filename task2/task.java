package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task {



    public static void main(String[] args) {
        ArrayList <String> names = fulfil();

        System.out.println(names.toString());

        Map <String, Integer> namesNum = new HashMap<>();
        

        for (int i = 0; i < names.size(); ++i)
        {
            String cur_name = getName(names.get(i));
            int cur_num = 0;
            if (namesNum.containsKey(cur_name))
            {
                cur_num = namesNum.get(cur_name);
                namesNum.put(cur_name, ++cur_num);
            }
            else
                namesNum.put(cur_name, 1);
        }

        System.out.println(namesNum.toString());

        ArrayList <String> finNames = new ArrayList<>();
        String curName = "";
        while(namesNum.size() > 0)
        {
            curName = getMaxName(namesNum);

            for (int i = 0; i < names.size(); ++i)
            {
                if (getName(names.get(i)).equals(curName))
                    finNames.add(names.get(i));

            }
        }

        System.out.println(finNames.toString());
    }
    
    public static ArrayList <String> fulfil() {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Иван Иванов");
        arr.add("Светлана Петрова");
        arr.add("Кристина Белова");
        arr.add("Анна Мусина");
        arr.add("Анна Крутова");
        arr.add("Иван Юрин");
        arr.add("Петр Лыков");
        arr.add("Павел Чернов");
        arr.add("Мария Федорова");
        arr.add("Марина Светлова");
        arr.add("Мария Савина");
        arr.add("Мария Рыкова");
        arr.add("Марина Лугова");
        arr.add("Анна Владимирова");
        arr.add("Иван Мечников");
        arr.add("Петр Петин");
        arr.add("Иван Ежов");
      
        return arr;
    }

    public static String getName(String str) {
        return str.split(" ")[0];
    }

    public static String getMaxName(Map <String, Integer> dict) {
        String cur_name = "";
        int max = 0;
        for (var item: dict.entrySet())
        {
            if (max < item.getValue())
            {
                max = item.getValue();
                cur_name = item.getKey();
            }
        }
        dict.remove(cur_name);
        return cur_name;
    }
}