package com.task.command;

import com.task.beans.Request;
import com.task.beans.Response;

public interface Command {
	Response execute(Request request);
}
