package org.albert.brains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.albert.brains.messenger.model.Message;
import org.albert.brains.messenger.model.Profile;

public class DataBase {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

}
