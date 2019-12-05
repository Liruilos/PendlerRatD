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

public class Bonus {
	public Bonus() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Bonus))
			return false;
		Bonus bonus = (Bonus)aObj;
		if ((getName() != null && !getName().equals(bonus.getName())) || (getName() == null && bonus.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BONUS_PRÜFER) {
			return ORM_prüfer;
		}
		else if (key == ORMConstants.KEY_BONUS_KUNDE) {
			return ORM_kunde;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BONUS_AUSZAHLENDER) {
			this.auszahlender = (de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String name;
	
	private de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber auszahlender;
	
	private int gesammeltePunkte;
	
	private int eingelöstePunkte;
	
	private boolean belohnungVerfügbar;
	
	private java.util.Set ORM_prüfer = new java.util.HashSet();
	
	private java.util.Set ORM_kunde = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setGesammeltePunkte(int value) {
		this.gesammeltePunkte = value;
	}
	
	public int getGesammeltePunkte() {
		return gesammeltePunkte;
	}
	
	public void setEingelöstePunkte(int value) {
		this.eingelöstePunkte = value;
	}
	
	public int getEingelöstePunkte() {
		return eingelöstePunkte;
	}
	
	public void setBelohnungVerfügbar(boolean value) {
		this.belohnungVerfügbar = value;
	}
	
	public boolean getBelohnungVerfügbar() {
		return belohnungVerfügbar;
	}
	
	private void setORM_Prüfer(java.util.Set value) {
		this.ORM_prüfer = value;
	}
	
	private java.util.Set getORM_Prüfer() {
		return ORM_prüfer;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection prüfer = new de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_BONUS_PRÜFER, ORMConstants.KEY_ADMINISTRATOR_BONIFIKATION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Kunde(java.util.Set value) {
		this.ORM_kunde = value;
	}
	
	private java.util.Set getORM_Kunde() {
		return ORM_kunde;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection kunde = new de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection(this, _ormAdapter, ORMConstants.KEY_BONUS_KUNDE, ORMConstants.KEY_PENDLER_BELOHNUNG, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAuszahlender(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber value) {
		if (auszahlender != null) {
			auszahlender.entlohnung.remove(this);
		}
		if (value != null) {
			value.entlohnung.add(this);
		}
	}
	
	public de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber getAuszahlender() {
		return auszahlender;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Auszahlender(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber value) {
		this.auszahlender = value;
	}
	
	private de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber getORM_Auszahlender() {
		return auszahlender;
	}
	
	public void bonusErstellen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void bonusLöschen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void bonusÄndern() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void bonusEinlösen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
