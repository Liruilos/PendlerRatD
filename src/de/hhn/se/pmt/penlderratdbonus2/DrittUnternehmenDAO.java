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

public class DrittUnternehmenDAO {
	public static DrittUnternehmen loadDrittUnternehmenByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadDrittUnternehmenByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen getDrittUnternehmenByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getDrittUnternehmenByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadDrittUnternehmenByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen getDrittUnternehmenByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return getDrittUnternehmenByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (DrittUnternehmen) session.load(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen getDrittUnternehmenByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (DrittUnternehmen) session.get(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DrittUnternehmen) session.load(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen getDrittUnternehmenByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DrittUnternehmen) session.get(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDrittUnternehmen(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryDrittUnternehmen(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDrittUnternehmen(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return queryDrittUnternehmen(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen[] listDrittUnternehmenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listDrittUnternehmenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen[] listDrittUnternehmenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return listDrittUnternehmenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDrittUnternehmen(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen as DrittUnternehmen");
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
	
	public static List queryDrittUnternehmen(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen as DrittUnternehmen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DrittUnternehmen", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen[] listDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDrittUnternehmen(session, condition, orderBy);
			return (DrittUnternehmen[]) list.toArray(new DrittUnternehmen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen[] listDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDrittUnternehmen(session, condition, orderBy, lockMode);
			return (DrittUnternehmen[]) list.toArray(new DrittUnternehmen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadDrittUnternehmenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return loadDrittUnternehmenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DrittUnternehmen[] drittUnternehmens = listDrittUnternehmenByQuery(session, condition, orderBy);
		if (drittUnternehmens != null && drittUnternehmens.length > 0)
			return drittUnternehmens[0];
		else
			return null;
	}
	
	public static DrittUnternehmen loadDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DrittUnternehmen[] drittUnternehmens = listDrittUnternehmenByQuery(session, condition, orderBy, lockMode);
		if (drittUnternehmens != null && drittUnternehmens.length > 0)
			return drittUnternehmens[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDrittUnternehmenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateDrittUnternehmenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDrittUnternehmenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PenlderRatDBonusIIPersistentManager.instance().getSession();
			return iterateDrittUnternehmenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen as DrittUnternehmen");
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
	
	public static java.util.Iterator iterateDrittUnternehmenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen as DrittUnternehmen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DrittUnternehmen", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DrittUnternehmen createDrittUnternehmen() {
		return new de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen();
	}
	
	public static boolean save(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().saveObject(drittUnternehmen);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().deleteObject(drittUnternehmen);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lVerantwortlichers = drittUnternehmen.verantwortlicher.toArray();
			for(int i = 0; i < lVerantwortlichers.length; i++) {
				lVerantwortlichers[i].programmpartner.remove(drittUnternehmen);
			}
			return delete(drittUnternehmen);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.penlderratdbonus2.Administrator[] lVerantwortlichers = drittUnternehmen.verantwortlicher.toArray();
			for(int i = 0; i < lVerantwortlichers.length; i++) {
				lVerantwortlichers[i].programmpartner.remove(drittUnternehmen);
			}
			try {
				session.delete(drittUnternehmen);
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
	
	public static boolean refresh(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().refresh(drittUnternehmen);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.se.pmt.penlderratdbonus2.DrittUnternehmen drittUnternehmen) throws PersistentException {
		try {
			PenlderRatDBonusIIPersistentManager.instance().getSession().evict(drittUnternehmen);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
