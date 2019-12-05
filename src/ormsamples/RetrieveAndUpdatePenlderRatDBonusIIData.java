/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePenlderRatDBonusIIData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator ldehhnsepmtpenlderratdbonus2Administrator = de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.loadAdministratorByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.save(ldehhnsepmtpenlderratdbonus2Administrator);
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen ldehhnsepmtpenlderratdbonus2DrittUnternehmen = de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.loadDrittUnternehmenByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.save(ldehhnsepmtpenlderratdbonus2DrittUnternehmen);
			de.hhn.se.pmt.penlderratdbonus2.Bonus ldehhnsepmtpenlderratdbonus2Bonus = de.hhn.se.pmt.penlderratdbonus2.BonusDAO.loadBonusByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.BonusDAO.save(ldehhnsepmtpenlderratdbonus2Bonus);
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein ldehhnsepmtpenlderratdbonus2Meilenstein = de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.loadMeilensteinByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.save(ldehhnsepmtpenlderratdbonus2Meilenstein);
			de.hhn.se.pmt.penlderratdbonus2.Pendler ldehhnsepmtpenlderratdbonus2Pendler = de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.loadPendlerByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.save(ldehhnsepmtpenlderratdbonus2Pendler);
			de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber ldehhnsepmtpenlderratdbonus2Arbeitgeber = de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.loadArbeitgeberByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.save(ldehhnsepmtpenlderratdbonus2Arbeitgeber);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePenlderRatDBonusIIData retrieveAndUpdatePenlderRatDBonusIIData = new RetrieveAndUpdatePenlderRatDBonusIIData();
			try {
				retrieveAndUpdatePenlderRatDBonusIIData.retrieveAndUpdateTestData();
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
