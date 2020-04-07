package com.overops.plugins.bamboo.configuration;

public class Const {
    // admin servlet
    public static final String ERROR = "error";
    public static final String INFO = "info";

    /**
     *  keys for PluginSettingsFactory.createGlobalSettings()
     *  plugins are advised to namespace the key with something unique to the plugin
     *  (for example "com.example.plugin:key-I-would-like-to-use" ) to avoid clashes with other keys
     */

    // global admin settings
    public static final String GLOBAL_API_URL = "com.overops.plugins.bamboo:global-api-url";
    public static final String GLOBAL_API_ENV_ID = "com.overops.plugins.bamboo:global-api-env-id";
    public static final String GLOBAL_API_TOKEN = "com.overops.plugins.bamboo:global-api-token";

    // default values
    public static final String DEFAULT_API_URL = "https://api.overops.com/";

    public static final String URL = "url";
    public static final String ENV_ID = "envId";
    public static final String TOKEN = "token";
    public static final String APP_NAME = "applicationName";
    public static final String DEP_NAME = "deploymentName";
    public static final String SERVICE_ID = "serviceId";
    public static final String REGEX_FILTER = "regexFilter";
    public static final String MARK_UNSTABLE = "markUnstable";
    public static final String TOP_ISSUE = "printTopIssues";
    public static final String NEW_EVENTS = "newEvents";
    public static final String SURFACED_ERROR = "resurfacedErrors";
    public static final String NEW_ERROR_VOLUME = "maxErrorVolume";
    public static final String MAX_UNIQUE_ERROR = "maxUniqueErrors";
    public static final String CRITICAL_EXCEPTION_TYPE = "criticalExceptionTypes";
    public static final String ACTIVE_TIMESPAN = "activeTimespan";
    public static final String BASELINE_TIMESPAN = "baselineTimespan";
    public static final String MIN_VOLUME_THRESHOLD = "minVolumeThreshold";
    public static final String MIN_ERROR_RATE_THRESHOLD = "minErrorRateThreshold";
    public static final String REGRESSION_DELTA = "regressionDelta";
    public static final String CRITICAL_REGRESSION_DELTA = "criticalRegressionDelta";
    public static final String APPLY_SEASONALITY = "applySeasonality";
    public static final String DEBUG = "debug";


    public static final String FIELD_CHECK_NEW_ERROR = "newEventsGate";
    public static final String FIELD_CHECK_RESURFACED_ERRORS = "checkResurfacedErrors";
    public static final String FIELD_VOLUME_ERRORS = "checkVolumeErrors";
    public static final String FIELD_UNIQUE_ERRORS = "checkUniqueErrors";
    public static final String FIELD_CRITICAL_ERRORS = "checkCriticalErrors";
    public static final String FIELD_REGRESSIONS_ERROR = "checkRegressionErrors";

    public static final String DEFAULT_CHECK_NEW_ERROR = "true";
    public static final String DEFAULT_CHECK_RESURFACED_ERRORS = "true";
    public static final String DEFAULT_VOLUME_ERRORS = "true";
    public static final String DEFAULT_UNIQUE_ERRORS = "true";
    public static final String DEFAULT_CRITICAL_ERRORS = "true";
    public static final String DEFAULT_REGRESSIONS_ERROR = "true";
    public static final String DEFAULT_MARK_UNSTABLE = "false";
    public static final String DEFAULT_PRINT_TOP_ISSUE = "5";
    public static final String DEFAULT_NEW_EVENTS = "false";
    public static final String DEFAULT_RESURFACED_ERRORS = "false";
    public static final String DEFAULT_MAX_ERROR_VOLUME = "0";
    public static final String DEFAULT_MAX_UNIQUE_ERRORS = "0";
    public static final String DEFAULT_MIN_VOLUME_THRESHOLD = "0";
    public static final String DEFAULT_MIN_ERROR_RATE_THRESHOLD = "0";
    public static final String DEFAULT_REGRESSION_DELTA = "0";
    public static final String DEFAULT_CRITICAL_REGRESSION_DELTA = "0";
    public static final String DEFAULT_APPLY_SEASONALITY = "false";
    public static final String DEFAULT_DEBUG = "false";

    public static final String DEFAULT_JOB_NAME = "${bamboo.shortJobName}";
    public static final String DEFAULT_DEPLOYMENT_NAME = "${bamboo.shortJobName}-${bamboo.buildNumber}";

}