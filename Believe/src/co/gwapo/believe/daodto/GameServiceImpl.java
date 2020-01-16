package co.gwapo.believe.daodto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.gwapo.believe.Status.Hero;
import co.gwapo.believe.Status.Monster;

public class GameServiceImpl extends GameDao {

	private final String MAKEUSER= "INSERT INTO PLAYER(USER_ID, USER_PASSWORD, STR,DEX,WIS,EXP,MONEY,STAGE,heroname)VALUES(?,?, ?, ?,?,?,?,?,?)";
	private final String STAGE = "SELECT STAGE FROM PLAYER";
	private final String MAKEMONSTER = "SELECT * FROM MONSTER WHERE STR + DEX + WIS < ?";
	private final String SELECTHERO = "SELECT * FROM PLAYER";
	
	//dd
	
	public Hero selecthero() {
		try {
			Hero h1 = new Hero();
			psmt = conn.prepareStatement(SELECTHERO);
			rs = psmt.executeQuery();
			h1.setName(rs.getString("heroname"));
			h1.setStr(rs.getInt("str"));
			h1.setWis(rs.getInt("wis"));
			h1.setUser_id(rs.getString("user_id"));
			h1.setUser_password(rs.getString("user_password"));
			h1.setStage(rs.getInt("stage"));
			h1.setMoney(rs.getInt("money"));
			return h1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	public int makeuser(Hero h1) throws SQLException {
			psmt = conn.prepareStatement(MAKEUSER);
			psmt.setString(1, h1.getUser_id());
			psmt.setString(2, h1.getUser_password());
			psmt.setInt(3, h1.getStr());
			psmt.setInt(4, h1.getDex());
			psmt.setInt(5, h1.getWis());
			psmt.setInt(6, h1.getExp());
			psmt.setInt(7, h1.getMoney());
			psmt.setInt(8, h1.getStage());
			psmt.setString(9, h1.getName());
			int n = psmt.executeUpdate();
			if(n != 0) {
				System.out.println("케릭터가 생성되었습니다.");
			} else System.out.println("케릭터 생성에 실패했습니다.");
			
			if ( rs != null ) try{rs.close();}catch(Exception e){}
			if ( psmt != null ) try{psmt.close();}catch(Exception e){}
			if ( conn != null ) try{conn.close();}catch(Exception e){}

			 
			
		return n;
	}
	
	public int selectStage() {
		Hero h1 = new Hero();
		try {
			psmt = conn.prepareStatement(STAGE);
			rs = psmt.executeQuery();
			if(rs.next()) {
				h1.setStage(rs.getInt("stage"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int stage = h1.getStage();
		if ( rs != null ) try{rs.close();}catch(Exception e){}
		if ( psmt != null ) try{psmt.close();}catch(Exception e){}
		if ( conn != null ) try{conn.close();}catch(Exception e){}
		return stage;
		
	}
	
	
	public List<Monster> selectmonster(int stage) {
		int monsterPoint = 0;
		Monster m1;
		List<Monster> list = new ArrayList<Monster>();
		if(stage <=10) {
			monsterPoint = 30;
		}
		if(stage <=30 && stage > 10) {
			monsterPoint = 100;
		}
		if(stage <= 50 && stage >30 ) {
			monsterPoint = 500;
		}
		try {
			psmt = conn.prepareStatement(MAKEMONSTER);
			psmt.setInt(1, monsterPoint );
			rs=psmt.executeQuery();
			while(rs.next()) {
				m1 = new Monster();
				m1.setName(rs.getString("monstername"));
				m1.setStr(rs.getInt("str"));
				m1.setDex(rs.getInt("dex"));
				m1.setWis(rs.getInt("wis"));
				m1.setExp(rs.getInt("exp"));
				m1.setMoney(rs.getInt("money"));
				list.add(m1);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	
	
	
	
}
