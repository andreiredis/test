public class Player {
	
	public int id;
	public String name;
	
	public boolean equals (Object obj) {
		if (obj instanceof Player) {
			Player ref = (Player) obj;
			return (ref.id == id);
		}
		return false;
	}
	
	public Player (int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	int getPlayer() {
		return id;
	}
	
}
