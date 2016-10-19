package com.task.controller;

import org.apache.log4j.Logger;

import com.task.beans.Request;
import com.task.beans.Response;
import com.task.command.Command;

public class Controller {
	
	private final static Logger logger = Logger.getRootLogger();
	private final CommandProvider provider = new CommandProvider();

	public Response doAction(Request request) {
		String commandName = request.getCommandName();

		Command command = provider.getCommand(commandName);

		Response response = command.execute(request);
		
		logger.debug("Команда выполнена");
		return response;

	}
}
