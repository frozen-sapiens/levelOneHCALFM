package rcms.fm.app.level1;

import java.util.Iterator;
import java.util.List;

import rcms.fm.fw.user.UserActionException;
import rcms.fm.fw.user.UserFunctionManager;
import rcms.fm.resource.QualifiedResourceContainer;
import rcms.fm.resource.qualifiedresource.XdaqApplicationContainer;
import rcms.fm.resource.qualifiedresource.XdaqExecutive;
import rcms.statemachine.definition.State;
import rcms.statemachine.definition.StateMachineDefinitionException;
import rcms.util.logger.RCMSLogger;
import rcms.util.logsession.LogSessionConnector;

import rcms.resourceservice.db.Group;
import rcms.resourceservice.db.RSConnectorIF;
import rcms.resourceservice.db.resource.fm.FunctionManagerResource;

import rcms.utilities.runinfo.RunInfo;
import rcms.utilities.runinfo.RunInfoException;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
	* Function Machine to control a Level 2 HCAL Function Manager
	* 
	* @author Arno Heister
	*
	*/

public class HCALlevelTwoFunctionManager extends HCALFunctionManager {

	static RCMSLogger logger = new RCMSLogger(HCALlevelTwoFunctionManager.class);

	public HCALlevelTwoFunctionManager() {}

	public void init() throws StateMachineDefinitionException,rcms.fm.fw.EventHandlerException {

		super.init();

		// add event handler
		theEventHandler = new HCALlevelTwoEventHandler();
		addEventHandler(theEventHandler);
	}
}
