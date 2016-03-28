package edu.joshProjects.webapp.deliveryApp.database;

import java.util.HashMap;
import java.util.Map;

import edu.joshProjects.webapp.deliveryApp.Model.MenuItem;
import edu.joshProjects.webapp.deliveryApp.Model.Profile;

public class Database {

	private static Map<Integer, MenuItem> Menu = new HashMap<Integer, MenuItem>();
	private static Map<Integer, Profile> Users = new HashMap<Integer, Profile>();
	
	public static Map<Integer, MenuItem> getMenu() {
		return Menu;
	}
	public static Map<Integer, Profile> getUsers() {
		return Users;
	}
	
	
	
}
