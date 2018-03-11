package org.springStarter.dao.model.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonModel {
	@Id
	private String personId;
	private String name; 
	private String mailId;
	private int score; 
	
	public String getpersonId() {
		return personId;
	}
	public void setpersonId(String personId1) {
		personId = personId1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
