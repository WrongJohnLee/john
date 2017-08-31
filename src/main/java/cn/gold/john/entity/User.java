package cn.gold.john.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;



@Entity
@Table
public class User {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRodecode() {
		return rodecode;
	}
	public void setRodecode(String rodecode) {
		this.rodecode = rodecode;
	}
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String rodecode;
}
