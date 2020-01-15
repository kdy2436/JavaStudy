package co.gwapo.believe.menu;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		boolean b = true;
		int choice;
		
		System.out.println("용사님 무엇을 하시겠습니까?");
		System.out.println("==================메  인  메  뉴===================");
		System.out.println("                 1.전     투");
		System.out.println("                 2.케릭터정보");
		System.out.println("                 3.보 스 사 냥");
		System.out.println("                 4.나   가   기");
		System.out.println("==============================================");
		System.out.print("메뉴를 선택해주세요:");
		choice = sc.nextInt(); sc.nextLine();
		do {
			
			switch(choice) {
			
			case 1:
			battleMenu();
			break;
			
			case 2:
			CharecterMenu();
			break;	
			
			case 3:
			bossBattle();
			break;
			
			case 4:
			System.out.println("종료합니다.");
			b = false;
			break;
			
			}
			
		}while(b);
		
		
	}
	
	public void battleMenu() {
		boolean b = true;
		int choice;
		
		System.out.println("용사님 무엇을 하시겠습니까?");
		System.out.println("==================전  투  메  뉴===================");
		System.out.println("                 1.싸   운   다");
		System.out.println("                 2.돌 아 가 기");
		System.out.println("==============================================");
		System.out.print("메뉴를 선택해주세요:");
		choice = sc.nextInt(); sc.nextLine();
		do {
			
			switch(choice) {
			
			case 1:
			break;
			
			case 2:
			b = false;
			break;	
			
			
			}
			
		}while(b);
	}
	
	public void CharecterMenu() {
		boolean b = true;
		int choice;
		
		System.out.println("용사님 무엇을 하시겠습니까?");
		System.out.println("==================케 릭 터 정 보 창===================");
		System.out.println("                  1.스 테 이 터 스");
		System.out.println("                  2.스킬  보유  창");
		System.out.println("                  3.스  텟  구  매");
		System.out.println("                  4.나     가    기");
		System.out.println("==============================================");
		System.out.print("메뉴를 선택해주세요:");
		choice = sc.nextInt(); sc.nextLine();
		do {
			
			switch(choice) {
			
			case 1:
			break;
			
			case 2:
			break;	
			
			case 3:
			break;
			
			case 4:
			System.out.println("메인 메뉴로 돌아갑니다.");
			b = false;
			break;
			
			}
			
		}while(b);
	}
	
	public void bossBattle() {
		boolean b = true;
		int choice;
		
		System.out.println("용사님 무엇을 하시겠습니까?");
		System.out.println("==================전  투  메  뉴===================");
		System.out.println("                 1.싸   운   다");
		System.out.println("                 2.돌 아 가 기");
		System.out.println("==============================================");
		System.out.print("메뉴를 선택해주세요:");
		choice = sc.nextInt(); sc.nextLine();
		do {
			
			switch(choice) {
			
			case 1:
			break;
			
			case 2:
			b = false;
			break;	
			
			
			}
			
		}while(b);
		
	}
	
	public void createHero() {
		System.out.println("=============================================");
		System.out.println("용사님 게임에 접속하신 것을 환영합니다.");
		System.out.println("게임은 처음이시군요? 아이디와 비밀번호를 생성합니다.");
		System.out.println("=============================================");
		System.out.println("아이디를 입력해 주세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해 주세요:");
		String password = sc.nextLine();
		System.out.println("용사님의 이름은 무엇인가요?:");
		String name = sc.nextLine();
		System.out.println("=============================================");
		
		
		
	}
	
	
	

}
