package com.ojas.collnSet;

import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "QUESTION")
public class Question {
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	public int qId;
	public String qName;
	@OneToMany(cascade = CascadeType.ALL)
	public Set<Answers> answer;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public Set<Answers> getAnswer() {
		return answer;
	}

	public void setAnswer(Set<Answers> answer) {
		this.answer = answer;
	}

}
