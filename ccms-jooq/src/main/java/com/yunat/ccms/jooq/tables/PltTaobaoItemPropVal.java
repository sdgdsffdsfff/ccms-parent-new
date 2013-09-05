/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * 商品属性值
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PltTaobaoItemPropVal extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1279189046;

	/**
	 * The singleton instance of ccms.plt_taobao_item_prop_val
	 */
	public static final com.yunat.ccms.jooq.tables.PltTaobaoItemPropVal PLT_TAOBAO_ITEM_PROP_VAL = new com.yunat.ccms.jooq.tables.PltTaobaoItemPropVal();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * 类目ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CID = createField("cid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 属性 ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PID = createField("pid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 属性名
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROP_NAME = createField("prop_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 属性值ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VID = createField("vid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 属性值
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 属性值别名
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME_ALIAS = createField("name_alias", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>ccms.plt_taobao_item_prop_val.is_parent</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> IS_PARENT = createField("is_parent", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * 状态。可选值:normal(正常),deleted(删除)
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * 排列序号。取值范围:大于零的整数
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SORT_ORDER = createField("sort_order", org.jooq.impl.SQLDataType.INTEGER, this);

	public PltTaobaoItemPropVal() {
		super("plt_taobao_item_prop_val", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public PltTaobaoItemPropVal(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.PltTaobaoItemPropVal.PLT_TAOBAO_ITEM_PROP_VAL);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_ITEM_PROP_VAL_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_PLT_TAOBAO_ITEM_PROP_VAL_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.PltTaobaoItemPropVal as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.PltTaobaoItemPropVal(alias);
	}
}