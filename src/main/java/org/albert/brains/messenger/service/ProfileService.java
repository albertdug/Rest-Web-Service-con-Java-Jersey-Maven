package org.albert.brains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.albert.brains.messenger.database.DataBase;
import org.albert.brains.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DataBase.getProfiles();
	
	public ProfileService() {
		
		profiles.put("Albert", new Profile(1L, "albertdug", "Albert", "Duran"));
		
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile (String profileName) {
		return profiles.remove(profileName);
	}


}
