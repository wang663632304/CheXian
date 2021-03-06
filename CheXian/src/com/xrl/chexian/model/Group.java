package com.xrl.chexian.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Sanvi E-mail:sanvibyfish@gmail.com
 * @version 创建时间：2010-8-31 下午02:17:20
 */
public class Group<T extends Result> extends ArrayList<T> implements Result {
	private static final long serialVersionUID = 1L;

	public Group() {
		super();
	}

	public Group(Collection<T> collection) {
		super(collection);
	}


}
