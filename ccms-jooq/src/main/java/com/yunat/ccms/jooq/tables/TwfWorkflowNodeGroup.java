/**
 * This class is generated by jOOQ
 */
package com.yunat.ccms.jooq.tables;

/**
 * This class is generated by jOOQ.
 *
 * “流程类别”所对应的“节点类型分组”
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.3"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TwfWorkflowNodeGroup extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1212317472;

	/**
	 * The singleton instance of ccms.twf_workflow_node_group
	 */
	public static final com.yunat.ccms.jooq.tables.TwfWorkflowNodeGroup TWF_WORKFLOW_NODE_GROUP = new com.yunat.ccms.jooq.tables.TwfWorkflowNodeGroup();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * 主键ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * 流程类型id,普通流程、特殊流程，对应 twf_workflow_type 主键
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * 节点组栏目， 对应 twf_node_type_group 主键
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> TOOLBAR_ID = createField("toolbar_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * 备注
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TwfWorkflowNodeGroup() {
		super("twf_workflow_node_group", com.yunat.ccms.jooq.Ccms.CCMS);
	}

	public TwfWorkflowNodeGroup(java.lang.String alias) {
		super(alias, com.yunat.ccms.jooq.Ccms.CCMS, com.yunat.ccms.jooq.tables.TwfWorkflowNodeGroup.TWF_WORKFLOW_NODE_GROUP);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return com.yunat.ccms.jooq.Keys.KEY_TWF_WORKFLOW_NODE_GROUP_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yunat.ccms.jooq.Keys.KEY_TWF_WORKFLOW_NODE_GROUP_PRIMARY);
	}

	@Override
	public com.yunat.ccms.jooq.tables.TwfWorkflowNodeGroup as(java.lang.String alias) {
		return new com.yunat.ccms.jooq.tables.TwfWorkflowNodeGroup(alias);
	}
}
