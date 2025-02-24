/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.BaseLineRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BaseLine extends TableImpl<BaseLineRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.BASE_LINE</code>
     */
    public static final BaseLine BASE_LINE = new BaseLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BaseLineRecord> getRecordType() {
        return BaseLineRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.ID</code>. 主键ID
     */
    public final TableField<BaseLineRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.APP_ID</code>. 关联的应用id
     */
    public final TableField<BaseLineRecord, Integer> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.INTEGER, this, "关联的应用id");

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.PIPELINE_ID</code>. 关联的集群id
     */
    public final TableField<BaseLineRecord, Integer> PIPELINE_ID = createField(DSL.name("PIPELINE_ID"), SQLDataType.INTEGER, this, "关联的集群id");

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.JVM_MARKET_ID</code>.
     */
    public final TableField<BaseLineRecord, Integer> JVM_MARKET_ID = createField(DSL.name("JVM_MARKET_ID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.CREATED_TIME</code>.
     */
    public final TableField<BaseLineRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>TMAESTRO-LITE.BASE_LINE.VERSION</code>.
     */
    public final TableField<BaseLineRecord, Integer> VERSION = createField(DSL.name("VERSION"), SQLDataType.INTEGER, this, "");

    private BaseLine(Name alias, Table<BaseLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private BaseLine(Name alias, Table<BaseLineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.BASE_LINE</code> table reference
     */
    public BaseLine(String alias) {
        this(DSL.name(alias), BASE_LINE);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.BASE_LINE</code> table reference
     */
    public BaseLine(Name alias) {
        this(alias, BASE_LINE);
    }

    /**
     * Create a <code>TMAESTRO-LITE.BASE_LINE</code> table reference
     */
    public BaseLine() {
        this(DSL.name("BASE_LINE"), null);
    }

    public <O extends Record> BaseLine(Table<O> child, ForeignKey<O, BaseLineRecord> key) {
        super(child, key, BASE_LINE);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<BaseLineRecord, Integer> getIdentity() {
        return (Identity<BaseLineRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<BaseLineRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3B;
    }

    @Override
    public List<UniqueKey<BaseLineRecord>> getKeys() {
        return Arrays.<UniqueKey<BaseLineRecord>>asList(Keys.CONSTRAINT_3B);
    }

    @Override
    public BaseLine as(String alias) {
        return new BaseLine(DSL.name(alias), this);
    }

    @Override
    public BaseLine as(Name alias) {
        return new BaseLine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BaseLine rename(String name) {
        return new BaseLine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BaseLine rename(Name name) {
        return new BaseLine(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, LocalDateTime, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
