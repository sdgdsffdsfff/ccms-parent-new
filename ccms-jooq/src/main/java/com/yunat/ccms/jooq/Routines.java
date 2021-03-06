/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in ccms
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public final class Routines {

	/**
	 * Call ccms.func_get_dic_viewname
	 *
	 * @param pDicTypeId
	 * @param pTypeValue
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.String funcGetDicViewname(org.jooq.Configuration configuration, java.lang.Integer pDicTypeId, java.lang.String pTypeValue) {
		com.yunat.ccms.jooq.routines.FuncGetDicViewname f = new com.yunat.ccms.jooq.routines.FuncGetDicViewname();
		f.setPDicTypeId(pDicTypeId);
		f.setPTypeValue(pTypeValue);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get ccms.func_get_dic_viewname as a field
	 *
	 * @param pDicTypeId
	 * @param pTypeValue
	 */
	public static org.jooq.Field<java.lang.String> funcGetDicViewname(java.lang.Integer pDicTypeId, java.lang.String pTypeValue) {
		com.yunat.ccms.jooq.routines.FuncGetDicViewname f = new com.yunat.ccms.jooq.routines.FuncGetDicViewname();
		f.setPDicTypeId(pDicTypeId);
		f.setPTypeValue(pTypeValue);

		return f.asField();
	}

	/**
	 * Get ccms.func_get_dic_viewname as a field
	 *
	 * @param pDicTypeId
	 * @param pTypeValue
	 */
	public static org.jooq.Field<java.lang.String> funcGetDicViewname(org.jooq.Field<java.lang.Integer> pDicTypeId, org.jooq.Field<java.lang.String> pTypeValue) {
		com.yunat.ccms.jooq.routines.FuncGetDicViewname f = new com.yunat.ccms.jooq.routines.FuncGetDicViewname();
		f.setPDicTypeId(pDicTypeId);
		f.setPTypeValue(pTypeValue);

		return f.asField();
	}

	/**
	 * Call ccms.proc_dedup_customer
	 *
	 * @param pPlatCode IN parameter
	 * @param pParentPlat IN parameter
	 * @param pPlatPriority IN parameter
	 * @param pCustomerno IN parameter
	 * @param pFullName IN parameter
	 * @param pSex IN parameter
	 * @param pJob IN parameter
	 * @param pBirthYear IN parameter
	 * @param pBirthday IN parameter
	 * @param pEmail IN parameter
	 * @param pMobile IN parameter
	 * @param pPhone IN parameter
	 * @param pZip IN parameter
	 * @param pCountry IN parameter
	 * @param pState IN parameter
	 * @param pCity IN parameter
	 * @param pDistrict IN parameter
	 * @param pAddress IN parameter
	 * @param pChanged IN parameter
	 * @param pIsdup OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Boolean procDedupCustomer(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pParentPlat, java.lang.Short pPlatPriority, java.lang.String pCustomerno, java.lang.String pFullName, java.lang.String pSex, java.lang.String pJob, java.lang.Short pBirthYear, java.sql.Date pBirthday, java.lang.String pEmail, java.lang.String pMobile, java.lang.String pPhone, java.lang.String pZip, java.lang.String pCountry, java.lang.String pState, java.lang.String pCity, java.lang.String pDistrict, java.lang.String pAddress, java.sql.Timestamp pChanged) {
		com.yunat.ccms.jooq.routines.ProcDedupCustomer p = new com.yunat.ccms.jooq.routines.ProcDedupCustomer();
		p.setPPlatCode(pPlatCode);
		p.setPParentPlat(pParentPlat);
		p.setPPlatPriority(pPlatPriority);
		p.setPCustomerno(pCustomerno);
		p.setPFullName(pFullName);
		p.setPSex(pSex);
		p.setPJob(pJob);
		p.setPBirthYear(pBirthYear);
		p.setPBirthday(pBirthday);
		p.setPEmail(pEmail);
		p.setPMobile(pMobile);
		p.setPPhone(pPhone);
		p.setPZip(pZip);
		p.setPCountry(pCountry);
		p.setPState(pState);
		p.setPCity(pCity);
		p.setPDistrict(pDistrict);
		p.setPAddress(pAddress);
		p.setPChanged(pChanged);

		p.execute(configuration);
		return p.getPIsdup();
	}

	/**
	 * Call ccms.proc_delete_customer
	 *
	 * @param pPlatCode IN parameter
	 * @param pCustomerno IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procDeleteCustomer(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pCustomerno) {
		com.yunat.ccms.jooq.routines.ProcDeleteCustomer p = new com.yunat.ccms.jooq.routines.ProcDeleteCustomer();
		p.setPPlatCode(pPlatCode);
		p.setPCustomerno(pCustomerno);

		p.execute(configuration);
	}

	/**
	 * Call ccms.proc_delete_unify_customer
	 *
	 * @param pPlatCode IN parameter
	 * @param pCustomerno IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procDeleteUnifyCustomer(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pCustomerno) {
		com.yunat.ccms.jooq.routines.ProcDeleteUnifyCustomer p = new com.yunat.ccms.jooq.routines.ProcDeleteUnifyCustomer();
		p.setPPlatCode(pPlatCode);
		p.setPCustomerno(pCustomerno);

		p.execute(configuration);
	}

	/**
	 * Call ccms.proc_merge_customer
	 *
	 * @param pPlatCode IN parameter
	 * @param pParentPlat IN parameter
	 * @param pPlatTable IN parameter
	 * @param pPlatPriority IN parameter
	 * @param pCustomerno IN parameter
	 * @param pFullName IN parameter
	 * @param pSex IN parameter
	 * @param pJob IN parameter
	 * @param pBirthYear IN parameter
	 * @param pBirthday IN parameter
	 * @param pEmail IN parameter
	 * @param pMobile IN parameter
	 * @param pPhone IN parameter
	 * @param pZip IN parameter
	 * @param pCountry IN parameter
	 * @param pState IN parameter
	 * @param pCity IN parameter
	 * @param pDistrict IN parameter
	 * @param pAddress IN parameter
	 * @param pChanged IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procMergeCustomer(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pParentPlat, java.lang.String pPlatTable, java.lang.Short pPlatPriority, java.lang.String pCustomerno, java.lang.String pFullName, java.lang.String pSex, java.lang.String pJob, java.lang.Short pBirthYear, java.sql.Date pBirthday, java.lang.String pEmail, java.lang.String pMobile, java.lang.String pPhone, java.lang.String pZip, java.lang.String pCountry, java.lang.String pState, java.lang.String pCity, java.lang.String pDistrict, java.lang.String pAddress, java.sql.Timestamp pChanged) {
		com.yunat.ccms.jooq.routines.ProcMergeCustomer p = new com.yunat.ccms.jooq.routines.ProcMergeCustomer();
		p.setPPlatCode(pPlatCode);
		p.setPParentPlat(pParentPlat);
		p.setPPlatTable(pPlatTable);
		p.setPPlatPriority(pPlatPriority);
		p.setPCustomerno(pCustomerno);
		p.setPFullName(pFullName);
		p.setPSex(pSex);
		p.setPJob(pJob);
		p.setPBirthYear(pBirthYear);
		p.setPBirthday(pBirthday);
		p.setPEmail(pEmail);
		p.setPMobile(pMobile);
		p.setPPhone(pPhone);
		p.setPZip(pZip);
		p.setPCountry(pCountry);
		p.setPState(pState);
		p.setPCity(pCity);
		p.setPDistrict(pDistrict);
		p.setPAddress(pAddress);
		p.setPChanged(pChanged);

		p.execute(configuration);
	}

	/**
	 * Call ccms.proc_sync_parent_plat
	 *
	 * @param pPlatCode IN parameter
	 * @param pParentPlat IN parameter
	 * @param pCustomerno IN parameter
	 * @param pFullName IN parameter
	 * @param pSex IN parameter
	 * @param pJob IN parameter
	 * @param pBirthYear IN parameter
	 * @param pBirthday IN parameter
	 * @param pEmail IN parameter
	 * @param pMobile IN parameter
	 * @param pPhone IN parameter
	 * @param pZip IN parameter
	 * @param pCountry IN parameter
	 * @param pState IN parameter
	 * @param pCity IN parameter
	 * @param pDistrict IN parameter
	 * @param pAddress IN parameter
	 * @param pChanged IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procSyncParentPlat(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pParentPlat, java.lang.String pCustomerno, java.lang.String pFullName, java.lang.String pSex, java.lang.String pJob, java.lang.Short pBirthYear, java.sql.Date pBirthday, java.lang.String pEmail, java.lang.String pMobile, java.lang.String pPhone, java.lang.String pZip, java.lang.String pCountry, java.lang.String pState, java.lang.String pCity, java.lang.String pDistrict, java.lang.String pAddress, java.sql.Timestamp pChanged) {
		com.yunat.ccms.jooq.routines.ProcSyncParentPlat p = new com.yunat.ccms.jooq.routines.ProcSyncParentPlat();
		p.setPPlatCode(pPlatCode);
		p.setPParentPlat(pParentPlat);
		p.setPCustomerno(pCustomerno);
		p.setPFullName(pFullName);
		p.setPSex(pSex);
		p.setPJob(pJob);
		p.setPBirthYear(pBirthYear);
		p.setPBirthday(pBirthday);
		p.setPEmail(pEmail);
		p.setPMobile(pMobile);
		p.setPPhone(pPhone);
		p.setPZip(pZip);
		p.setPCountry(pCountry);
		p.setPState(pState);
		p.setPCity(pCity);
		p.setPDistrict(pDistrict);
		p.setPAddress(pAddress);
		p.setPChanged(pChanged);

		p.execute(configuration);
	}

	/**
	 * Call ccms.proc_unify_customer
	 *
	 * @param pPlatCode IN parameter
	 * @param pCustomerno IN parameter
	 * @param pFullName IN parameter
	 * @param pSex IN parameter
	 * @param pJob IN parameter
	 * @param pBirthYear IN parameter
	 * @param pBirthday IN parameter
	 * @param pEmail IN parameter
	 * @param pMobile IN parameter
	 * @param pPhone IN parameter
	 * @param pZip IN parameter
	 * @param pCountry IN parameter
	 * @param pState IN parameter
	 * @param pCity IN parameter
	 * @param pDistrict IN parameter
	 * @param pAddress IN parameter
	 * @param pChanged IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procUnifyCustomer(org.jooq.Configuration configuration, java.lang.String pPlatCode, java.lang.String pCustomerno, java.lang.String pFullName, java.lang.String pSex, java.lang.String pJob, java.lang.Short pBirthYear, java.sql.Date pBirthday, java.lang.String pEmail, java.lang.String pMobile, java.lang.String pPhone, java.lang.String pZip, java.lang.String pCountry, java.lang.String pState, java.lang.String pCity, java.lang.String pDistrict, java.lang.String pAddress, java.sql.Timestamp pChanged) {
		com.yunat.ccms.jooq.routines.ProcUnifyCustomer p = new com.yunat.ccms.jooq.routines.ProcUnifyCustomer();
		p.setPPlatCode(pPlatCode);
		p.setPCustomerno(pCustomerno);
		p.setPFullName(pFullName);
		p.setPSex(pSex);
		p.setPJob(pJob);
		p.setPBirthYear(pBirthYear);
		p.setPBirthday(pBirthday);
		p.setPEmail(pEmail);
		p.setPMobile(pMobile);
		p.setPPhone(pPhone);
		p.setPZip(pZip);
		p.setPCountry(pCountry);
		p.setPState(pState);
		p.setPCity(pCity);
		p.setPDistrict(pDistrict);
		p.setPAddress(pAddress);
		p.setPChanged(pChanged);

		p.execute(configuration);
	}

	/**
	 * Call ccms.proc_unify_modify_customer
	 *
	 * @param pCustomerno IN parameter
	 * @param pFullName IN parameter
	 * @param pSex IN parameter
	 * @param pJob IN parameter
	 * @param pBirthYear IN parameter
	 * @param pBirthday IN parameter
	 * @param pEmail IN parameter
	 * @param pMobile IN parameter
	 * @param pPhone IN parameter
	 * @param pZip IN parameter
	 * @param pCountry IN parameter
	 * @param pState IN parameter
	 * @param pCity IN parameter
	 * @param pDistrict IN parameter
	 * @param pAddress IN parameter
	 * @param pChanged IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void procUnifyModifyCustomer(org.jooq.Configuration configuration, java.lang.String pCustomerno, java.lang.String pFullName, java.lang.String pSex, java.lang.String pJob, java.lang.Short pBirthYear, java.sql.Date pBirthday, java.lang.String pEmail, java.lang.String pMobile, java.lang.String pPhone, java.lang.String pZip, java.lang.String pCountry, java.lang.String pState, java.lang.String pCity, java.lang.String pDistrict, java.lang.String pAddress, java.sql.Timestamp pChanged) {
		com.yunat.ccms.jooq.routines.ProcUnifyModifyCustomer p = new com.yunat.ccms.jooq.routines.ProcUnifyModifyCustomer();
		p.setPCustomerno(pCustomerno);
		p.setPFullName(pFullName);
		p.setPSex(pSex);
		p.setPJob(pJob);
		p.setPBirthYear(pBirthYear);
		p.setPBirthday(pBirthday);
		p.setPEmail(pEmail);
		p.setPMobile(pMobile);
		p.setPPhone(pPhone);
		p.setPZip(pZip);
		p.setPCountry(pCountry);
		p.setPState(pState);
		p.setPCity(pCity);
		p.setPDistrict(pDistrict);
		p.setPAddress(pAddress);
		p.setPChanged(pChanged);

		p.execute(configuration);
	}

	/**
	 * No instances
	 */
	private Routines() {}
}
