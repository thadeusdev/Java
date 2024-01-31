import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		/*
		 * 2D ArrayList = a dynamic list of lists
		 * You can change the size of these lists during runtime
		 */
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();		
		bakeryList.add("Pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("cofee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(bakeryList.get(0));
		System.out.println(drinksList);
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));

	}

}
