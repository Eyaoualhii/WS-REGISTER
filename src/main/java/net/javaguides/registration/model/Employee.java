package net.javaguides.registration.model;


public class Employee {
private String id;
private String prenom;
private String nom;
private String username;
private String password;
private String address;
private String contact;


public Employee() {
	super();
}


public Employee(String id, String prenom, String nom, String username, String password, String address,
		String contact) {

	this.id = id;
	this.prenom = prenom;
	this.nom = nom;
	this.username = username;
	this.password = password;
	this.address = address;
	this.contact = contact;
}


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

	
	
}
