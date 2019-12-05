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

public class PendlerDAO {
	public static Pendler loadPendlerByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadPendlerByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler getPendlerByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getPendlerByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadPendlerByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler getPendlerByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getPendlerByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Pendler) session.load(de.hhn.se.pmt.penlderratdbonus2.Pendler.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler getPendlerByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Pendler) session.get(de.hhn.se.pmt.penlderratdbonus2.Pendler.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendler) session.load(de.hhn.se.pmt.penlderratdbonus2.Pendler.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler getPendlerByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendler) session.get(de.hhn.se.pmt.penlderratdbonus2.Pendler.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendler(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryPendler(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendler(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryPendler(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler[] listPendlerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listPendlerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler[] listPendlerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listPendlerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendler(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Pendler as Pendler");
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
	
	public static List queryPendler(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Pendler as Pendler");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendler", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler[] listPendlerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPendler(session, condition, orderBy);
			return (Pendler[]) list.toArray(new Pendler[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler[] listPendlerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPendler(session, condition, orderBy, lockMode);
			return (Pendler[]) list.toArray(new Pendler[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadPendlerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadPendlerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler loadPendlerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pendler[] pendlers = listPendlerByQuery(session, condition, orderBy);
		if (pendlers != null && pendlers.length > 0)
			return pendlers[0];
		else
			return null;
	}
	
	public static Pendler loadPendlerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pendler[] pendlers = listPendlerByQuery(session, condition, orderBy, lockMode);
		if (pendlers != null && pendlers.length > 0)
			return pendlers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePendlerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iteratePendlerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendlerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iteratePendlerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendlerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Pendler as Pendler");
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
	
	public static java.util.Iterator iteratePendlerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Pendler as Pendler");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendler", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendler createPendler() {
		return new de.hhn.se.pmt.penlderratdbonus2.Pendler();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(pendler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(pendler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler)throws PersistentException {
		try {
			if (pendler.getUnternehmen() != null) {
				pendler.getUnternehmen().angestellter.remove(pendler);
			}
			
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lVerwalters = pendler.verwalter.toArray();
			for(int i = 0; i < lVerwalters.length; i++) {
				lVerwalters[i].user.remove(pendler);
			}
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lBelohnungs = pendler.belohnung.toArray();
			for(int i = 0; i < lBelohnungs.length; i++) {
				lBelohnungs[i].kunde.remove(pendler);
			}
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein[] lErrungenschafts = pendler.errungenschaft.toArray();
			for(int i = 0; i < lErrungenschafts.length; i++) {
				lErrungenschafts[i].teilnehmer.remove(pendler);
			}
			return delete(pendler);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pendler.getUnternehmen() != null) {
				pendler.getUnternehmen().angestellter.remove(pendler);
			}
			
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lVerwalters = pendler.verwalter.toArray();
			for(int i = 0; i < lVerwalters.length; i++) {
				lVerwalters[i].user.remove(pendler);
			}
			de.hhn.se.pmt.penlderratdbonus2.Bonus[] lBelohnungs = pendler.belohnung.toArray();
			for(int i = 0; i < lBelohnungs.length; i++) {
				lBelohnungs[i].kunde.remove(pendler);
			}
			de.hhn.se.pmt.penlderratdbonus2.Meilenstein[] lErrungenschafts = pendler.errungenschaft.toArray();
			for(int i = 0; i < lErrungenschafts.length; i++) {
				lErrungenschafts[i].teilnehmer.remove(pendler);
			}
			try {
				session.delete(pendler);
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
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(pendler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.Pendler pendler) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(pendler);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
