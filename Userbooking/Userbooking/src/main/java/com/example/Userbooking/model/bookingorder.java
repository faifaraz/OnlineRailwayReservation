package com.example.Userbooking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Data
@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Document(collection="orders")
public class bookingorder {
	
	@Id
	private String id;
	private String train;
	private String startStation;
	private String endStation;
	private String name;
	private String age;
	private String gender;
	private String credit;
	private String address;
	private String berth;
	private String bankname;
	private String date;
	private String email;

public bookingorder() {
		
	}

public bookingorder(String id, String train, String startStation, String endStation, String name, String age,
		String gender, String credit, String address, String berth, String bankname, String date, String email) {
	super();
	this.id = id;
	this.train = train;
	this.startStation = startStation;
	this.endStation = endStation;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.credit = credit;
	this.address = address;
	this.berth = berth;
	this.bankname = bankname;
	this.date = date;
	this.email = email;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getTrain() {
	return train;
}

public void setTrain(String train) {
	this.train = train;
}

public String getStartStation() {
	return startStation;
}

public void setStartStation(String startStation) {
	this.startStation = startStation;
}

public String getEndStation() {
	return endStation;
}

public void setEndStation(String endStation) {
	this.endStation = endStation;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getCredit() {
	return credit;
}

public void setCredit(String credit) {
	this.credit = credit;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getBerth() {
	return berth;
}

public void setBerth(String berth) {
	this.berth = berth;
}

public String getBankname() {
	return bankname;
}

public void setBankname(String bankname) {
	this.bankname = bankname;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "bookingorder [id=" + id + ", train=" + train + ", startStation=" + startStation + ", endStation="
			+ endStation + ", name=" + name + ", age=" + age + ", gender=" + gender + ", credit=" + credit
			+ ", address=" + address + ", berth=" + berth + ", bankname=" + bankname + ", date=" + date + ", email="
			+ email + "]";
}


}
