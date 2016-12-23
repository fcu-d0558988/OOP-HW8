package fcu.iecs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon pkm1=new Bulbasaur("I am Bulbasaur",pokemonType.GRASS,123);
		Pokemon pkm2=new Charmander("I am Charmander",pokemonType.FIRE,456);
		Pokemon pkm3=new Psyduck("I am Psyduck",pokemonType.WATER,89);
		GYM gym=new GYM();
		gym.fight(pkm1);
		gym.fight(pkm2);
		gym.fight(pkm3);

	}

}
