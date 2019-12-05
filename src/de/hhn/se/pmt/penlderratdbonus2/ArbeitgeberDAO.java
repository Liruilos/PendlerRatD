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

public class ArbeitgeberDAO {
	public static Arbeitgeber loadArbeitgeberByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadArbeitgeberByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber getArbeitgeberByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getArbeitgeberByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadArbeitgeberByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber getArbeitgeberByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getArbeitgeberByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Arbeitgeber) session.load(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber getArbeitgeberByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Arbeitgeber) session.get(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Arbeitgeber) session.load(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber getArbeitgeberByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Arbeitgeber) session.get(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArbeitgeber(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryArbeitgeber(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArbeitgeber(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryArbeitgeber(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber[] listArbeitgeberByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listArbeitgeberByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber[] listArbeitgeberByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listArbeitgeberByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArbeitgeber(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber as Arbeitgeber");
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
	
	public static List queryArbeitgeber(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber as Arbeitgeber");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Arbeitgeber", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber[] listArbeitgeberByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArbeitgeber(session, condition, orderBy);
			return (Arbeitgeber[]) list.toArray(new Arbeitgeber[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber[] listArbeitgeberByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArbeitgeber(session, condition, orderBy, lockMode);
			return (Arbeitgeber[]) list.toArray(new Arbeitgeber[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadArbeitgeberByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadArbeitgeberByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber loadArbeitgeberByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Arbeitgeber[] arbeitgebers = listArbeitgeberByQuery(session, condition, orderBy);
		if (arbeitgebers != null && arbeitgebers.length > 0)
			return arbeitgebers[0];
		else
			return null;
	}
	
	public static Arbeitgeber loadArbeitgeberByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Arbeitgeber[] arbeitgebers = listArbeitgeberByQuery(session, condition, orderBy, lockMode);
		if (arbeitgebers != null && arbeitgebers.length > 0)
			return arbeitgebers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArbeitgeberByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateArbeitgeberByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArbeitgeberByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateArbeitgeberByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArbeitgeberByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber as Arbeitgeber");
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
	
	public static java.util.Iterator iterateArbeitgeberByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber as Arbeitgeber");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Arbeitgeber", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Arbeitgeber createArbeitgeber() {
		return new de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(arbeitgeber);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(arbeitgeber);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lBegleiters = arbeitgeber.begleiter.toArray();
			for(int i = 0; i < lBegleiters.length; i++) {
				lBegleiters[i].anwender.remove(arbeitgeber);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lAngestellters = arbeitgeber.angestellter.toArray();
			for(int i = 0; i < lAngestellters.length; i++) {
				lAngestellters[i].setUnternehmen(null);
			}
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lEntlohnungs = arbeitgeber.entlohnung.toArray();
			for(int i = 0; i < lEntlohnungs.length; i++) {
				lEntlohnungs[i].setAuszahlender(null);
			}
			return delete(arbeitgeber);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lBegleiters = arbeitgeber.begleiter.toArray();
			for(int i = 0; i < lBegleiters.length; i++) {
				lBegleiters[i].anwender.remove(arbeitgeber);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lAngestellters = arbeitgeber.angestellter.toArray();
			for(int i = 0; i < lAngestellters.length; i++) {
				lAngestellters[i].setUnternehmen(null);
			}
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lEntlohnungs = arbeitgeber.entlohnung.toArray();
			for(int i = 0; i < lEntlohnungs.length; i++) {
				lEntlohnungs[i].setAuszahlender(null);
			}
			try {
				session.delete(arbeitgeber);
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
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(arbeitgeber);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.Arbeitgeber arbeitgeber) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(arbeitgeber);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
