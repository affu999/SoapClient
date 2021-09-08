package com.people.client;


import com.people.management.PeopleImpl;
import com.people.management.PeopleImplServiceLocator;

public class Client {

	public static void main(String[] args) {
		PeopleImplServiceLocator sl = new PeopleImplServiceLocator();
		try {
			PeopleImpl pplImpl = sl.getPeopleImpl();
			int age = pplImpl.getAge();
			System.out.println("Name: " + pplImpl.getName());
			System.out.println("Age: " + pplImpl.getAge());
			System.out.println("Gender: " + pplImpl.getGender());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
