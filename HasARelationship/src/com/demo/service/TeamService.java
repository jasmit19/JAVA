package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr=new Team[20];
		Player[] parr1=new Player[15];
		//(1,"Virat Kohli","battsman")
		parr1[0]=new Player(1,"Virat Kohli","batsman");
		parr1[1]=new Player(2,"Rohit Sharma","batsman");
		parr1[2]=new Player(3,"Hardik Pandya","Allrounder");
		
		Player c1=new Player(2,"Rohit Sharma","batsman");
		//team 1 of first 3 players
		tarr[0]=new Team(101,"Rcb",c1,parr1,3);
		
		
		Player[] parr2=new Player[20];
		parr2[0]=new Player(16,"Dravid","Batsman");
		parr2[1]=new Player(17,"Saurabh","Batsman");
		parr2[2]=new Player(18,"Sachin","Allrounder");
		parr2[3]=new Player(19,"Jadeja","Allrounder");
		
		Player c2=new Player(18,"Sachin","Allrounder");
		//team 1 of first 3 players
		tarr[1]=new Team(102,"Csk",c2,parr2,4);
		
		cnt=2;
	}

	public static boolean addNewTeam() {
		Scanner sc=new Scanner(System.in);
		if(cnt!=20) {
			//team details
			System.out.println("enter team id: ");
			int tid=sc.nextInt();
			System.out.println("enter team name: ");
			String tname=sc.next();
			
			//captain details
			System.out.println("enter captain player id: ");
			int pid=sc.nextInt();
			System.out.println("enter captain player name: ");
			String pname=sc.next();
			System.out.println("enter captain player speciality: ");
			String sp=sc.next();
			//captain object in constructor
			Player c=new Player(pid,pname,sp);
			//loop for creating Player list
			Player[] plst=new Player[15];
			plst[0]=c;
			int i=1;
			String ans="y";
			do {
				//player details
				System.out.println("enter Player id: ");
				pid=sc.nextInt();
				System.out.println("enter Player name: ");
				pname=sc.next();
				System.out.println("enter Player speciality: ");
				sp=sc.next();
				plst[i]=new Player(pid,pname,sp);
				i++;
				System.out.println("Do u want to add more players? (y/n)");
				ans=sc.next();
			}while(ans.equals("y"));
			
			//add team object in the tarr at cnt position
			tarr[cnt]=new Team(tid,tname,c,plst,i);
			cnt++;
			return true;
		}
		return false;
	}

	public static void displayAll() {
		for(Team t:tarr) {
			if(t!=null) {
				System.out.println(t);
			}else {
				break;
			}
		}		
	}

	public static Team findById(int tid) {
		for(Team t:tarr) {
			if(t!=null) {
				if(t.getTid()==tid) {
					return t;
				}
			}else {
				break;
			}
		}
		return null;
	}

	public static boolean addNewPlayer(int teamid, int pid, String pname, String sp) {
		Team t=findById(teamid);
		// (t) represents the team in which new player is to be added
		if(t!=null) {
			//create a new player
			Player p=new Player(pid,pname,sp);
			//Retrieves the current number of players in the team
			int s=t.getSize();
			//gets the player array (getPlist() returns Player[]) and writes the new Player into index s
			//new player is added to the team via the player list
			t.getPlist()[s]=p;
			//update size of the team
			//represents 1 player is incremented
			t.setSize(s+1);
			return true;
		}
		return false;
	}

	public static Team findTeamByPlayer(int pid) {
		//loop for all teams
		for(Team t:tarr) {
			//if team is true (exists) 
			if(t!=null) {
				//player array of players from each team
				Player[] plst=t.getPlist();
				//player loop for all players in each team 
				for(Player p:plst) {
					//if a player id matches, then we found the team
					if(p.getId()==pid) {
						return t;
					}else {
						break;
					}
				}
			}else {
				break;
			}
		}
		return null;
	}

	
}
