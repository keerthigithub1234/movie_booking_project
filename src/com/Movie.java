package com;

public class Movie {

	private String mName;
	private int mtikets;
	private int mcost;

	public Movie(String mName, int mtikets, int mcost)
	{
		this.mName = mName;
		this.mtikets = mtikets;
		this.mcost = mcost;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getMtikets() {
		return mtikets;
	}

	public void setMtikets(int mtikets) {
		this.mtikets = mtikets;
	}

	public int getMcost() {
		return mcost;
	}

	public void setMcost(int mcost) {
		this.mcost = mcost;
	}

	@Override
	public String toString() {
		return "Movie [mName=" + mName + ", mtikets=" + mtikets + ", mcost=" + mcost + "]";
	}




}
