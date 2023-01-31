/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables;


import com.alipay.autotuneservice.dao.jooq.Keys;
import com.alipay.autotuneservice.dao.jooq.TmaestroLite;
import com.alipay.autotuneservice.dao.jooq.tables.records.JavaInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class JavaInfo extends TableImpl<JavaInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE.JAVA_INFO</code>
     */
    public static final JavaInfo JAVA_INFO = new JavaInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JavaInfoRecord> getRecordType() {
        return JavaInfoRecord.class;
    }

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.ID</code>. 唯一ID;唯一ID
     */
    public final TableField<JavaInfoRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "唯一ID;唯一ID");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.PID</code>. 应用id
     */
    public final TableField<JavaInfoRecord, Integer> PID = createField(DSL.name("PID"), SQLDataType.INTEGER, this, "应用id");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.VERSION</code>. 版本
     */
    public final TableField<JavaInfoRecord, String> VERSION = createField(DSL.name("VERSION"), SQLDataType.VARCHAR(255), this, "版本");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.JVM_HOME</code>. javaHome
     */
    public final TableField<JavaInfoRecord, String> JVM_HOME = createField(DSL.name("JVM_HOME"), SQLDataType.VARCHAR(1000), this, "javaHome");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.CLASS_PATH</code>. classPath
     */
    public final TableField<JavaInfoRecord, String> CLASS_PATH = createField(DSL.name("CLASS_PATH"), SQLDataType.VARCHAR(1000), this, "classPath");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.LIBRARY_PATH</code>. 文件路径
     */
    public final TableField<JavaInfoRecord, String> LIBRARY_PATH = createField(DSL.name("LIBRARY_PATH"), SQLDataType.VARCHAR(255), this, "文件路径");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.USER_NAME</code>. userName
     */
    public final TableField<JavaInfoRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(255), this, "userName");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.USER_DIR</code>. userDir
     */
    public final TableField<JavaInfoRecord, String> USER_DIR = createField(DSL.name("USER_DIR"), SQLDataType.VARCHAR(255), this, "userDir");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.EXEC_TIME</code>. 存活时间
     */
    public final TableField<JavaInfoRecord, String> EXEC_TIME = createField(DSL.name("EXEC_TIME"), SQLDataType.VARCHAR(255), this, "存活时间");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.JAVA_LIBS</code>. 依赖包
     */
    public final TableField<JavaInfoRecord, String> JAVA_LIBS = createField(DSL.name("JAVA_LIBS"), SQLDataType.CLOB, this, "依赖包");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.INPUT_ARGUMENTS</code>. 启动参数
     */
    public final TableField<JavaInfoRecord, String> INPUT_ARGUMENTS = createField(DSL.name("INPUT_ARGUMENTS"), SQLDataType.CLOB, this, "启动参数");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.HOST_NAME</code>. hostname
     */
    public final TableField<JavaInfoRecord, String> HOST_NAME = createField(DSL.name("HOST_NAME"), SQLDataType.VARCHAR(255), this, "hostname");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.OS_VERSION</code>. osVersion
     */
    public final TableField<JavaInfoRecord, String> OS_VERSION = createField(DSL.name("OS_VERSION"), SQLDataType.VARCHAR(255), this, "osVersion");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.OS_ARCH</code>. osArch
     */
    public final TableField<JavaInfoRecord, String> OS_ARCH = createField(DSL.name("OS_ARCH"), SQLDataType.VARCHAR(255), this, "osArch");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.APP_NAME</code>. 集群真实名称;集群真实名称
     */
    public final TableField<JavaInfoRecord, String> APP_NAME = createField(DSL.name("APP_NAME"), SQLDataType.VARCHAR(255), this, "集群真实名称;集群真实名称");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.NAMESPACE</code>.
     */
    public final TableField<JavaInfoRecord, String> NAMESPACE = createField(DSL.name("NAMESPACE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.CREATED_TIME</code>. 创建时间;创建时间
     */
    public final TableField<JavaInfoRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("CREATED_TIME"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "创建时间;创建时间");

    /**
     * The column <code>TMAESTRO-LITE.JAVA_INFO.UPDATED_TIME</code>. 更新时间;更新时间
     */
    public final TableField<JavaInfoRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("UPDATED_TIME"), SQLDataType.LOCALDATETIME(6), this, "更新时间;更新时间");

    private JavaInfo(Name alias, Table<JavaInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private JavaInfo(Name alias, Table<JavaInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.JAVA_INFO</code> table reference
     */
    public JavaInfo(String alias) {
        this(DSL.name(alias), JAVA_INFO);
    }

    /**
     * Create an aliased <code>TMAESTRO-LITE.JAVA_INFO</code> table reference
     */
    public JavaInfo(Name alias) {
        this(alias, JAVA_INFO);
    }

    /**
     * Create a <code>TMAESTRO-LITE.JAVA_INFO</code> table reference
     */
    public JavaInfo() {
        this(DSL.name("JAVA_INFO"), null);
    }

    public <O extends Record> JavaInfo(Table<O> child, ForeignKey<O, JavaInfoRecord> key) {
        super(child, key, JAVA_INFO);
    }

    @Override
    public Schema getSchema() {
        return TmaestroLite.TMAESTRO_LITE;
    }

    @Override
    public Identity<JavaInfoRecord, Integer> getIdentity() {
        return (Identity<JavaInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JavaInfoRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_75;
    }

    @Override
    public List<UniqueKey<JavaInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<JavaInfoRecord>>asList(Keys.CONSTRAINT_75);
    }

    @Override
    public JavaInfo as(String alias) {
        return new JavaInfo(DSL.name(alias), this);
    }

    @Override
    public JavaInfo as(Name alias) {
        return new JavaInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JavaInfo rename(String name) {
        return new JavaInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JavaInfo rename(Name name) {
        return new JavaInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
