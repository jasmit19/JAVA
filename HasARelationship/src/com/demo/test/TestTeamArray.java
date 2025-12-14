package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;
import com.demo.service.TeamService;

public class TestTeamArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("1.Add new team\n2.Display all teams");
			System.out.println("3.Search team by id\n4.Add new player");
			System.out.println("5.Search a player\n6.exit\nChoice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				boolean status=TeamService.addNewTeam();
				if(status) {
					System.out.println("Team added succesfully");
				}else {
					System.out.println("unsuccesful");
				}
				break;
				
			case 2:
				TeamService.displayAll();
				break;
				
			case 3:
				//what team to find
				System.out.println("enter team id to search: ");
				int tid=sc.nextInt();
				Team t=TeamService.findById(tid);
				if(t!=null) {
					System.out.println(t);
				}else {
					System.out.println("not found");
				}
				break;
				
			case 4:
				//which team u want to add a player in
				System.out.println("enter team id to add new player");
				int teamid=sc.nextInt();
				//details of player to be added
				System.out.println("enter Player id: ");
				int pid=sc.nextInt();
				System.out.println("enter Player name: ");
				String pname=sc.next();
				System.out.println("enter Player speciality: ");
				String sp=sc.next();
				status=TeamService.addNewPlayer(teamid,pid,pname,sp);
				if(status)
					System.out.println("player added successfully");
				else
					System.out.println("Error: Team not found");
				break;
				
			case 5:
				//which player you want to search
				System.out.println("enter player id: ");
				pid=sc.nextInt();
				Team team=TeamService.findTeamByPlayer(pid);
				if(team!=null) {
					System.out.println(team);
				}else {
					System.out.println("player not found");
				}
				System.out.println();
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			}
		}while(choice!=1);
		
	}

}
