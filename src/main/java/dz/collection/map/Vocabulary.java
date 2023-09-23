package dz.collection.map;

import java.lang.reflect.Array;
import java.util.*;

public class Vocabulary {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("speak", new ArrayList<>(Arrays.asList("говорить", "разговаривать")));
        map.put("each", new ArrayList<>(Arrays.asList("каждый", "всякий")));
        map.put("able", new ArrayList<>(Arrays.asList("способный", "умеющий")));
        map.put("only", new ArrayList<>(Arrays.asList("только", "лишь")));
        map.put("must", new ArrayList<>(Arrays.asList("должен", "нужно")));
        map.put("then", new ArrayList<>(Arrays.asList("затем", "потом")));
        map.put("than", new ArrayList<>(Arrays.asList("чем", "чтобы")));
        map.put("and", new ArrayList<>(Arrays.asList("и", "а")));
        map.put("dog", new ArrayList<>(Arrays.asList("собака", "пес")));
        map.put("Everyone", new ArrayList<>(Arrays.asList("каждый", "а")));
        map.put("and", new ArrayList<>(Arrays.asList("и", "а")));

        List<String> en = new ArrayList<>(Arrays.asList("Everyone must first be able to listen and only then speak",
                "Actions speak louder than words", "Dogs that put up many hares kill none",
                "The early bird catches the worm", "The game is not worth the candle"));
        List<String> ru = new ArrayList<>(Arrays.asList("Каждый должен сперва уметь слушать а лишь потом говорить",
                "Дела звучат громче слов", "Собаки, что пускаются за многими зайцами, ни одного не убьют",
                "Ранняя пташка ловит червяка", "Игра не стоит свеч"));


    }
}
