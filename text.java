package twitter;

import java.awt.Graphics;


public class text {
	private String stuff;
	private int locationx;
	private int locationy;
	
	public text(){
		stuff="null";
		locationx=0;
		locationy=0;
		
	}
	
	public void paint(Graphics g)
	{
	   g.drawString(stuff, locationx,locationy);
	}

	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public int getLocationy() {
		return locationy;
	}

	public void setLocationy(int locationy) {
		this.locationy = locationy;
	}

	public int getLocationx() {
		return locationx;
	}

	public void setLocationx(int locationx) {
		this.locationx = locationx;
	}

	
}
