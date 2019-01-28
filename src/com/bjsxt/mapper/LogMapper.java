package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Log;

public interface LogMapper {
	public int insLog(Log log);
	public List<Log> selByPage(int pageStart,int pageSize);
	public long selCount();
}
