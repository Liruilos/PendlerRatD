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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AdministratorDAO {
	public static Administrator loadAdministratorByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadAdministratorByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator getAdministratorByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getAdministratorByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadAdministratorByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator getAdministratorByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getAdministratorByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Administrator) session.load(de.hhn.se.pmt.penlderratdbonus2.Administrator.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator getAdministratorByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Administrator) session.get(de.hhn.se.pmt.penlderratdbonus2.Administrator.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrator) session.load(de.hhn.se.pmt.penlderratdbonus2.Administrator.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator getAdministratorByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrator) session.get(de.hhn.se.pmt.penlderratdbonus2.Administrator.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrator(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryAdministrator(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrator(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryAdministrator(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator[] listAdministratorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listAdministratorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator[] listAdministratorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listAdministratorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrator(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Administrator as Administrator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrator(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Administrator as Administrator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrator", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator[] listAdministratorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrator(session, condition, orderBy);
			return (Administrator[]) list.toArray(new Administrator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator[] listAdministratorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrator(session, condition, orderBy, lockMode);
			return (Administrator[]) list.toArray(new Administrator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadAdministratorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadAdministratorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator loadAdministratorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrator[] administrators = listAdministratorByQuery(session, condition, orderBy);
		if (administrators != null && administrators.length > 0)
			return administrators[0];
		else
			return null;
	}
	
	public static Administrator loadAdministratorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrator[] administrators = listAdministratorByQuery(session, condition, orderBy, lockMode);
		if (administrators != null && administrators.length > 0)
			return administrators[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministratorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateAdministratorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministratorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateAdministratorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministratorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Administrator as Administrator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministratorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Administrator as Administrator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrator", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrator createAdministrator() {
		return new de.hhn.se.pmt.penlderratdbonus2.Administrator();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(administrator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(administrator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lBonifikations = administrator.bonifikation.toArray();
			for(int i = 0; i < lBonifikations.length; i++) {
				lBonifikations[i].prüfer.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lUsers = administrator.user.toArray();
			for(int i = 0; i < lUsers.length; i++) {
				lUsers[i].verwalter.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen[] lProgrammpartners = administrator.programmpartner.toArray();
			for(int i = 0; i < lProgrammpartners.length; i++) {
				lProgrammpartners[i].verantwortlicher.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein[] lEtappenziels = administrator.etappenziel.toArray();
			for(int i = 0; i < lEtappenziels.length; i++) {
				lEtappenziels[i].ersteller.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber[] lAnwenders = administrator.anwender.toArray();
			for(int i = 0; i < lAnwenders.length; i++) {
				lAnwenders[i].begleiter.remove(administrator);
			}
			return delete(administrator);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lBonifikations = administrator.bonifikation.toArray();
			for(int i = 0; i < lBonifikations.length; i++) {
				lBonifikations[i].prüfer.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lUsers = administrator.user.toArray();
			for(int i = 0; i < lUsers.length; i++) {
				lUsers[i].verwalter.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen[] lProgrammpartners = administrator.programmpartner.toArray();
			for(int i = 0; i < lProgrammpartners.length; i++) {
				lProgrammpartners[i].verantwortlicher.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein[] lEtappenziels = administrator.etappenziel.toArray();
			for(int i = 0; i < lEtappenziels.length; i++) {
				lEtappenziels[i].ersteller.remove(administrator);
			}
			de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber[] lAnwenders = administrator.anwender.toArray();
			for(int i = 0; i < lAnwenders.length; i++) {
				lAnwenders[i].begleiter.remove(administrator);
			}
			try {
				session.delete(administrator);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(administrator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.Administrator administrator) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(administrator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
