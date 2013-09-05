/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 等待节点配置信息表
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TwfNodeWait extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -142821361;

	/**
	 * The singleton instance of ccms.twf_node_wait
	 */
	public static final com.yunat.ccms.jooq.tables.TwfNodeWait TWF_NODE_WAIT = new com.yunat.ccms.jooq.tables.TwfNodeWait();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>ccms.twf_node_wait.node_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NODE_ID = createField("node_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>ccms.twf_node_wait.isdate</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ISDATE = createField("isdate", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * 等待到指定日期(2010-10-10)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> WAIT_DATE = createField("wait_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>ccms.twf_node_wait.wait_day</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> WAIT_DAY = createField("wait_day", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * 等待到指定日期或者天数的时间(如：17:00)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> WAIT_TIME = createField("wait_time", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>ccms.twf_node_wait.node_name</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NODE_NAME = createField("node_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 等待n小时后执行
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> WAIT_HOUR = createField("wait_hour", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * 等待m分钟后执行
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> WAIT_MINUTE = createField("wait_minute", org.jooq.impl.SQLDataType.INTEGER, this);

	public TwfNodeWait() {
		super("twf_node_wait", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public TwfNodeWait(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.TwfNodeWait.TWF_NODE_WAIT);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_TWF_NODE_WAIT_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_TWF_NODE_WAIT_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.TwfNodeWait as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.TwfNodeWait(alias);
	}
}