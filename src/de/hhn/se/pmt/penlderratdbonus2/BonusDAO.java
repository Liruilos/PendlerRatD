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

public class BonusDAO {
	public static Bonus loadBonusByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadBonusByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus getBonusByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getBonusByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadBonusByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus getBonusByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getBonusByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Bonus) session.load(de.hhn.se.pmt.penlderratdbonus2.Bonus.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus getBonusByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Bonus) session.get(de.hhn.se.pmt.penlderratdbonus2.Bonus.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bonus) session.load(de.hhn.se.pmt.penlderratdbonus2.Bonus.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus getBonusByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bonus) session.get(de.hhn.se.pmt.penlderratdbonus2.Bonus.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBonus(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryBonus(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBonus(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryBonus(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus[] listBonusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listBonusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus[] listBonusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listBonusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBonus(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Bonus as Bonus");
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
	
	public static List queryBonus(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Bonus as Bonus");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bonus", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus[] listBonusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBonus(session, condition, orderBy);
			return (Bonus[]) list.toArray(new Bonus[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus[] listBonusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBonus(session, condition, orderBy, lockMode);
			return (Bonus[]) list.toArray(new Bonus[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadBonusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadBonusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus loadBonusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Bonus[] bonuses = listBonusByQuery(session, condition, orderBy);
		if (bonuses != null && bonuses.length > 0)
			return bonuses[0];
		else
			return null;
	}
	
	public static Bonus loadBonusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Bonus[] bonuses = listBonusByQuery(session, condition, orderBy, lockMode);
		if (bonuses != null && bonuses.length > 0)
			return bonuses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBonusByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateBonusByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBonusByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateBonusByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBonusByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Bonus as Bonus");
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
	
	public static java.util.Iterator iterateBonusByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Bonus as Bonus");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bonus", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bonus createBonus() {
		return new de.hhn.se.pmt.penlderratdbonus2.Bonus();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(bonus);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(bonus);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus)throws PersistentException {
		try {
			if (bonus.getAuszahlender() != null) {
				bonus.getAuszahlender().entlohnung.remove(bonus);
			}
			
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lPrüfers = bonus.prüfer.toArray();
			for(int i = 0; i < lPrüfers.length; i++) {
				lPrüfers[i].bonifikation.remove(bonus);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lKundes = bonus.kunde.toArray();
			for(int i = 0; i < lKundes.length; i++) {
				lKundes[i].belohnung.remove(bonus);
			}
			return delete(bonus);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (bonus.getAuszahlender() != null) {
				bonus.getAuszahlender().entlohnung.remove(bonus);
			}
			
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lPrüfers = bonus.prüfer.toArray();
			for(int i = 0; i < lPrüfers.length; i++) {
				lPrüfers[i].bonifikation.remove(bonus);
			}
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lKundes = bonus.kunde.toArray();
			for(int i = 0; i < lKundes.length; i++) {
				lKundes[i].belohnung.remove(bonus);
			}
			try {
				session.delete(bonus);
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
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(bonus);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.Bonus bonus) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(bonus);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
