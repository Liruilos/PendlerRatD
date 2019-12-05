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

public class MeilensteinDAO {
	public static Meilenstein loadMeilensteinByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadMeilensteinByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein getMeilensteinByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getMeilensteinByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadMeilensteinByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein getMeilensteinByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getMeilensteinByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Meilenstein) session.load(de.hhn.se.pmt.penlderratdbonus2.Meilenstein.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein getMeilensteinByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Meilenstein) session.get(de.hhn.se.pmt.penlderratdbonus2.Meilenstein.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Meilenstein) session.load(de.hhn.se.pmt.penlderratdbonus2.Meilenstein.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein getMeilensteinByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Meilenstein) session.get(de.hhn.se.pmt.penlderratdbonus2.Meilenstein.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMeilenstein(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryMeilenstein(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMeilenstein(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryMeilenstein(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein[] listMeilensteinByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listMeilensteinByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein[] listMeilensteinByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listMeilensteinByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMeilenstein(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Meilenstein as Meilenstein");
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
	
	public static List queryMeilenstein(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Meilenstein as Meilenstein");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Meilenstein", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein[] listMeilensteinByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMeilenstein(session, condition, orderBy);
			return (Meilenstein[]) list.toArray(new Meilenstein[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein[] listMeilensteinByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMeilenstein(session, condition, orderBy, lockMode);
			return (Meilenstein[]) list.toArray(new Meilenstein[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadMeilensteinByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadMeilensteinByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein loadMeilensteinByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Meilenstein[] meilensteins = listMeilensteinByQuery(session, condition, orderBy);
		if (meilensteins != null && meilensteins.length > 0)
			return meilensteins[0];
		else
			return null;
	}
	
	public static Meilenstein loadMeilensteinByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Meilenstein[] meilensteins = listMeilensteinByQuery(session, condition, orderBy, lockMode);
		if (meilensteins != null && meilensteins.length > 0)
			return meilensteins[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMeilensteinByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateMeilensteinByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMeilensteinByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateMeilensteinByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMeilensteinByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Meilenstein as Meilenstein");
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
	
	public static java.util.Iterator iterateMeilensteinByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.Meilenstein as Meilenstein");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Meilenstein", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Meilenstein createMeilenstein() {
		return new de.hhn.se.pmt.penlderratdbonus2.Meilenstein();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(meilenstein);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(meilenstein);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lTeilnehmers = meilenstein.teilnehmer.toArray();
			for(int i = 0; i < lTeilnehmers.length; i++) {
				lTeilnehmers[i].errungenschaft.remove(meilenstein);
			}
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lErstellers = meilenstein.ersteller.toArray();
			for(int i = 0; i < lErstellers.length; i++) {
				lErstellers[i].etappenziel.remove(meilenstein);
			}
			return delete(meilenstein);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Pendler[] lTeilnehmers = meilenstein.teilnehmer.toArray();
			for(int i = 0; i < lTeilnehmers.length; i++) {
				lTeilnehmers[i].errungenschaft.remove(meilenstein);
			}
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lErstellers = meilenstein.ersteller.toArray();
			for(int i = 0; i < lErstellers.length; i++) {
				lErstellers[i].etappenziel.remove(meilenstein);
			}
			try {
				session.delete(meilenstein);
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
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(meilenstein);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.Meilenstein meilenstein) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(meilenstein);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
