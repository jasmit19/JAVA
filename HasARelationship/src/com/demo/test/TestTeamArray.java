package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Team;
import com.demo.service.TeamService;

public class TestTeamArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		TeamService tservice = new TeamService();
		
		do {
			System.out.println("1. Add new Team\n 2. Display all Teams\n");
			System.out.println("3. Search Team by id\n 4. Add new Player\n");
			System.out.println("5. Search a Player\n 6. Exit\n Choice:");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Boolean status = tservice.addNewTeam();
				if(status)
					System.out.println("Team added successfully");
				else
					System.out.println("Error");
				break;
				
			case 2:
				tservice.displayAllTeams();
				break;
				
			case 3:
				
				System.out.println("Enetr team id=");
				int id = sc.nextInt();
				Team t = tservice.findTeamById(id);
				if(t!=null) {
					System.out.println(t);
				}else {
					System.out.println("not found");
				}
				break;
			
			case 4:
				System.out.println("Enter team id add new player=");
				int tid = sc.nextInt();
				System.out.println("Add new player id=");
				int pid = sc.nextInt();
				System.out.println("Enter plyer name=");
				String name = sc.next();
				System.out.println("Enter player speciality=");
				String sp = sc.next();
				status = tservice.addnewPlayer(tid, pid, name, sp);
			
			case 5:
				System.out.println("Enter pid to search");
				int playerId = sc.nextInt();
				Team team = tservice.findTeamByPlayer(playerId);
				if(team!=null)
					System.out.println(team);
				else
					System.out.println("Not found");
				break;
				
			case 6:
				System.out.println("ThankYou for visiting");
				break;
					
			default:
				System.out.println("Wrong choice entered");
				break;
			}
			
			
		}while(choice!=6);
		
	}

}
