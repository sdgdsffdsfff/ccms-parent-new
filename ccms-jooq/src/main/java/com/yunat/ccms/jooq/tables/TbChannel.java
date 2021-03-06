/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 渠道表
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TbChannel extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1758324850;

	/**
	 * The singleton instance of ccms.tb_channel
	 */
	public static final com.yunat.ccms.jooq.tables.TbChannel TB_CHANNEL = new com.yunat.ccms.jooq.tables.TbChannel();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>ccms.tb_channel.channel_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHANNEL_ID = createField("channel_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * 渠道名称
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHANNEL_NAME = createField("channel_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 渠道类型
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CHANNEL_TYPE = createField("channel_type", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * 渠道单价
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> CHANNEL_PRICE = createField("channel_price", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * 渠道描述
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHANNEL_DESC = createField("channel_desc", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TbChannel() {
		super("tb_channel", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public TbChannel(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.TbChannel.TB_CHANNEL);
	}

	@Override
	public org.jooq.Identity<org.jooq.Record, java.lang.Long> getIdentity() {
		return com.yunat.ccms.jooq.Keys.IDENTITY_TB_CHANNEL;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_TB_CHANNEL_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_TB_CHANNEL_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.TbChannel as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.TbChannel(alias);
	}
}
