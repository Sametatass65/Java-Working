import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> words = new HashMap<String,String>();
        words.put("table","masa");
        words.put("pencil","kalem");
        words.put("book","kitap");

        //words.remove("table");
        //words.clear();
        //words.get("table");
        //words.size();
        for (String word : words.keySet())
        {
            System.out.println("key :" +word + ""+ "value:" +words.get(word));
        }



    }
}