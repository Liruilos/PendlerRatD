/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeletePenlderRatDBonusIIData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator ldehhnsepmtpenlderratdbonus2Administrator = de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.loadAdministratorByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.AdministratorDAO.delete(ldehhnsepmtpenlderratdbonus2Administrator);
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen ldehhnsepmtpenlderratdbonus2DrittUnternehmen = de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.loadDrittUnternehmenByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmenDAO.delete(ldehhnsepmtpenlderratdbonus2DrittUnternehmen);
			de.hhn.se.pmt.penlderratdbonus2.Bonus ldehhnsepmtpenlderratdbonus2Bonus = de.hhn.se.pmt.penlderratdbonus2.BonusDAO.loadBonusByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.BonusDAO.delete(ldehhnsepmtpenlderratdbonus2Bonus);
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein ldehhnsepmtpenlderratdbonus2Meilenstein = de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.loadMeilensteinByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.MeilensteinDAO.delete(ldehhnsepmtpenlderratdbonus2Meilenstein);
			de.hhn.se.pmt.penlderratdbonus2.Pendler ldehhnsepmtpenlderratdbonus2Pendler = de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.loadPendlerByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.PendlerDAO.delete(ldehhnsepmtpenlderratdbonus2Pendler);
			de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber ldehhnsepmtpenlderratdbonus2Arbeitgeber = de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.loadArbeitgeberByQuery(null, null);
			// Delete the persistent object
			de.hhn.se.pmt.penlderratdbonus2.ArbeitgeberDAO.delete(ldehhnsepmtpenlderratdbonus2Arbeitgeber);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePenlderRatDBonusIIData deletePenlderRatDBonusIIData = new DeletePenlderRatDBonusIIData();
			try {
				deletePenlderRatDBonusIIData.deleteTestData();
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
