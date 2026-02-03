package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamService {
	static Team[] tarr;
	static int count;
	
	
	static {
		tarr = new Team[20];
		
		Player[] plist1 = new Player[10];
		//Team 1
		plist1[0] = new Player(11, "Hardik Pandya", "AllRounder");
		plist1[1] = new Player(12, "Rohit Sharma", "Batsman");
		plist1[2] = new Player(13, "Tilak Verma", "Batsman");
		
		Player c1 = new Player(12, "Rohit Sharma", "Batsman");
		tarr[0] = new Team(101,"Mi", c1, plist1, 4);
		
		//Team 2
		Player[] plist2 = new Player[10];
		plist1[0] = new Player(21, "Virat Kohli", "Batsman");
		plist1[1] = new Player(22, "Ravi Jadeja", "AllRounder");
		plist1[2] = new Player(23, "Jasprit Bumrah", "Bowler");
		
		Player c2 = new Player(21, "Virat Kohli", "Batsman");
		tarr[1] = new Team(102,"Rcb", c2, plist2, 3);
		
		count=2;
	}

	public Boolean addNewTeam() {
		Scanner sc = new Scanner(System.in);
		if(count<20) {
			System.out.println("Enter team id=");
			int tid = sc.nextInt();
			System.out.println("Enter team name=");
			String tname = sc.next();
//			System.out.println("Enter team size=");
//			int tsize = sc.nextInt();
			
			System.out.println("Enter team captain id=");
			int cid= sc.nextInt();
			System.out.println("Enter captain name=");
			String cname = sc.next();
			System.out.println("Enetr captain speciality=");
			String csp = sc.next();
			
			Player c = new Player(cid, cname, csp);
			
			Player[] pl = new Player[15];
			pl[0] = c;
			
			int i=1;
			String ans = "y";
			
			do {
				System.out.println("Enter Player id=");
				int pid = sc.nextInt();
				System.out.println("Enter Player name=");
				String pname = sc.next();
				System.out.println("Enter Player speciality");
				String psp = sc.next();
				
				pl[i] = new Player(pid, pname, psp);
				i++;
				System.out.println("Do you wish to continue y\n");
				ans = sc.next();
			}while(ans.equals("y"));
			
			tarr[count] = new Team(tid, tname, c, pl, i);
			count++;
			return true;
			
		}
			return false;
	}

	public void displayAllTeams() {
		for(Team t : tarr) {
			if(t!=null)
				System.out.println(t);
			else
				System.out.println("No teams found");
			break;
		}		
	}

	public Team findTeamById(int id) {
		for(Team t : tarr) {
			if(t!=null) {
				if(t.getTid()==id)
					return t;
				else
					System.out.println("No teams found");
					break;
			}
		}
		return null;
	}

	public Boolean addnewPlayer(int tid, int pid, String name, String sp) {
		Team t =findTeamById(tid);
		if(t!=null) {
			Player p = new Player(pid,name,sp);
			int size = t.getSize();
			t.getPlist()[size] = p;
			t.setSize(size +1);
			return true;
		}
		return false;
	}

	public Team findTeamByPlayer(int playerId) {
		for(Team t:tarr) {
			if(t!=null) {
				for(Player p:t.getPlist()) {
					if(p.getId()==playerId) {
						return t;
					}
					else {
						break;
					}
				}
			}
			else {
				break;
			}
		}
		return null;
	}
	
	
	
	
	
}
