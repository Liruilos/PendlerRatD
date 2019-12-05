/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreatePenlderRatDBonusIIData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator ldehhnsepmtpenlderratdbonus2Administrator = de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.createAdministrator();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : anwender, etappenziel, programmpartner, user, bonifikation
			de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.save(ldehhnsepmtpenlderratdbonus2Administrator);
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen ldehhnsepmtpenlderratdbonus2DrittUnternehmen = de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.createDrittUnternehmen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : verantwortlicher
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.save(ldehhnsepmtpenlderratdbonus2DrittUnternehmen);
			de.hhn.se.pmt.penlderratdbonus2.Bonus ldehhnsepmtpenlderratdbonus2Bonus = de.hhn.se.pmt.penlderratdbonus2.BonusDAO.createBonus();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : kunde, prüfer, belohnungVerfügbar, eingelöstePunkte, gesammeltePunkte, auszahlender, name
			de.hhn.se.pmt.penlderratdbonus2.BonusDAO.save(ldehhnsepmtpenlderratdbonus2Bonus);
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein ldehhnsepmtpenlderratdbonus2Meilenstein = de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.createMeilenstein();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ersteller, teilnehmer, meilenstein, name
			de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.save(ldehhnsepmtpenlderratdbonus2Meilenstein);
			de.hhn.se.pmt.penlderratdbonus2.Pendler ldehhnsepmtpenlderratdbonus2Pendler = de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.createPendler();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : errungenschaft, belohnung, verwalter, id
			de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.save(ldehhnsepmtpenlderratdbonus2Pendler);
			de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber ldehhnsepmtpenlderratdbonus2Arbeitgeber = de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.createArbeitgeber();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : entlohnung, begleiter
			de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.save(ldehhnsepmtpenlderratdbonus2Arbeitgeber);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePenlderRatDBonusIIData createPenlderRatDBonusIIData = new CreatePenlderRatDBonusIIData();
			try {
				createPenlderRatDBonusIIData.createTestData();
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
