package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        scanner.useDelimiter("\\n");
        String rNote  = scanner.nextLine();
        String m = scanner.nextLine();
        scanner.close();
        boolean response = canConstruct(rNote, m);
        System.out.printf("%b", response);

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Object, Integer> mapRansomNote = new HashMap<Object, Integer>();
        for(int i = 0; i < ransomNote.length(); i++){
            Object letter = ransomNote.charAt(i);
            Integer count = mapRansomNote.containsKey(letter) ? mapRansomNote.get(letter) : 0 ;
            count++;
            mapRansomNote.put(letter, count);
        }

        Map<Object, Integer> mapMagazine = new HashMap<Object, Integer>();
        for(int i = 0; i < magazine.length(); i++){
            Object letter = magazine.charAt(i);
            Integer count = mapMagazine.containsKey(letter) ? mapMagazine.get(letter) : 0 ;
            count++;
            mapMagazine.put(letter, count);
        }

        for(Object letter: mapRansomNote.keySet()){
            Integer countRasomNote = mapRansomNote.get(letter);
            Integer countMagazine = mapMagazine.containsKey(letter) ? mapMagazine.get(letter) : 0;
            if(countRasomNote > countMagazine)
                return false;
        }

        return true;
    }

}