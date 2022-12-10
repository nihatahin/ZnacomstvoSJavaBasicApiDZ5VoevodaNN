package task1;

import java.util.HashMap;
import java.util.Map;

public class task {

    public static void main(String[] args) {
        Map <String, String> telBook = new HashMap<>();


        telBook.put("+7(999)888-77-55", "Petrova I.S.");
        telBook.put("+7(987)888-77-55", "Ivanov R.T.");
        telBook.put("+7(999)828-47-45", "Gurin K.B.");
        telBook.put("+7(932)238-37-35", "Penzina A.D.");
        telBook.put("+7(129)888-77-55", "Penzina A.D.");
        telBook.put("+7(543)888-77-55", "Penzina A.D.");
        telBook.put("+7(999)888-77-55", "Kulinarov B.A.");
        telBook.put("+7(555)888-77-55", "Abiriev R.J.");
        telBook.put("+7(444)888-77-55", "Abiriev R.J.");
        telBook.put("+7(909)888-77-55", "Klonofarenko A.E.");
        telBook.put("+7(112)888-77-55", "Buben S.S.");

        System.out.println(telBook.toString());
    }
    
}