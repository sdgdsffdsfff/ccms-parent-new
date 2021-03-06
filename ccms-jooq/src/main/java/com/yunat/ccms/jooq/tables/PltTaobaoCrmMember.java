/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 店铺买家会员信息表
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PltTaobaoCrmMember extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 702181416;

	/**
	 * The singleton instance of ccms.plt_taobao_crm_member
	 */
	public static final com.yunat.ccms.jooq.tables.PltTaobaoCrmMember PLT_TAOBAO_CRM_MEMBER = new com.yunat.ccms.jooq.tables.PltTaobaoCrmMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * 店铺ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DP_ID = createField("dp_id", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 买家昵称
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CUSTOMERNO = createField("customerno", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 会员的状态，normal正常，delete被买家删除，blacklist黑名单
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 会员等级，1：普通会员，2：高级会员，3：vip会员，4：至尊vip
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> GRADE = createField("grade", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 交易成功笔数
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TRADE_COUNT = createField("trade_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * 交易成功的金额
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Double> TRADE_AMOUNT = createField("trade_amount", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * 最后交易时间
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> LAST_TRADE_TIME = createField("last_trade_time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public PltTaobaoCrmMember() {
		super("plt_taobao_crm_member", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public PltTaobaoCrmMember(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.PltTaobaoCrmMember.PLT_TAOBAO_CRM_MEMBER);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_CRM_MEMBER_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_CRM_MEMBER_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.PltTaobaoCrmMember as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.PltTaobaoCrmMember(alias);
	}
}
