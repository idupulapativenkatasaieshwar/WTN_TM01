package com.wipro.eb.entity;
public class domestic extends connection {
public domestic(int currentReading,int previousReading,float slabs[]) {
	super(currentReading,previousReading,slabs);
}
	
	public float computeBill() {
		int units=currentReading-previousReading;
		float billamount=0.0f;
		if(units>100) {
			billamount=50*slabs[0]+50*slabs[1]+(units-100)*slabs[2];
		}
		else if(units>50) {
			billamount=50*slabs[0]+(units-50)*slabs[1];
		}
		else {
			billamount=units*slabs[0];
		}
		return billamount;
	
}
}
