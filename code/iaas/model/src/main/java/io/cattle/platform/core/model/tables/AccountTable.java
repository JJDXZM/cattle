/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.AccountRecord> {

	private static final long serialVersionUID = 1652029159;

	/**
	 * The singleton instance of <code>cattle.account</code>
	 */
	public static final io.cattle.platform.core.model.tables.AccountTable ACCOUNT = new io.cattle.platform.core.model.tables.AccountTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.AccountRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.AccountRecord.class;
	}

	/**
	 * The column <code>cattle.account.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.account.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.account.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.account.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.account.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.account.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.account.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.account.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.account.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.account.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.account.external_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.account.external_id_type</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.String> EXTERNAL_ID_TYPE = createField("external_id_type", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>cattle.account.project_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.account</code> table reference
	 */
	public AccountTable() {
		this("account", null);
	}

	/**
	 * Create an aliased <code>cattle.account</code> table reference
	 */
	public AccountTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.AccountTable.ACCOUNT);
	}

	private AccountTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AccountRecord> aliased) {
		this(alias, aliased, null);
	}

	private AccountTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.AccountRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.AccountRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_ACCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AccountRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_ACCOUNT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AccountRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.AccountRecord>>asList(io.cattle.platform.core.model.Keys.KEY_ACCOUNT_PRIMARY, io.cattle.platform.core.model.Keys.KEY_ACCOUNT_IDX_ACCOUNT_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AccountRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.AccountRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_ACCOUNT__PROJECT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.AccountTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.AccountTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.AccountTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.AccountTable(name, null);
	}
}
