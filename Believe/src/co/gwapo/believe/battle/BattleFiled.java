package co.gwapo.believe.battle;

import java.util.Random;

import co.gwapo.believe.Status.Hero;
import co.gwapo.believe.Status.Monster;
import co.gwapo.believe.Status.Status;

public class BattleFiled extends Status {
	// 전투는 가상의 필드를 만들어 거기서 데이터를 공유하며 결과 값을 반환한다.

	private Hero h1;
	private Monster[] monAry;
	private int heroNowhp;
	private int[] monNowhp;

	public BattleFiled() {
		// TODO Auto-generated constructor stub
	}

	public BattleFiled(Hero h1, Monster[] monAry) {
		// 공유할 데이터를 정의한다.
		this.h1 = h1;
		this.monAry = monAry;
		this.heroNowhp = h1.getHp();
		this.monAry = monAry;
		this.monNowhp = new int[monAry.length];
		for (int i = 0; i < monAry.length; i++) {
			this.monNowhp[i] = monAry[i].getHp();
		}

	}

	public void atk() {
		boolean result = false;

		int atkrnd = (int) ((Math.random() * 100) + 1); // 스킬발동 조건을 만듬.

		for (int i = 0; result == true; i++) {
			now(); // 현재 상태를 표시한다.
			for (int j = 0; j < monAry.length; j++) {
				// 몬스터의 공격
				System.out.println("몬스터가 공격합니다.");
				heroNowhp -= (monAry[j].getDmg() - h1.getDefence());
				// 히어로의 공격, 공격 전 널 값을 검사한다.
				
				for (int k = 0; k < monAry.length; k++) {
					if (monAry[k] != null) {
						System.out.println(h1.getName() + "가 공격합니다.");
						
						//공격 계산전에 스킬 발동 조건이 갖추어지면 데미지를 상승시킨다.
						if (atkrnd >= 30) {
							System.out.println("스킬");
							h1.setDmg((int) (h1.getDmg() * 1.5));
						}
						monNowhp[j] -= (h1.getDmg() - monAry[j].getDefence());
						h1.setUp();
					}
					if (monNowhp[j] <= 0)
						monAry[j] = null;
					if (monAry[0] == null && monAry[1] == null && monAry[2] == null && monAry[3] == null
							&& monAry[4] == null) {
						getReward();
						result = true;
					}
				}
			}
		}

	}

	public void now() {
		System.out.println("=========================================");
		System.out.println(h1.getName() + ": " + h1.getHp());
		System.out.println("-----------------------------------------");
		System.out.print(monAry[0].getName() + ": " + monAry[0].getHp() + "||");
		System.out.print(monAry[1].getName() + ": " + monAry[1].getHp() + "||");
		System.out.print(monAry[2].getName() + ": " + monAry[2].getHp() + "||");
		System.out.print(monAry[3].getName() + ": " + monAry[3].getHp() + "||");
		System.out.println(monAry[4].getName() + ": " + monAry[4].getHp() + "||");
		System.out.println("=========================================");
	}

	public void getReward() {
		System.out.println("승리하셨습니다.");
		int expReward = 0;
		int moneyReward = 0;
		for (int i = 0; i < monAry.length; i++) {
			expReward += monAry[i].getExp();
			moneyReward = monAry[i].getMoney();
		}

		h1.setMoney(moneyReward);
		h1.setExp(expReward);
	}

}
