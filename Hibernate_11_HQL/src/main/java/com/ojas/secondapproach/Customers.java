package com.ojas.secondapproach;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMERS")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customers {

	// public class Customers {
	@Id
	public int custId;
	public String custName;
	public int venid;

}
