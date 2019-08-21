package test;

import java.util.ArrayList;
import java.util.List;

//TODO convert normal for loop to enhanced for loop. for(String item : items)
//TODO check forEach() and understand what it does
public class ForEachTest {

	public static void main(String... args) {
		
		//Enhanced for
		List<String> items = new ArrayList<>();
		items.add("Apple");
		items.add("Orange");
		items.add("PineApple");

		//TODO loop
		for(int i=0; i<items.size();i++){
			System.out.println(items.get(i));
		}
		
		//TODO - analyze how below works
		//lambda
		items.forEach(item->System.out.println("output from for each--"+item));

		//Output : ?
		items.forEach(item->{
			if(item.contains("p")){
				System.out.println("filtered output="+item);
			}
		});
		
		
	}

}


