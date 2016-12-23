package fcu.iecs;

public abstract class Pokemon implements Fightable {
	private String nickName;
	private pokemonType type;
	private int cp;
	

	public Pokemon(String nickName, pokemonType type, int cp) {
		super();
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}


	@Override
	public abstract void attack();


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public pokemonType getType() {
		return type;
	}
	
	
	

}
