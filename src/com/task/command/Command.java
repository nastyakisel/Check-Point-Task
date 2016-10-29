package com.task.command;

import com.task.bean.Request;
import com.task.bean.Response;

public interface Command {
	Response execute(Request request);
}
