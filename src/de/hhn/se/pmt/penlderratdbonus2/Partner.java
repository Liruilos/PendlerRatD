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

public abstract class Partner extends de.hhn.se.pmt.penlderratdbonus2.Nutzer {
	public Partner() {
	}
	
	private int anzahlBoni;
	
	private long ausgezahltPunkte;
	
	private String unternehmenName;
	
	public void setAnzahlBoni(int value) {
		this.anzahlBoni = value;
	}
	
	public int getAnzahlBoni() {
		return anzahlBoni;
	}
	
	public void setAusgezahltPunkte(long value) {
		this.ausgezahltPunkte = value;
	}
	
	public long getAusgezahltPunkte() {
		return ausgezahltPunkte;
	}
	
	public void setUnternehmenName(String value) {
		this.unternehmenName = value;
	}
	
	public String getUnternehmenName() {
		return unternehmenName;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
