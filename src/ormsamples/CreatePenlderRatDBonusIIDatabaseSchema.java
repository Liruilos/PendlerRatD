/**
 * Licensee: Christopher Meyer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreatePenlderRatDBonusIIDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance());
			de.hhn.se.pmt.penlderratdbonus2.PenlderRatDBonusIIPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
