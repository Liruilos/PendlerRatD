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

public class Administrator extends de.hhn.se.pmt.penlderratdbonus2.Nutzer {
	public Administrator() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRATOR_BONIFIKATION) {
			return ORM_bonifikation;
		}
		else if (key == ORMConstants.KEY_ADMINISTRATOR_USER) {
			return ORM_user;
		}
		else if (key == ORMConstants.KEY_ADMINISTRATOR_PROGRAMMPARTNER) {
			return ORM_programmpartner;
		}
		else if (key == ORMConstants.KEY_ADMINISTRATOR_ETAPPENZIEL) {
			return ORM_etappenziel;
		}
		else if (key == ORMConstants.KEY_ADMINISTRATOR_ANWENDER) {
			return ORM_anwender;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_bonifikation = new java.util.HashSet();
	
	private java.util.Set ORM_user = new java.util.HashSet();
	
	private java.util.Set ORM_programmpartner = new java.util.HashSet();
	
	private java.util.Set ORM_etappenziel = new java.util.HashSet();
	
	private java.util.Set ORM_anwender = new java.util.HashSet();
	
	private void setORM_Bonifikation(java.util.Set value) {
		this.ORM_bonifikation = value;
	}
	
	private java.util.Set getORM_Bonifikation() {
		return ORM_bonifikation;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection bonifikation = new de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_BONIFIKATION, ORMConstants.KEY_BONUS_PRÜFER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_User(java.util.Set value) {
		this.ORM_user = value;
	}
	
	private java.util.Set getORM_User() {
		return ORM_user;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection user = new de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_USER, ORMConstants.KEY_PENDLER_VERWALTER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Programmpartner(java.util.Set value) {
		this.ORM_programmpartner = value;
	}
	
	private java.util.Set getORM_Programmpartner() {
		return ORM_programmpartner;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenSetCollection programmpartner = new de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_PROGRAMMPARTNER, ORMConstants.KEY_DRITTUNTERNEHMEN_VERANTWORTLICHER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Etappenziel(java.util.Set value) {
		this.ORM_etappenziel = value;
	}
	
	private java.util.Set getORM_Etappenziel() {
		return ORM_etappenziel;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.MeilensteinSetCollection etappenziel = new de.hhn.se.pmt.penlderratdbonus2.MeilensteinSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_ETAPPENZIEL, ORMConstants.KEY_MEILENSTEIN_ERSTELLER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Anwender(java.util.Set value) {
		this.ORM_anwender = value;
	}
	
	private java.util.Set getORM_Anwender() {
		return ORM_anwender;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberSetCollection anwender = new de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATOR_ANWENDER, ORMConstants.KEY_ARBEITGEBER_BEGLEITER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void partnerRegistrieren() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void partneraccountLöschen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void registrieren() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void accountLöschen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
