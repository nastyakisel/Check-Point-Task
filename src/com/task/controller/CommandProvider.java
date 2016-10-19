package com.task.controller;

import java.util.HashMap;
import java.util.Map;

import com.task.command.Command;
import com.task.command.impl.AddNewGoodsCommand;
import com.task.command.impl.GetQuantityOfGoodsCommand;
import com.task.command.impl.ShowAllGoodsCommand;


public class CommandProvider {
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	CommandProvider() {
		commands.put("ADD_NEW_GOODS", new AddNewGoodsCommand());
		commands.put("GET_QUANTITY", new GetQuantityOfGoodsCommand());
		commands.put("SHOW_ALL", new ShowAllGoodsCommand());
	}
	
	
	public Command getCommand(String commandName){
		Command command;
		command = commands.get(commandName);
		return command;
	}
}
