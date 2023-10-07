package dz.collection.map;

import java.lang.reflect.Array;
import java.util.*;

public class Vocabulary {
    public static void main(String[] args) {
        Map<String, List<String>> mapEnRu = new HashMap<>();

        mapEnRu.put("speak", new ArrayList<>(Arrays.asList("говорить", "разговаривать")));
        mapEnRu.put("each", new ArrayList<>(Arrays.asList("каждый", "всякий")));
        mapEnRu.put("able", new ArrayList<>(Arrays.asList("способный", "умеющий")));
        mapEnRu.put("only", new ArrayList<>(Arrays.asList("только", "лишь")));
        mapEnRu.put("must", new ArrayList<>(Arrays.asList("должен", "нужно")));
        mapEnRu.put("then", new ArrayList<>(Arrays.asList("затем", "потом")));
        mapEnRu.put("than", new ArrayList<>(Arrays.asList("чем", "чтобы")));
        mapEnRu.put("and", new ArrayList<>(Arrays.asList("и", "а")));
        mapEnRu.put("dog", new ArrayList<>(Arrays.asList("собака", "пес")));
        mapEnRu.put("everyone", new ArrayList<>(Arrays.asList("каждый", "всякий")));
        mapEnRu.put("kill", new ArrayList<>(Arrays.asList("убить", "уничтожить")));
        mapEnRu.put("put", new ArrayList<>(Arrays.asList("класть", "подвергать")));
        mapEnRu.put("game", new ArrayList<>(Arrays.asList("игра", "партия")));
        mapEnRu.put("candle", new ArrayList<>(Arrays.asList("свеча", "газовая горелка")));
        mapEnRu.put("bird", new ArrayList<>(Arrays.asList("птица", "пташка")));
        mapEnRu.put("not", new ArrayList<>(Arrays.asList("не", "нет")));
        mapEnRu.put("many", new ArrayList<>(Arrays.asList("много", "множество")));
        mapEnRu.put("worth", new ArrayList<>(Arrays.asList("стоить", "стоимость")));
        mapEnRu.put("bird", new ArrayList<>(Arrays.asList("птица", "пташка")));


        Map<String, List<String>> mapRuEn = new HashMap<>();
        mapRuEn.put("каждый", new ArrayList<>(Arrays.asList("each", "everyone")));
        mapRuEn.put("должен", new ArrayList<>(Arrays.asList("must", "should")));
        mapRuEn.put("уметь", new ArrayList<>(Arrays.asList("be able to", "to can")));
        mapRuEn.put("слушать", new ArrayList<>(Arrays.asList("to listen", "to hear")));
        mapRuEn.put("лишь", new ArrayList<>(Arrays.asList("only", "barely")));
        mapRuEn.put("говорить", new ArrayList<>(Arrays.asList("to speak", "to talk")));
        mapRuEn.put("дела", new ArrayList<>(Arrays.asList("actions", "affairs")));
        mapRuEn.put("звучать", new ArrayList<>(Arrays.asList("to speak", "to sound")));
        mapRuEn.put("слово", new ArrayList<>(Arrays.asList("word", "say")));
        mapRuEn.put("собака", new ArrayList<>(Arrays.asList("dog", "hound")));
        mapRuEn.put("зайц", new ArrayList<>(Arrays.asList("hare", "rabbit")));
        mapRuEn.put("собака", new ArrayList<>(Arrays.asList("dog", "hound")));
        mapRuEn.put("пташка", new ArrayList<>(Arrays.asList("bird", "birdie")));
        mapRuEn.put("червяк", new ArrayList<>(Arrays.asList("worm", "earthworm")));
        mapRuEn.put("игра", new ArrayList<>(Arrays.asList("game", "play")));
        mapRuEn.put("свеча", new ArrayList<>(Arrays.asList("candle", "suppository")));


        List<String> en = new ArrayList<>(Arrays.asList("Everyone must first be able to listen and only then speak",
                "Actions speak louder than words", "Dogs that put up many hares kill none",
                "The early bird catches the worm", "The game is not worth the candle"));
        List<String> ru = new ArrayList<>(Arrays.asList("Каждый должен сперва уметь слушать а лишь потом говорить",
                "Дела звучат громче слов", "Собаки, что пускаются за многими зайцами, ни одного не убьют",
                "Ранняя пташка ловит червяка", "Игра не стоит свеч"));

        Map<String, List<String>> treemap = new TreeMap<>(mapEnRu);
        Set<String> newWords = new TreeSet<>();

        treemap.forEach((k, v) -> System.out.println(k + " : " + v));
        for (String str : en) {
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (mapEnRu.containsKey(words[i].toLowerCase()))
                    System.out.print(mapEnRu.get(words[i].toLowerCase()) + " ");
                else {
                    System.out.print(words[i] + " ");
                    newWords.add(words[i]);
                }
            }
            System.out.println();
        }
        System.out.println("New words in the vocabulary:");
        newWords.forEach(s -> System.out.print(s + " "));
        newWords.forEach(s -> treemap.put(s, null));
    }

}

