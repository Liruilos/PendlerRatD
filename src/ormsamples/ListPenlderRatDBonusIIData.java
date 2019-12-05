/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListPenlderRatDBonusIIData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Administrator...");
		de.hhn.se.pmt.penlderratdbonus2.Administrator[] dehhnsepmtpenlderratdbonus2Administrators = de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.listAdministratorByQuery(null, null);
		int length = Math.min(dehhnsepmtpenlderratdbonus2Administrators.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2Administrators[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DrittUnternehmen...");
		de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen[] dehhnsepmtpenlderratdbonus2DrittUnternehmens = de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.listDrittUnternehmenByQuery(null, null);
		length = Math.min(dehhnsepmtpenlderratdbonus2DrittUnternehmens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2DrittUnternehmens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bonus...");
		de.hhn.se.pmt.penlderratdbonus2.Bonus[] dehhnsepmtpenlderratdbonus2Bonuses = de.hhn.se.pmt.penlderratdbonus2.BonusDAO.listBonusByQuery(null, null);
		length = Math.min(dehhnsepmtpenlderratdbonus2Bonuses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2Bonuses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Meilenstein...");
		de.hhn.se.pmt.penlderratdbonus2.Meilenstein[] dehhnsepmtpenlderratdbonus2Meilensteins = de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.listMeilensteinByQuery(null, null);
		length = Math.min(dehhnsepmtpenlderratdbonus2Meilensteins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2Meilensteins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendler...");
		de.hhn.se.pmt.penlderratdbonus2.Pendler[] dehhnsepmtpenlderratdbonus2Pendlers = de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.listPendlerByQuery(null, null);
		length = Math.min(dehhnsepmtpenlderratdbonus2Pendlers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2Pendlers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Arbeitgeber...");
		de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber[] dehhnsepmtpenlderratdbonus2Arbeitgebers = de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.listArbeitgeberByQuery(null, null);
		length = Math.min(dehhnsepmtpenlderratdbonus2Arbeitgebers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtpenlderratdbonus2Arbeitgebers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListPenlderRatDBonusIIData listPenlderRatDBonusIIData = new ListPenlderRatDBonusIIData();
			try {
				listPenlderRatDBonusIIData.listTestData();
			}
			finally {
				de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
