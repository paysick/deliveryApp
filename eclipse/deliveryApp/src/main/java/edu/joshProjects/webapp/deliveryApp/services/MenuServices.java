package edu.joshProjects.webapp.deliveryApp.services;

import java.util.Collection;
import java.util.Map;

import edu.joshProjects.webapp.deliveryApp.Model.MenuItem;
import edu.joshProjects.webapp.deliveryApp.database.Database;

public class MenuServices {
	
	private Map<Integer, MenuItem> menu = Database.getMenu();
	
	public MenuServices(){
		menu.put(1, new MenuItem("rice", 1, 40, 1));
		menu.put(2, new MenuItem("roti", 2, 15, 1));
		menu.put(3, new MenuItem("dal", 3, 50, 1));
		menu.put(4, new MenuItem("veg curry", 4, 70, 1));
		menu.put(5, new MenuItem("chicken curry", 5, 110, 1));
		menu.put(6, new MenuItem("tomato soup", 6, 30, 1));
		menu.put(7, new MenuItem("ice cream", 7, 20, 1));
		menu.put(8, new MenuItem("sweet", 8, 15, 1));
	}
	
	public Collection<MenuItem> getMenu(){
		return menu.values();
	}
}
