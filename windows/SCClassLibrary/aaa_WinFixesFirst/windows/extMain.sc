+ Main { 	startup {		super.startup;	//	Document.startup;		// set the 's' interpreter variable to the default server.		interpreter.s = Server.default;		// make server window	//	Server.internal.makeWindow;		//	Server.local.makeWindow;			"startup.sc".loadPaths;				StartUp.run;	}	shutdown { // at recompile, quit	//	Server.quitAll;	//	HIDDeviceService.releaseDeviceList;		super.shutdown;	}}