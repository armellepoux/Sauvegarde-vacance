package com.sopra.pox3.structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapApplication {

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Nicolas", 2);
		map.put("Armelle", 3);
		map.put("Hugues", 4);
		map.put("Maxime", 5);
		System.out.println(map);

		Player nicolas = new Player();
		nicolas.name = "Nicolas";
		Player armelle = new Player();
		armelle.name = "Armelle";
		Player hugues = new Player();
		hugues.name = "Hugues";
		Player maxime = new Player();
		maxime.name = "Maxime";

		TreeMap<Player, Integer> playerScores = new TreeMap<>();
		// tree permet de demander de renvoyer les noms tries par ordre
		// alphabetique
		playerScores.put(nicolas, 2);
		playerScores.put(armelle, 3);
		playerScores.put(hugues, 4);
		playerScores.put(maxime, 5);
		System.out.println(playerScores);
		System.out.println(sortByValue(playerScores));

	}

}
