
public class Main {

	public static void main(String[] args) {
		
		/*
		 * overloaded constructors =	multiple constructors within a class with the same name,
		 * 								but have different parameters
		 * 								name + parameters = signature
		 */
		
		//Pizza pizza = new Pizza("thic crust", "tomato", "mozzerella", "pepperoni");
		//Pizza pizza = new Pizza("thic crust", "tomato", "mozzerella");
		//Pizza pizza = new Pizza("thic crust", "tomato");
		Pizza pizza = new Pizza("thic crust");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}
