package org.akmalfairuz.bedrockproxy;


public class PlayerCheat {

    public Player player;
    public boolean antikb = false;
    public boolean haste = false;
    public boolean fakeLag = false;
    public String deviceModel = "";
    public int deviceOS;
    public boolean worlddownload;
    public int currentInputMode;

    public PlayerCheat(Player player) {
        this.player = player;
    }
}
