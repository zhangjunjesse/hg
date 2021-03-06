/**
 * This class is generated by jOOQ
 */
package cn.hg.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class History extends org.jooq.impl.TableImpl<cn.hg.jooq.tables.records.HistoryRecord> {

	private static final long serialVersionUID = 1005007596;

	/**
	 * The singleton instance of <code>hg.history</code>
	 */
	public static final cn.hg.jooq.tables.History HISTORY = new cn.hg.jooq.tables.History();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cn.hg.jooq.tables.records.HistoryRecord> getRecordType() {
		return cn.hg.jooq.tables.records.HistoryRecord.class;
	}

	/**
	 * The column <code>hg.history.id</code>. 发展历程
	 */
	public final org.jooq.TableField<cn.hg.jooq.tables.records.HistoryRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "发展历程");

	/**
	 * The column <code>hg.history.name</code>.
	 */
	public final org.jooq.TableField<cn.hg.jooq.tables.records.HistoryRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>hg.history.time</code>.
	 */
	public final org.jooq.TableField<cn.hg.jooq.tables.records.HistoryRecord, java.sql.Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>hg.history.description_id</code>.
	 */
	public final org.jooq.TableField<cn.hg.jooq.tables.records.HistoryRecord, java.lang.Integer> DESCRIPTION_ID = createField("description_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>hg.history</code> table reference
	 */
	public History() {
		this("history", null);
	}

	/**
	 * Create an aliased <code>hg.history</code> table reference
	 */
	public History(java.lang.String alias) {
		this(alias, cn.hg.jooq.tables.History.HISTORY);
	}

	private History(java.lang.String alias, org.jooq.Table<cn.hg.jooq.tables.records.HistoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private History(java.lang.String alias, org.jooq.Table<cn.hg.jooq.tables.records.HistoryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cn.hg.jooq.Hg.HG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<cn.hg.jooq.tables.records.HistoryRecord, java.lang.Integer> getIdentity() {
		return cn.hg.jooq.Keys.IDENTITY_HISTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cn.hg.jooq.tables.records.HistoryRecord> getPrimaryKey() {
		return cn.hg.jooq.Keys.KEY_HISTORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cn.hg.jooq.tables.records.HistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cn.hg.jooq.tables.records.HistoryRecord>>asList(cn.hg.jooq.Keys.KEY_HISTORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cn.hg.jooq.tables.History as(java.lang.String alias) {
		return new cn.hg.jooq.tables.History(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cn.hg.jooq.tables.History rename(java.lang.String name) {
		return new cn.hg.jooq.tables.History(name, null);
	}
}
