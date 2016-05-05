package org.albert.brains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.albert.brains.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hola mundo", null, "Albert");
		Message m2 = new Message(2L, "Hola Jersey", null, "Albert");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
