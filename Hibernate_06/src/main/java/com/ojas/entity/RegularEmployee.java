package com.ojas.entity;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="REGULAR_Employee")
@PrimaryKeyJoinColumn(name="Eid")
public class RegularEmployee extends Employee {
	
	private float Salary;
	private int bonus;
	
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
