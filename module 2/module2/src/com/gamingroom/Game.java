package com.gamingroom;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {
	long id;
	String name;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	//method to add team
	public Team addTeam(String name) {
		Team team = null;
		
		for(int i = 0; i < teams.size() -1; i++) {
			if(teams.get(i).getName() == name) {
				team = teams.get(i);
			}
		}
		if(team == null) {
			GameService service = GameService.getInstance();
			team = new Team(service.getNextPlayerId(), name);
			teams.add(team);
		}
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
