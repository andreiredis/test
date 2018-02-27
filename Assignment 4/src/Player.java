public class Player {
	
	public int id;
	
	public boolean equals (Object obj) {
		if (obj instanceof Player) {
			Player ref = (Player) obj;
			return (ref.id == id);
		}
		return false;
	}
	
	public Player (int id) {
		this.id = id;
		
	}
	
	int getPlayer() {
		return id;
	}
	
}
