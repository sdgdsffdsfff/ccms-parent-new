/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TbSysTaobaoUser extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 940488264;

	/**
	 * The singleton instance of ccms.tb_sys_taobao_user
	 */
	public static final com.yunat.ccms.jooq.tables.TbSysTaobaoUser TB_SYS_TAOBAO_USER = new com.yunat.ccms.jooq.tables.TbSysTaobaoUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * 主键,使用tb_sysuser表的id
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * 用户在平台方的用户id
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PLAT_USER_ID = createField("plat_user_id", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 用户在平台方的用户名
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PLAT_USER_NAME = createField("plat_user_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 是否是子账号
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> IS_SUBUSER = createField("is_subuser", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * 用户在平台方的店铺的id
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PLAT_SHOP_ID = createField("plat_shop_id", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TbSysTaobaoUser() {
		super("tb_sys_taobao_user", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public TbSysTaobaoUser(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.TbSysTaobaoUser.TB_SYS_TAOBAO_USER);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_TB_SYS_TAOBAO_USER_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_TB_SYS_TAOBAO_USER_PRIMARY, com.yunat.ccms.jooq.Keys.KEY_TB_SYS_TAOBAO_USER_IDX_UNIQUE_PLAT_USER_ID);
	}

	@Override
	public com.yunat.ccms.jooq.tables.TbSysTaobaoUser as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.TbSysTaobaoUser(alias);
	}
}
