package com.local.ysf.Readers;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@Table(name="readers")
public class Readers {

	@Id
	@Type(type="uuid-char")
    @GeneratedValue(generator ="UUID")
    @GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "booksId", updatable = false, nullable = false)
	private UUID readersId;
	private String firstName;
	private String lastName;
	private int age;
	public Readers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Readers(UUID readersId, String firstName, String lastName, int age) {
		super();
		this.readersId = readersId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Readers(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public UUID getReadersId() {
		return readersId;
	}
	public void setReadersId(UUID readersId) {
		this.readersId = readersId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Readers [readersId=" + readersId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + "]";
	}
	
	
}
