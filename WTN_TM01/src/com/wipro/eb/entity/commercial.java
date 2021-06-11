package com.wipro.eb.entity;
public class commercial extends connection {
	public commercial(int currentReading,int previousReading,float []slabs) {
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
			if(billamount>=10000) {
					return billamount*1.09f;
			}
			else if(billamount>=5000) {
				return billamount*1.06f;
			}
			else {
				return billamount*1.02f;
			}	
	}
	}