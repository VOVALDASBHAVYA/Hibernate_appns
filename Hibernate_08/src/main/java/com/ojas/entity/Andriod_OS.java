package com.ojas.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="Android")

public class Andriod_OS extends Mobile {

		public int price;
		public String ProcesserType;
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getProcesserType() {
			return ProcesserType;
		}
		public void setProcesserType(String processerType) {
			ProcesserType = processerType;
		}
		
		
}
