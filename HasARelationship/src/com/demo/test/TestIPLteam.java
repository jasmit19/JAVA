package com.demo.test;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TestIPLteam {

	public static void main(String[] args) {
		Player[] p = {
			new Player(11, "Hardik Pandya", "AllRounder"),
			new Player(12, "Virat kohli", "Batsman"),
			new Player(13, "Jasprit Bumrah", "Bowler")
		};
		Player c = new Player (10, "ROhit Sharma", "Batsman");
		Team t1 = new Team (101, "Rcb", c, p, 5);
		System.out.println(t1);
	}

}
