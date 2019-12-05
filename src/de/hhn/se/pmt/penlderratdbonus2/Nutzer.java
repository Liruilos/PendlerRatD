/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.penlderratdbonus2;

public abstract class Nutzer {
	public Nutzer() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Nutzer))
			return false;
		Nutzer nutzer = (Nutzer)aObj;
		if ((getEmail() != null && !getEmail().equals(nutzer.getEmail())) || (getEmail() == null && nutzer.getEmail() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getEmail() == null ? 0 : getEmail().hashCode());
		return hashcode;
	}
	
	private String email;
	
	private String password;
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getORMID() {
		return getEmail();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void einloggen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void ausloggen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getEmail());
	}
	
}
