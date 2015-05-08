package homework3;

import java.util.ArrayList;

public class Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin");
		ArrayList<Integer> data = new ArrayList<Integer>();
		init(data);
		process(data);
		System.out.println("result");
		show(data);
	
		
	}
	
	private static void init(ArrayList<Integer> data){
		int startNumber = 2;
		int endNumber = 100;
		for(int i = startNumber; i < endNumber+1; i++){
			data.add(i);
		}
	}
	
	private static void process(ArrayList<Integer> data){
		int basePosition = 0;
		while( basePosition < data.size()){
			int baseNumber = data.get(basePosition);
//			System.out.println(baseNumber);
			for( int i = basePosition + 1; i < data.size(); i++){
				int number = data.get(i);
				if( number % baseNumber == 0){
					data.remove( i );
					i -= 1;
//					System.out.println(data.size());
				}
			}
			basePosition += 1;
		}
	}
	
	private static void show(ArrayList<Integer> data){
		for(int number : data){
			System.out.println(number);
		}
	}

}
