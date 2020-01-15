package co.gwapo.believe.battle;

import java.util.ArrayList;
import java.util.List;

import co.gwapo.believe.Status.Hero;
import co.gwapo.believe.Status.Monster;
import co.gwapo.believe.daodto.GameServiceImpl;

public class Battle extends BattleFiled {

	public void atk() {
		GameServiceImpl gs = new GameServiceImpl();
		List<Monster> list = new ArrayList<Monster>();
		Hero h1 = gs.selecthero();
		list = gs.selectmonster(h1.getStage());
		Monster[] monster = list.toArray(new Monster[list.size()]);
		boolean b = true;
		
		int herohp = h1.getHp();
		while(b) {
			
			for(int i =0; i<monster.length; i++) {
				herohp = h1.getHp();
				monsterhp = monster[i].getHp();
				System.out.println("유저가 공격합니다.");
				monsterhp = monsterhp - h1.getDmg();
				
				System.out.println();
			}
		}
		
		
		
	}
}
