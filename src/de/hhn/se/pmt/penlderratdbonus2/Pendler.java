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

public class Pendler extends de.hhn.se.pmt.penlderratdbonus2.Nutzer {
	public Pendler() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PENDLER_VERWALTER) {
			return ORM_verwalter;
		}
		else if (key == ORMConstants.KEY_PENDLER_BELOHNUNG) {
			return ORM_belohnung;
		}
		else if (key == ORMConstants.KEY_PENDLER_ERRUNGENSCHAFT) {
			return ORM_errungenschaft;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PENDLER_UNTERNEHMEN) {
			this.unternehmen = (de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber) owner;
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
	
	private de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber unternehmen;
	
	private String name;
	
	private String vorname;
	
	private int id;
	
	private java.util.Set ORM_verwalter = new java.util.HashSet();
	
	private java.util.Set ORM_belohnung = new java.util.HashSet();
	
	private java.util.Set ORM_errungenschaft = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVorname(String value) {
		this.vorname = value;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	private void setORM_Verwalter(java.util.Set value) {
		this.ORM_verwalter = value;
	}
	
	private java.util.Set getORM_Verwalter() {
		return ORM_verwalter;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection verwalter = new de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_PENDLER_VERWALTER, ORMConstants.KEY_ADMINISTRATOR_USER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setUnternehmen(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber value) {
		if (unternehmen != null) {
			unternehmen.angestellter.remove(this);
		}
		if (value != null) {
			value.angestellter.add(this);
		}
	}
	
	public de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber getUnternehmen() {
		return unternehmen;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Unternehmen(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber value) {
		this.unternehmen = value;
	}
	
	private de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber getORM_Unternehmen() {
		return unternehmen;
	}
	
	private void setORM_Belohnung(java.util.Set value) {
		this.ORM_belohnung = value;
	}
	
	private java.util.Set getORM_Belohnung() {
		return ORM_belohnung;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection belohnung = new de.hhn.se.pmt.penlderratdbonus2.BonusSetCollection(this, _ormAdapter, ORMConstants.KEY_PENDLER_BELOHNUNG, ORMConstants.KEY_BONUS_KUNDE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Errungenschaft(java.util.Set value) {
		this.ORM_errungenschaft = value;
	}
	
	private java.util.Set getORM_Errungenschaft() {
		return ORM_errungenschaft;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.MeilensteinSetCollection errungenschaft = new de.hhn.se.pmt.penlderratdbonus2.MeilensteinSetCollection(this, _ormAdapter, ORMConstants.KEY_PENDLER_ERRUNGENSCHAFT, ORMConstants.KEY_MEILENSTEIN_TEILNEHMER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void punktestandAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void möglicheBoniAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void qrCodeGenerieren() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void erreichbareMeilensteineAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void erreichteMeilensteineAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void punkteFuerErreichteMeilensteineAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gefahreneStreckenAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void eingesparteEmissionenAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void eingesparteZeitAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void eingespartesGeldAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void verbrannteKalorienAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gesamtPunktzahlAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void arbeitgeberAnfragen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void rangAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void freundeEinladen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gruppeErstellen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void adminrechteAbgeben() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gruppeLöschen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void gruppenzielErstellen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void fortschrittGruppenzielAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void chatÖffnen() {
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
