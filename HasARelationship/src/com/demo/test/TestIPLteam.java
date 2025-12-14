package com.demo.test;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TestIPLteam {

	public static void main(String[] args) {
			Player[] pl= {
					new Player(1,"Virat Kohli","Batsman"),
					new Player(2,"Rohit Sharma","Batsman"),
					new Player(1,"Hardik Pandya","Allrounder")
			};
			Player c=new Player(2,"Rohit Sharma","Batsman");
			Team t1=new Team(1,"Rcb",c,pl,15);
	}

}
