package main;

import java.util.Iterator;
import java.util.Set;

import AStar.DataReader;

public class Application {

	public static void main(String[] args) {
		DataReader dr = new DataReader();
		
		Set<Integer> list = dr.readData();
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
