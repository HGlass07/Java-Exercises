import java.util.ArrayList;
import java.util.List;

public class test {
	
	private List<RestaurantDetails> restaurantList;

	public test() {
		this.restaurantList = new ArrayList<>();
	}

	// Nested Menu class
	public class Menu {
		private String menuItem;
		private double price;
		
		public Menu(String menuItem, double price) {
			this.menuItem = menuItem;
			this.price = price;
		}
		
		public String getItem() {
			return menuItem;
		}
		
		public double getPrice() {
			return price;
		}
		
		@Override
	    public String toString() {
	        return "Menu Item: {item='" + menuItem + "', price='" + price + "'}";
	    } 
	}
	
	// Nested RestaurantDetails class
	public class RestaurantDetails {
		private String restaurantName;
		private int rating;
		private List<Menu> menuItems;
		
		public RestaurantDetails(String restaurantName, int rating) {
			this.restaurantName = restaurantName;
			this.rating = rating;
			this.menuItems = new ArrayList<>();
		}
		
		public String getName() {
			return restaurantName;
		}
		
		public int getRating() {
			return rating;
		}
		
		public List<Menu> getMenu() {
			return menuItems;
		}
		
		public void addMenuItem(String menuItem, double price) {
			menuItems.add(new Menu(menuItem, price));
			System.out.println(menuItem + " added at " + price);
		}
		
		public void removeMenuItem(String menuItem) {
	        menuItems.removeIf(itm -> itm.getItem().equals(menuItem));
	        System.out.println(menuItem + " removed");
	    }
		
		@Override
		public String toString() {
			return "Restaurant: " + restaurantName + " (Rating: " + rating + "), Menu: " + menuItems;
		}
	}
	
	public void addRestaurant(String restaurantName, int rating) {
		restaurantList.add(new RestaurantDetails(restaurantName, rating));
	}
	
	public void addRestaurantDetails(String restaurantName, String menuItem, double price) {
		RestaurantDetails restaurant = findRestaurant(restaurantName);
		if (restaurant != null) {
			restaurant.addMenuItem(menuItem, price);
		} else {
			System.out.println(restaurantName + " not found");
		}
	}
	
	public void removeRestaurant(String restaurantName) {
		RestaurantDetails restaurant = findRestaurant(restaurantName);
		if (restaurant != null) {
			restaurantList.remove(restaurant);
			System.out.println(restaurantName + " removed");
		} else {
			System.out.println(restaurantName + " not found");
		}
	}
	
	private RestaurantDetails findRestaurant(String restaurantName) {
		for (RestaurantDetails restaurant : restaurantList) {
			if (restaurant.getName().equals(restaurantName)) {
				return restaurant;
			}
		}
		return null;
	}
	
	public void displayRestaurants() {
		for (RestaurantDetails restaurant : restaurantList) {
			System.out.println(restaurant);
		}
	}

	public static void main(String[] args) {
		test restaurantList = new test();
		
		restaurantList.addRestaurant("The Ivy", 4);
		restaurantList.addRestaurantDetails("The Ivy", "Spaghetti", 12.50);
		restaurantList.addRestaurantDetails("The Ivy", "Steak", 25.00);
		restaurantList.addRestaurantDetails("The Ivy", "Salad", 10.00);
		
		restaurantList.displayRestaurants();
		
		restaurantList.removeRestaurant("The Ivy");
		
		restaurantList.displayRestaurants();
	}
}