package com.tcs.assignment1.accountType;

import java.util.Date;

public class Current {
private float balance;
private String ownerName;
private Date createDate;
private String Status;
private String type;
private float overdraftBalance;
public Current(float balance, String ownerName, Date createDate, String status, String type, float overdraftBalance) {
	super();
	this.balance = balance;
	this.ownerName = ownerName;
	this.createDate = createDate;
	Status = status;
	this.type = type;
	this.overdraftBalance = overdraftBalance;
}
public float getBalance() {
	return balance;
}
public String getOwnerName() {
	return ownerName;
}
public Date getCreateDate() {
	return createDate;
}
public String getStatus() {
	return Status;
}
public String getType() {
	return type;
}
public float getOverdraftBalance() {
	return overdraftBalance;
}

}
