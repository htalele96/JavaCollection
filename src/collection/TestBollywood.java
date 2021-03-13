package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestBollywood {
	public static void main(String[] args) {
		
		Bollywood bollywoodArray[]= new Bollywood[4];
		
		for(int i=0;i<4;i++) {
			
			 Bollywood bollywood=new Bollywood();
			 bollywood.setMovieId(i);
			 bollywood.setMovieName("Movie"+" "+i);
			 bollywoodArray[i] = bollywood;
		}

//		for(int i=0;i<4;i++) {
		//Bollywood bollywood1 = bollywoodArray[i];
//			System.out.println( bollywood1.getMovieName());
//		}
		
		for(int i=0;i<4;i++) {
			Bollywood bollywood2 = bollywoodArray[i];
			System.out.println(bollywood2);
		}
		//Object object = new Object();
		//ArrayList
		ArrayList<Bollywood> bollyList = new ArrayList<Bollywood>();
		//LinkedList<E>
		
		for(int i=0;i<4;i++) {
			
			 Bollywood bollywood=new Bollywood();
			 bollywood.setMovieId(i);
			 bollywood.setMovieName("Movie"+" "+i);
			 bollyList.add(bollywood);
		}
		
		System.out.println("ArrayList Data:");
		for(int i=0;i<4;i++) {
			Bollywood bollywood2= bollyList.get(i);
			System.out.println(bollywood2.getMovieName());
		}
		
		
		
		
		
		
	   
	}
}
