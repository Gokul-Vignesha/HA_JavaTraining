package com.healthasyst.Cricket;

import java.util.Arrays;

public class League {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Player
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.playerName = "Dhoni";
		player2.playerName = "Raina";
		player3.playerName = "John";
		
		Player[] players = new Player[3];
		players[0] = player1;
		players[1] = player2;
		players[2] = player3;
		
		
		// Creating Team
		Team team1 = new Team();
		team1.teamName ="Chennai Super Kings";
		team1.playerArray = players;
		
		
		
		// Creating players for team2
		Player player4 = new Player();
		Player player5 = new Player();
		Player player6 = new Player();
		
		player4.playerName = "Kholi";
		player5.playerName = "ABD";
		player6.playerName = "Yuvi";
		
		
		
		Team team2 = new Team();
		team2.teamName = "RCB";
		team2.playerArray = new Player[3]; // Initializing player Array
		
		// loading playerarray with player objects
		team2.playerArray[0] = player4;    
		team2.playerArray[1] = player5;
		team2.playerArray[2] = player6;
		
		
		
		// Printing TeamName & Players name
		System.out.println("Team 1 Name : " + team1.teamName);
		System.out.print("\n Team 1 Players are :  ");
		
		// print player name using for each loop
		
		for (Player name : team1.playerArray) {
			System.out.print(name.playerName + " ");
		}
		
		System.out.println();
		
	}

}
