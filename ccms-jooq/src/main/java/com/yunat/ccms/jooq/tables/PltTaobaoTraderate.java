/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 交易评价信息
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PltTaobaoTraderate extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -2097092177;

	/**
	 * The singleton instance of ccms.plt_taobao_traderate
	 */
	public static final com.yunat.ccms.jooq.tables.PltTaobaoTraderate PLT_TAOBAO_TRADERATE = new com.yunat.ccms.jooq.tables.PltTaobaoTraderate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * 交易ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TID = createField("tid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 子订单ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OID = createField("oid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 店铺ID
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DP_ID = createField("dp_id", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>ccms.plt_taobao_traderate.valid_score</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> VALID_SCORE = createField("valid_score", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * 评价者角色.可选值:seller(卖家),buyer(买家)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 评价者昵称
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NICK = createField("nick", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 评价结果,可选值:good(好评),neutral(中评),bad(差评)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RESULT = createField("result", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 评价创建时间,格式:yyyy-MM-dd HH:mm:ss
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * 被评价者昵称
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RATED_NICK = createField("rated_nick", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 商品标题
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ITEM_TITLE = createField("item_title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 商品价格,精确到2位小数;单位:元.如:200.07，表示:200元7分
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> ITEM_PRICE = createField("item_price", org.jooq.impl.SQLDataType.DECIMAL, this);

	public PltTaobaoTraderate() {
		super("plt_taobao_traderate", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public PltTaobaoTraderate(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.PltTaobaoTraderate.PLT_TAOBAO_TRADERATE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_TRADERATE_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_TRADERATE_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.PltTaobaoTraderate as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.PltTaobaoTraderate(alias);
	}
}
