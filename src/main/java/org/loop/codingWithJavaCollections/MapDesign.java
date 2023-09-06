package org.loop.codingWithJavaCollections;

import java.util.HashMap;

public class MapDesign {

    public void mapWithStringValue(){
        HashMap<String,Integer> mapString = new HashMap<>();
        String sentence = "This is Ram and he is a very good boy.";
        String [] sent = sentence.split(" ");
        for(String sentences:sent){
            Integer inte = mapString.get(sentences);
            if(inte==null){
                mapString.put(sentences,1);
            }else{
                mapString.put(sentences,inte+1);
            }
        }
        System.out.println(mapString);
    }

    public void mapWithCharacterValue(){
        HashMap<Character,Integer> mapChar = new HashMap<>();
        String sentence = "This is Ram and he is a very good boy.";

        char[] cha = sentence.toCharArray();

        for(Character character:cha){
            Integer inte = mapChar.get(character);
            if(inte==null){
                mapChar.put(character,1);
            }else{
                mapChar.put(character,inte+1);
            }
        }
        System.out.println(mapChar);
    }

    public static void main(String[] args){

        MapDesign md = new MapDesign();
        md.mapWithCharacterValue();
        md.mapWithStringValue();

    }
}
