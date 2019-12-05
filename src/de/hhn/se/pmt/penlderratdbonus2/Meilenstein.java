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

public class Meilenstein {
	public Meilenstein() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Meilenstein))
			return false;
		Meilenstein meilenstein = (Meilenstein)aObj;
		if ((getName() != null && !getName().equals(meilenstein.getName())) || (getName() == null && meilenstein.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MEILENSTEIN_TEILNEHMER) {
			return ORM_teilnehmer;
		}
		else if (key == ORMConstants.KEY_MEILENSTEIN_ERSTELLER) {
			return ORM_ersteller;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String name;
	
	private int meilenstein;
	
	private java.util.Set ORM_teilnehmer = new java.util.HashSet();
	
	private java.util.Set ORM_ersteller = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setMeilenstein(int value) {
		this.meilenstein = value;
	}
	
	public int getMeilenstein() {
		return meilenstein;
	}
	
	private void setORM_Teilnehmer(java.util.Set value) {
		this.ORM_teilnehmer = value;
	}
	
	private java.util.Set getORM_Teilnehmer() {
		return ORM_teilnehmer;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection teilnehmer = new de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection(this, _ormAdapter, ORMConstants.KEY_MEILENSTEIN_TEILNEHMER, ORMConstants.KEY_PENDLER_ERRUNGENSCHAFT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Ersteller(java.util.Set value) {
		this.ORM_ersteller = value;
	}
	
	private java.util.Set getORM_Ersteller() {
		return ORM_ersteller;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection ersteller = new de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_MEILENSTEIN_ERSTELLER, ORMConstants.KEY_ADMINISTRATOR_ETAPPENZIEL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void meilensteinErstellen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void meilensteinLöschen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
