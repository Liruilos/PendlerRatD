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

public class DrittUnternehmen extends de.hhn.se.pmt.penlderratdbonus2.Partner {
	public DrittUnternehmen() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DRITTUNTERNEHMEN_VERANTWORTLICHER) {
			return ORM_verantwortlicher;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_verantwortlicher = new java.util.HashSet();
	
	private void setORM_Verantwortlicher(java.util.Set value) {
		this.ORM_verantwortlicher = value;
	}
	
	private java.util.Set getORM_Verantwortlicher() {
		return ORM_verantwortlicher;
	}
	
	public final de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection verantwortlicher = new de.hhn.se.pmt.penlderratdbonus2.AdministratorSetCollection(this, _ormAdapter, ORMConstants.KEY_DRITTUNTERNEHMEN_VERANTWORTLICHER, ORMConstants.KEY_ADMINISTRATOR_PROGRAMMPARTNER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void qrCodeScannen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void ausgezahltePunkteAnzeigen() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
