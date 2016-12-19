package AStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DataReader {
	private BufferedReader bReader;
	private Set<Integer> list;

	public DataReader() {
		this.bReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Set<Integer> readData(){
		int E;
		int length = 0;
		list = new HashSet<Integer>();
		
		System.out.print("Entrez la taille du tableau : ");
		try {
			length = Integer.parseInt(this.bReader.readLine());
		} catch (NumberFormatException | IOException e1) {
			System.out.println("Taille invalide");
		}
		
		for (int i = 0; i < length; i++) {
			try {
				System.out.println("Entrez l'element " + i);
				E = Integer.parseInt(this.bReader.readLine());
				list.add(E);
			} catch (IOException e) {
				System.out.println("Impossible de lire la chaine saisie.");
			}
		}
		
		return list;
	}

	public Set<Integer> getList() {
		return list;
	}
}
