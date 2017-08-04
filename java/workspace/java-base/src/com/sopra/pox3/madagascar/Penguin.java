package com.sopra.pox3.madagascar;

public class Penguin extends Bird implements CanSlide{

/**public class Penguin extends Bird implements CanSlide, Comparable<Penguin>{
	
	String	name;
	Integer speed;
	

	public Penguin(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}


	@Override
		public String toString() {
			return name + ", speed=" + speed;
		}



	@Override
	public void slide(){
		System.out.println("Yahou!!!! at " +speed+ " km/h" );
	}
	


	@Override
	public int compareTo(Penguin other) {
		return this.name.compareTo(other.name);
	}

}**/
	String name;
	Integer speed = 24; // tous les pingouins sont a la meme vitesse
	
	
	public Penguin(String name, Integer speed){
		this(name);
		this.speed=speed;
	}

	public Penguin(String name){
		if (name.isEmpty()){
			throw new IllegalArgumentException("Empty name for Pengouin");
		}
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public void slide() {
		System.out.println("Whooho at " + this.speed);
		
	}


	
	
}
