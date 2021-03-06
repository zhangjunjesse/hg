/**
 * This class is generated by jOOQ
 */
package cn.hg.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryRecord extends org.jooq.impl.UpdatableRecordImpl<cn.hg.jooq.tables.records.HistoryRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer> {

	private static final long serialVersionUID = -1349631695;

	/**
	 * Setter for <code>hg.history.id</code>. 发展历程
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hg.history.id</code>. 发展历程
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>hg.history.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hg.history.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>hg.history.time</code>.
	 */
	public void setTime(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hg.history.time</code>.
	 */
	public java.sql.Timestamp getTime() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>hg.history.description_id</code>.
	 */
	public void setDescriptionId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hg.history.description_id</code>.
	 */
	public java.lang.Integer getDescriptionId() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return cn.hg.jooq.tables.History.HISTORY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cn.hg.jooq.tables.History.HISTORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return cn.hg.jooq.tables.History.HISTORY.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return cn.hg.jooq.tables.History.HISTORY.DESCRIPTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDescriptionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HistoryRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HistoryRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HistoryRecord value3(java.sql.Timestamp value) {
		setTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HistoryRecord value4(java.lang.Integer value) {
		setDescriptionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HistoryRecord values(java.lang.Integer value1, java.lang.String value2, java.sql.Timestamp value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HistoryRecord
	 */
	public HistoryRecord() {
		super(cn.hg.jooq.tables.History.HISTORY);
	}

	/**
	 * Create a detached, initialised HistoryRecord
	 */
	public HistoryRecord(java.lang.Integer id, java.lang.String name, java.sql.Timestamp time, java.lang.Integer descriptionId) {
		super(cn.hg.jooq.tables.History.HISTORY);

		setValue(0, id);
		setValue(1, name);
		setValue(2, time);
		setValue(3, descriptionId);
	}
}
