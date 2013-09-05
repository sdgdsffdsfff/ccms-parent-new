/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 会员黑名单表
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TwMemberBlacklist extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 470581919;

	/**
	 * The singleton instance of ccms.tw_member_blacklist
	 */
	public static final com.yunat.ccms.jooq.tables.TwMemberBlacklist TW_MEMBER_BLACKLIST = new com.yunat.ccms.jooq.tables.TwMemberBlacklist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>ccms.tw_member_blacklist.customerno</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CUSTOMERNO = createField("customerno", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 名单来源
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> GET_FROM = createField("get_from", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 录入时间
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public TwMemberBlacklist() {
		super("tw_member_blacklist", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public TwMemberBlacklist(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.TwMemberBlacklist.TW_MEMBER_BLACKLIST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_TW_MEMBER_BLACKLIST_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_TW_MEMBER_BLACKLIST_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.TwMemberBlacklist as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.TwMemberBlacklist(alias);
	}
}