/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq;


import com.alipay.autotuneservice.dao.jooq.tables.Alarm;
import com.alipay.autotuneservice.dao.jooq.tables.AppInfo;
import com.alipay.autotuneservice.dao.jooq.tables.AppLog;
import com.alipay.autotuneservice.dao.jooq.tables.BaseLine;
import com.alipay.autotuneservice.dao.jooq.tables.CommandInfo;
import com.alipay.autotuneservice.dao.jooq.tables.ConfigInfo;
import com.alipay.autotuneservice.dao.jooq.tables.ExpertKnowledge;
import com.alipay.autotuneservice.dao.jooq.tables.HealthCheckInfo;
import com.alipay.autotuneservice.dao.jooq.tables.HealthCheckResult;
import com.alipay.autotuneservice.dao.jooq.tables.HelpInfo;
import com.alipay.autotuneservice.dao.jooq.tables.JavaInfo;
import com.alipay.autotuneservice.dao.jooq.tables.JvmMarketInfo;
import com.alipay.autotuneservice.dao.jooq.tables.JvmOptsConfig;
import com.alipay.autotuneservice.dao.jooq.tables.JvmTuningRiskCenter;
import com.alipay.autotuneservice.dao.jooq.tables.K8sAccessTokenInfo;
import com.alipay.autotuneservice.dao.jooq.tables.Lock;
import com.alipay.autotuneservice.dao.jooq.tables.MeterMetaInfo;
import com.alipay.autotuneservice.dao.jooq.tables.NodeInfo;
import com.alipay.autotuneservice.dao.jooq.tables.Notice;
import com.alipay.autotuneservice.dao.jooq.tables.Notify;
import com.alipay.autotuneservice.dao.jooq.tables.PodInfo;
import com.alipay.autotuneservice.dao.jooq.tables.RiskCheckControl;
import com.alipay.autotuneservice.dao.jooq.tables.RiskCheckTask;
import com.alipay.autotuneservice.dao.jooq.tables.RuleInfo;
import com.alipay.autotuneservice.dao.jooq.tables.StorageInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TaskPipelineInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TuneLogInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TuneParamInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TunePipeline;
import com.alipay.autotuneservice.dao.jooq.tables.TunePipelinePhase;
import com.alipay.autotuneservice.dao.jooq.tables.TunePlan;
import com.alipay.autotuneservice.dao.jooq.tables.TunePoolInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TuningParamTaskData;
import com.alipay.autotuneservice.dao.jooq.tables.TuningParamTaskDataDev;
import com.alipay.autotuneservice.dao.jooq.tables.TuningParamTaskInfo;
import com.alipay.autotuneservice.dao.jooq.tables.TuningParamTrialData;
import com.alipay.autotuneservice.dao.jooq.tables.UserInfo;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TmaestroLite extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>TMAESTRO-LITE</code>
     */
    public static final TmaestroLite TMAESTRO_LITE = new TmaestroLite();

    /**
     * The table <code>TMAESTRO-LITE.ALARM</code>.
     */
    public final Alarm ALARM = Alarm.ALARM;

    /**
     * The table <code>TMAESTRO-LITE.APP_INFO</code>.
     */
    public final AppInfo APP_INFO = AppInfo.APP_INFO;

    /**
     * The table <code>TMAESTRO-LITE.APP_LOG</code>.
     */
    public final AppLog APP_LOG = AppLog.APP_LOG;

    /**
     * The table <code>TMAESTRO-LITE.BASE_LINE</code>.
     */
    public final BaseLine BASE_LINE = BaseLine.BASE_LINE;

    /**
     * The table <code>TMAESTRO-LITE.COMMAND_INFO</code>.
     */
    public final CommandInfo COMMAND_INFO = CommandInfo.COMMAND_INFO;

    /**
     * The table <code>TMAESTRO-LITE.CONFIG_INFO</code>.
     */
    public final ConfigInfo CONFIG_INFO = ConfigInfo.CONFIG_INFO;

    /**
     * The table <code>TMAESTRO-LITE.EXPERT_KNOWLEDGE</code>.
     */
    public final ExpertKnowledge EXPERT_KNOWLEDGE = ExpertKnowledge.EXPERT_KNOWLEDGE;

    /**
     * The table <code>TMAESTRO-LITE.HEALTH_CHECK_INFO</code>.
     */
    public final HealthCheckInfo HEALTH_CHECK_INFO = HealthCheckInfo.HEALTH_CHECK_INFO;

    /**
     * The table <code>TMAESTRO-LITE.HEALTH_CHECK_RESULT</code>.
     */
    public final HealthCheckResult HEALTH_CHECK_RESULT = HealthCheckResult.HEALTH_CHECK_RESULT;

    /**
     * The table <code>TMAESTRO-LITE.HELP_INFO</code>.
     */
    public final HelpInfo HELP_INFO = HelpInfo.HELP_INFO;

    /**
     * The table <code>TMAESTRO-LITE.JAVA_INFO</code>.
     */
    public final JavaInfo JAVA_INFO = JavaInfo.JAVA_INFO;

    /**
     * The table <code>TMAESTRO-LITE.JVM_MARKET_INFO</code>.
     */
    public final JvmMarketInfo JVM_MARKET_INFO = JvmMarketInfo.JVM_MARKET_INFO;

    /**
     * The table <code>TMAESTRO-LITE.JVM_OPTS_CONFIG</code>.
     */
    public final JvmOptsConfig JVM_OPTS_CONFIG = JvmOptsConfig.JVM_OPTS_CONFIG;

    /**
     * The table <code>TMAESTRO-LITE.JVM_TUNING_RISK_CENTER</code>.
     */
    public final JvmTuningRiskCenter JVM_TUNING_RISK_CENTER = JvmTuningRiskCenter.JVM_TUNING_RISK_CENTER;

    /**
     * The table <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO</code>.
     */
    public final K8sAccessTokenInfo K8S_ACCESS_TOKEN_INFO = K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO;

    /**
     * The table <code>TMAESTRO-LITE.LOCK</code>.
     */
    public final Lock LOCK = Lock.LOCK;

    /**
     * The table <code>TMAESTRO-LITE.METER_META_INFO</code>.
     */
    public final MeterMetaInfo METER_META_INFO = MeterMetaInfo.METER_META_INFO;

    /**
     * The table <code>TMAESTRO-LITE.NODE_INFO</code>.
     */
    public final NodeInfo NODE_INFO = NodeInfo.NODE_INFO;

    /**
     * The table <code>TMAESTRO-LITE.NOTICE</code>.
     */
    public final Notice NOTICE = Notice.NOTICE;

    /**
     * The table <code>TMAESTRO-LITE.NOTIFY</code>.
     */
    public final Notify NOTIFY = Notify.NOTIFY;

    /**
     * The table <code>TMAESTRO-LITE.POD_INFO</code>.
     */
    public final PodInfo POD_INFO = PodInfo.POD_INFO;

    /**
     * The table <code>TMAESTRO-LITE.RISK_CHECK_CONTROL</code>.
     */
    public final RiskCheckControl RISK_CHECK_CONTROL = RiskCheckControl.RISK_CHECK_CONTROL;

    /**
     * The table <code>TMAESTRO-LITE.RISK_CHECK_TASK</code>.
     */
    public final RiskCheckTask RISK_CHECK_TASK = RiskCheckTask.RISK_CHECK_TASK;

    /**
     * The table <code>TMAESTRO-LITE.RULE_INFO</code>.
     */
    public final RuleInfo RULE_INFO = RuleInfo.RULE_INFO;

    /**
     * The table <code>TMAESTRO-LITE.STORAGE_INFO</code>.
     */
    public final StorageInfo STORAGE_INFO = StorageInfo.STORAGE_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TASK_PIPELINE_INFO</code>.
     */
    public final TaskPipelineInfo TASK_PIPELINE_INFO = TaskPipelineInfo.TASK_PIPELINE_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_LOG_INFO</code>.
     */
    public final TuneLogInfo TUNE_LOG_INFO = TuneLogInfo.TUNE_LOG_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_PARAM_INFO</code>.
     */
    public final TuneParamInfo TUNE_PARAM_INFO = TuneParamInfo.TUNE_PARAM_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_PIPELINE</code>.
     */
    public final TunePipeline TUNE_PIPELINE = TunePipeline.TUNE_PIPELINE;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_PIPELINE_PHASE</code>.
     */
    public final TunePipelinePhase TUNE_PIPELINE_PHASE = TunePipelinePhase.TUNE_PIPELINE_PHASE;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_PLAN</code>.
     */
    public final TunePlan TUNE_PLAN = TunePlan.TUNE_PLAN;

    /**
     * The table <code>TMAESTRO-LITE.TUNE_POOL_INFO</code>.
     */
    public final TunePoolInfo TUNE_POOL_INFO = TunePoolInfo.TUNE_POOL_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TUNING_PARAM_TASK_DATA</code>.
     */
    public final TuningParamTaskData TUNING_PARAM_TASK_DATA = TuningParamTaskData.TUNING_PARAM_TASK_DATA;

    /**
     * The table <code>TMAESTRO-LITE.TUNING_PARAM_TASK_DATA_DEV</code>.
     */
    public final TuningParamTaskDataDev TUNING_PARAM_TASK_DATA_DEV = TuningParamTaskDataDev.TUNING_PARAM_TASK_DATA_DEV;

    /**
     * The table <code>TMAESTRO-LITE.TUNING_PARAM_TASK_INFO</code>.
     */
    public final TuningParamTaskInfo TUNING_PARAM_TASK_INFO = TuningParamTaskInfo.TUNING_PARAM_TASK_INFO;

    /**
     * The table <code>TMAESTRO-LITE.TUNING_PARAM_TRIAL_DATA</code>.
     */
    public final TuningParamTrialData TUNING_PARAM_TRIAL_DATA = TuningParamTrialData.TUNING_PARAM_TRIAL_DATA;

    /**
     * The table <code>TMAESTRO-LITE.USER_INFO</code>.
     */
    public final UserInfo USER_INFO = UserInfo.USER_INFO;

    /**
     * No further instances allowed
     */
    private TmaestroLite() {
        super("TMAESTRO-LITE", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Alarm.ALARM,
            AppInfo.APP_INFO,
            AppLog.APP_LOG,
            BaseLine.BASE_LINE,
            CommandInfo.COMMAND_INFO,
            ConfigInfo.CONFIG_INFO,
            ExpertKnowledge.EXPERT_KNOWLEDGE,
            HealthCheckInfo.HEALTH_CHECK_INFO,
            HealthCheckResult.HEALTH_CHECK_RESULT,
            HelpInfo.HELP_INFO,
            JavaInfo.JAVA_INFO,
            JvmMarketInfo.JVM_MARKET_INFO,
            JvmOptsConfig.JVM_OPTS_CONFIG,
            JvmTuningRiskCenter.JVM_TUNING_RISK_CENTER,
            K8sAccessTokenInfo.K8S_ACCESS_TOKEN_INFO,
            Lock.LOCK,
            MeterMetaInfo.METER_META_INFO,
            NodeInfo.NODE_INFO,
            Notice.NOTICE,
            Notify.NOTIFY,
            PodInfo.POD_INFO,
            RiskCheckControl.RISK_CHECK_CONTROL,
            RiskCheckTask.RISK_CHECK_TASK,
            RuleInfo.RULE_INFO,
            StorageInfo.STORAGE_INFO,
            TaskPipelineInfo.TASK_PIPELINE_INFO,
            TuneLogInfo.TUNE_LOG_INFO,
            TuneParamInfo.TUNE_PARAM_INFO,
            TunePipeline.TUNE_PIPELINE,
            TunePipelinePhase.TUNE_PIPELINE_PHASE,
            TunePlan.TUNE_PLAN,
            TunePoolInfo.TUNE_POOL_INFO,
            TuningParamTaskData.TUNING_PARAM_TASK_DATA,
            TuningParamTaskDataDev.TUNING_PARAM_TASK_DATA_DEV,
            TuningParamTaskInfo.TUNING_PARAM_TASK_INFO,
            TuningParamTrialData.TUNING_PARAM_TRIAL_DATA,
            UserInfo.USER_INFO);
    }
}
