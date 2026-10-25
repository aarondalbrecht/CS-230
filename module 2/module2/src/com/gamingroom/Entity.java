package com.gamingroom;

public class Entity {
	//ensures all Entities have an id and name
	protected long id;
	protected String name;
	
	//default constructor
	protected Entity() {}
	
	//constructor for input of id and name
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//accessor that returns id
	public long getId() {
		return id;
	}
	
	//accessor that returns name
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
