package com.qa.individual.individual.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.qa.individual.individual.model.Users;

public class UserStub {
	private static Map<Long, Users> user = new HashMap<Long, Users>();
	private static Long idIndex = 3L;


	static {
		Users a = new Users(1L, "Billy", "Bob", 1234);
		user.put(1L, a);
		Users b = new Users(2L, "Graham", "Jones", 4321);
		user.put(2L, b);
		Users c = new Users(3L, "Tom", "Smith", 7832);
		user.put(2L, c);
	}

	public static List<Users> list() {
		return new ArrayList<Users>(user.values());
	}

	public static Users create(Users uu) {
		idIndex += idIndex;
		uu.setId(idIndex);
		user.put(idIndex, uu);
		return uu;
	}

	public static Users get(Long id) {
		return user.get(id);
	}

	public static Users update(Long id, Users uu) {
		user.put(id, uu);
		return uu;
	}

	public static Users delete(Long id) {
		return user.remove(id);
	}
}
