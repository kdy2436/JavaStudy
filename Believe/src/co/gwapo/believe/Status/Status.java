package co.gwapo.believe.Status;

public class Status {
	
	private String name;
	private String user_id;
	private String user_password;
	private int str;
	private int dex;
	private int wis;
	private int exp;
	private int dmg;
	private int defence;
	private int hp;
	private int money;
	private int stage;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	
	
	public int getDmg() {
		return dmg;
	}



	public void setDmg(int dmg) {
		this.dmg = dmg;
	}



	public int getDefence() {
		return defence;
	}



	public void setDefence(int defence) {
		this.defence = defence;
	}



	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}
	
	public void setUp() {
		this.hp = (int)(str * 2.5) + (int)(dex *1.1) + (int)(wis*0.5);
		this.dmg = (int)(str*1.5)+(int)(dex*2.1);
		this.defence = (int)(str*1.5) + (int)(dex*0.5);
	}
	

}
