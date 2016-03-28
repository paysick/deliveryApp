package edu.joshProjects.webapp.deliveryApp.services;

import java.util.Collection;
import java.util.Map;

import edu.joshProjects.webapp.deliveryApp.Model.Profile;
import edu.joshProjects.webapp.deliveryApp.database.Database;

public class ProfileServices {
	
	private Map<Integer, Profile> profiles = Database.getUsers();
	
	public ProfileServices(){
		profiles.put(1, new Profile(1,"Josh","Kumar","Bangalore","9167425269"));
	}
	
	public Collection<Profile> getAllProfiles(){
		return profiles.values();
	}
	
	public Profile getProfile(int userId){
		if(profiles.containsKey(userId)){
			return profiles.get(userId);
		}else return null;
	}
	
	public Profile createProfile(Profile profile){
		profile.setUserId(profiles.size() + 1);
		return profiles.put(profile.getUserId(), profile);
	}
	
	public Profile updateProfile(int userId, Profile profile){
		if (profiles.containsKey(userId)){
			profile.setUserId(userId);
			return profiles.put(userId, profile);
		}else return null;
	}
	
	public Profile removeProfile(int userId){
		if(profiles.containsKey(userId)){
			return profiles.remove(userId);
		}else return null;
	}

}
