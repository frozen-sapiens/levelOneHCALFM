package rcms.fm.app.level1;

import rcms.fm.fw.parameter.FunctionManagerParameter;
import rcms.fm.fw.parameter.ParameterSet;
import rcms.fm.fw.parameter.type.DoubleT;
import rcms.fm.fw.parameter.type.IntegerT;
import rcms.fm.fw.parameter.type.BooleanT;
import rcms.fm.fw.parameter.type.StringT;

/**
 * Defined HCAL Function Manager parameters.
 *
 * Standard parameter definitions for Level 1 Function Manager
 *
 * SID						: Session Identifier
 * STATE					: State name the function manager is currently in
 * SEQ_NAME		            : String identifying the run sequence name
 * RUN_MODE					: String identifying the global run mode
 * GLOBAL_CONF_KEY		 	: String representing the global configuration key
 * RUN_NUMBER				: Run number of current run
 * RUN_SEQ_NUMBER			: Run sequence number of current run
 * ACTION_MSG 				: Short description of current activity, if any
 * ERROR_MSG 				: In case of an error contains a description of the error
 * COMPLETION 				: Completion of an activity can be signaled through this numerical value 0 < PROGRESS_BAR < 1
 *
 * For more details => https://twiki.cern.ch/twiki/bin/view/CMS/StdFMParameters
 *
 * Standard parameter set enhancements for HCAL needs
 *
 * HCAL CfgScript              : String sent before SOAP configure messages to the HCAL supervisor applications
 * HCAL TTCci control sequence : String sent before SOAP configure messages to TTCci applications
 * HCAL LTCci control sequence : String sent before SOAP configure messages to LTC applications
 * HCAL TCDS control sequence : String sent before SOAP configure messages to TCDS applications
 *
 * @author Arno Heister
 *
 */

public class HCALParameters {

	/**
	 * standard parameter definitions for the HCAL Function Manager
	 */
	public static final String SID = "SID";

	public static final String STATE = "STATE";

	public static final String SEQ_NAME = "SEQ_NAME";

	public static final String RUN_KEY = "RUN_KEY";

	public static final String RUN_MODE = "RUN_MODE";

	public static final String GLOBAL_CONF_KEY = "GLOBAL_CONF_KEY";

	public static final String TPG_KEY = "TPG_KEY";

	public static final String RUN_NUMBER = "RUN_NUMBER";

	public static final String RUN_SEQ_NUMBER = "RUN_SEQ_NUMBER";

	public static final String NUMBER_OF_EVENTS = "NUMBER_OF_EVENTS";

	public static final String ACTION_MSG = "ACTION_MSG";

	public static final String ERROR_MSG = "ERROR_MSG";

	public static final String COMPLETION = "COMPLETION";

	public static final String FED_ENABLE_MASK = "FED_ENABLE_MASK";

	// TTS testing set
	public static final String TTS_TEST_FED_ID = "TTS_TEST_FED_ID";

	public static final String TTS_TEST_MODE = "TTS_TEST_MODE";

	public static final String TTS_TEST_PATTERN = "TTS_TEST_PATTERN";

	public static final String TTS_TEST_SEQUENCE_REPEAT = "TTS_TEST_SEQUENCE_REPEAT";

	// HCAL specific paramters
	public static final String HCAL_CFGSCRIPT    = "HCAL_CFGSCRIPT";
	public static final String HCAL_TTCCICONTROL = "HCAL_TTCCICONTROL";
	public static final String HCAL_LTCCONTROL = "HCAL_LTCCONTROL";
	public static final String HCAL_TCDSCONTROL = "HCAL_TCDSCONTROL";
	public static final String HCAL_LPMCONTROL = "HCAL_LPMCONTROL";
	public static final String HCAL_COMMENT = "HCAL_COMMENT";
	//public static final String HCAL_SHIFTERS = "HCAL_SHIFTERS";
	public static final String HCAL_EVENTSTAKEN = "HCAL_EVENTSTAKEN";
	public static final String HCAL_TIME_OF_FM_START = "HCAL_TIME_OF_FM_START";
	public static final String HCAL_RUN_TYPE = "HCAL_RUN_TYPE";
	public static final String CLOCK_CHANGED = "CLOCK_CHANGED";

	// parameters for LVL0 read-back
	public static final String INITIALIZED_WITH_SID = "INITIALIZED_WITH_SID";
	public static final String INITIALIZED_WITH_GLOBAL_CONF_KEY = "INITIALIZED_WITH_GLOBAL_CONF_KEY";

	public static final String CONFIGURED_WITH_RUN_NUMBER = "CONFIGURED_WITH_RUN_NUMBER";
	public static final String CONFIGURED_WITH_RUN_KEY = "CONFIGURED_WITH_RUN_KEY";
	public static final String CONFIGURED_WITH_TPG_KEY = "CONFIGURED_WITH_TPG_KEY";
	public static final String CONFIGURED_WITH_FED_ENABLE_MASK = "CONFIGURED_WITH_FED_ENABLE_MASK";

	public static final String STARTED_WITH_RUN_NUMBER = "STARTED_WITH_RUN_NUMBER";

	//Parameter for testing changing the behavior of the Recover button.
	public static final String USE_RESET_FOR_RECOVER = "USE_RESET_FOR_RECOVER";
	//Parameter for configuring the PIController
	public static final String HCAL_PICONTROL = "HCAL_PICONTROL";
	//Parameter for switching between primary and secondary TCDS system.
	public static final String USE_PRIMARY_TCDS = "USE_PRIMARY_TCDS";
	//Parameter for displaying the supervisor's overallErrorMessage
	public static final String SUPERVISOR_ERROR = "SUPERVISOR_ERROR";
	//Parameter for selecting the kind of run
	public static final String AVAILABLE_RUN_CONFIGS = "AVAILABLE_RUN_CONFIGS";
	public static final String RUN_CONFIG_SELECTED = "RUN_CONFIG_SELECTED";
	public static final String CFGSNIPPET_KEY_SELECTED = "CFGSNIPPET_KEY_SELECTED";
	public static final String AVAILABLE_RESOURCES = "AVAILABLE_RESOURCES";
	public static final String MASKED_RESOURCES = "MASKED_RESOURCES";
	// standard level 1 parameter set
	public static final ParameterSet<FunctionManagerParameter> GLOBAL_PARAMETER_SET = new ParameterSet<FunctionManagerParameter>();

	static {
		/**
		 * Session Identifier
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(SID, new IntegerT("0"),FunctionManagerParameter.Exported.READONLY));
		/**
		 * State of the Function Manager is currently in
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(STATE, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		/**
		 * Run sequence name is currently
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(SEQ_NAME, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		/**
		 * Run Type can be either "Fun", or "Physics"
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(RUN_KEY, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		/**
		 * mode can be "Normal" or "Debug". Influences the behaviour of the top FM.
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(RUN_MODE, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		/**
		 * global configuration key for current run
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(GLOBAL_CONF_KEY, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));
		/**
		 * the run number
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(RUN_NUMBER, new IntegerT(0)));
		/**
		 * the run sequence number
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(RUN_SEQ_NUMBER, new IntegerT(0),FunctionManagerParameter.Exported.READONLY));
		/**
		 * the requested number of events for a local run
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(NUMBER_OF_EVENTS, new IntegerT(1000)));

		/**
		 * the FED list given by the level0
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT> (FED_ENABLE_MASK, new StringT(""),FunctionManagerParameter.Exported.READONLY));

		/**
		 * parameters for monitoring
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(ACTION_MSG, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(ERROR_MSG, new StringT(""),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<DoubleT>(COMPLETION, new DoubleT(-1),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL CfgScript
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_CFGSCRIPT, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL TTCci control sequence
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_TTCCICONTROL, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL LTC control sequence
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_LTCCONTROL, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL TCDS control sequence
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_TCDSCONTROL, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL LPM control sequence
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_LPMCONTROL, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL specific comments for a run
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_COMMENT, new StringT("")));

		/**
		 * HCAL specific comments for a run
		 */
		//GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_SHIFTERS, new StringT("")));

		/**
		 * HCAL specific run definition, by default a LVL2 can only be started in local mode
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_RUN_TYPE, new StringT("local")));

		/**
		 * HCAL can be requested to perform specific actions during  CONFIGURING
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<BooleanT>(CLOCK_CHANGED, new BooleanT(false)));


		/**
		 * HCAL specific: events taken in local runs - retrieved from the TA
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(HCAL_EVENTSTAKEN, new IntegerT(-1),FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL specific: date and time when this FM was initialized
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_TIME_OF_FM_START, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		/**
		 * parameters for LVL0 read-back
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(INITIALIZED_WITH_SID, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(INITIALIZED_WITH_GLOBAL_CONF_KEY, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(CONFIGURED_WITH_RUN_NUMBER, new IntegerT(0),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(CONFIGURED_WITH_RUN_KEY, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(CONFIGURED_WITH_TPG_KEY, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(CONFIGURED_WITH_FED_ENABLE_MASK, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<IntegerT>(STARTED_WITH_RUN_NUMBER, new IntegerT(0),FunctionManagerParameter.Exported.READONLY));


		/**
                 * parameters to select the specific run behaviors
                 */
                  
		// Parameter to set the behavior of the "Recover" button.
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<BooleanT>(USE_RESET_FOR_RECOVER, new BooleanT(true)));

		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(AVAILABLE_RUN_CONFIGS, new StringT("none found")));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(RUN_CONFIG_SELECTED, new StringT("not set")));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(CFGSNIPPET_KEY_SELECTED, new StringT("not set")));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(AVAILABLE_RESOURCES, new StringT("none found")));
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(MASKED_RESOURCES, new StringT("")));

		// Parameter to see the supervisor's overallErrorMessage
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(SUPERVISOR_ERROR, new StringT(""), FunctionManagerParameter.Exported.READONLY));

		/**
		 * HCAL PI control sequence
		 */
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<StringT>(HCAL_PICONTROL, new StringT("not set"),FunctionManagerParameter.Exported.READONLY));

		//Parameter to set whether primary or secondary TCDS is used.
		GLOBAL_PARAMETER_SET.put(new FunctionManagerParameter<BooleanT>(USE_PRIMARY_TCDS, new BooleanT("true"),FunctionManagerParameter.Exported.READONLY));
	}
}