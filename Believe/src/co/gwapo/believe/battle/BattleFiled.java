package co.gwapo.believe.battle;

import co.gwapo.believe.Status.Hero;
import co.gwapo.believe.Status.Monster;
import co.gwapo.believe.daodto.GameServiceImpl;

public class BattleFiled {
	
	private int herohp;
	private int monsterhp;
	private Monster m1;
	private Hero h1;
	
	public BattleFiled() {
		// TODO Auto-generated constructor stub
	}
	public int getHerohp() {
		return herohp;
	}


	public void setHerohp(int herohp) {
		this.herohp = herohp;
	}


	public int getMonsterhp() {
		return monsterhp;
	}


	public void setMonsterhp(int monsterhp) {
		this.monsterhp = monsterhp;
	}
	
	
	
}
