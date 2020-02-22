
public class Character {

	private String name;
	
	private String race;
	
	private String playerClass;
	
	private int level;
	
	private String background;
	
	private int maxHp;
	
	private int currentHp;
	
	private int initiativeBonus;
	
	private int armorClass;
	
	private int passsiveWisdom;

	/**
	 * @param name
	 * @param race
	 * @param playerClass
	 * @param level
	 * @param background
	 * @param maxHp
	 * @param currentHp
	 * @param initiativeBonus
	 * @param armorClass
	 * @param passsiveWisdom
	 */
	public Character(String name, String race, String playerClass, int level, String background, int maxHp,
			int currentHp, int initiativeBonus, int armorClass, int passsiveWisdom) {
		super();
		this.name = name;
		this.race = race;
		this.playerClass = playerClass;
		this.level = level;
		this.background = background;
		this.maxHp = maxHp;
		this.currentHp = currentHp;
		this.initiativeBonus = initiativeBonus;
		this.armorClass = armorClass;
		this.passsiveWisdom = passsiveWisdom;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the playerClass
	 */
	public String getPlayerClass() {
		return playerClass;
	}

	/**
	 * @param playerClass the playerClass to set
	 */
	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * @param background the background to set
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * @return the maxHp
	 */
	public int getMaxHp() {
		return maxHp;
	}

	/**
	 * @param maxHp the maxHp to set
	 */
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	/**
	 * @return the currentHp
	 */
	public int getCurrentHp() {
		return currentHp;
	}

	/**
	 * @param currentHp the currentHp to set
	 */
	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	/**
	 * @return the initiativeBonus
	 */
	public int getInitiativeBonus() {
		return initiativeBonus;
	}

	/**
	 * @param initiativeBonus the initiativeBonus to set
	 */
	public void setInitiativeBonus(int initiativeBonus) {
		this.initiativeBonus = initiativeBonus;
	}

	/**
	 * @return the armorClass
	 */
	public int getArmorClass() {
		return armorClass;
	}

	/**
	 * @param armorClass the armorClass to set
	 */
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	/**
	 * @return the passsiveWisdom
	 */
	public int getPasssiveWisdom() {
		return passsiveWisdom;
	}

	/**
	 * @param passsiveWisdom the passsiveWisdom to set
	 */
	public void setPasssiveWisdom(int passsiveWisdom) {
		this.passsiveWisdom = passsiveWisdom;
	}
	
	
	
}
