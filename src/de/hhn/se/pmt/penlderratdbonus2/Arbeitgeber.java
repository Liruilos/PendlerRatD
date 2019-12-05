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

public class Arbeitgeber extends de.hhn.se.pmt.penlderratdbonus2.Partner {
	public Arbeitgeber() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARBEITGEBER_BEGLEITER) {
			return ORM_begleiter;
		}
		else if (key == ORMConstants.KEY_ARBEITGEBER_ANGESTELLTER) {
			return ORM_angestellter;
		}
		else if (key == ORMConstants.KEY_ARBEITGEBER_ENTLOHNUNG) {
			return ORM_entlohnung;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_begleiter = new java.util.HashSet();
	
	private java.util.Set ORM_angestellter = new java.util.HashSet();
	
	private java.util.Set ORM_entlohnung = new java.util.HashSet();
	
	private void setORM_Begleiter(java.util.Set value) {
		this.ORM_begleiter = value;
	}
	
	private java.util.Set getORM_Begleiter() {
		return ORM_begleiter;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection begleiter = new de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_ARBEITGEBER_BEGLEITER, ORMConstants.KEY_ADMINISTRATOR_ANWENDER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Angestellter(java.util.Set value) {
		this.ORM_angestellter = value;
	}
	
	private java.util.Set getORM_Angestellter() {
		return ORM_angestellter;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection angestellter = new de.hhn.se.pmt.penlderratdbonus2.PendlerSetCollection(this, _ormAdapter, ORMConstants.KEY_ARBEITGEBER_ANGESTELLTER, ORMConstants.KEY_PENDLER_UNTERNEHMEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Entlohnung(java.util.Set value) {
		this.ORM_entlohnung = value;
	}
	
	private java.util.Set getORM_Entlohnung() {
		return ORM_entlohnung;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection entlohnung = new de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection(this, _ormAdapter, ORMConstants.KEY_ARBEITGEBER_ENTLOHNUNG, ORMConstants.KEY_BONUS_AUSZAHLENDER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void angestelltenAnfrageAnnehmen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void angestelltenanfrageAblehnen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gesamtpunktzahlAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void top5Anzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
