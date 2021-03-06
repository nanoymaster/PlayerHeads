package org.shininet.bukkit.playerheads;

public enum CustomSkullType {
	
	SPIDER("Kelevra_V", PlayerHeads.format(Lang.HEAD_SPIDER)),
	ENDERMAN("Violit", PlayerHeads.format(Lang.HEAD_ENDERMAN)),
	BLAZE("Blaze_Head", PlayerHeads.format(Lang.HEAD_BLAZE));
	
	private final String owner;
	private final String displayName;
	
	CustomSkullType(String owner, String displayName) {
		this.owner = owner;
		this.displayName = displayName;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getDisplayName() {
		return displayName;
	}
}
