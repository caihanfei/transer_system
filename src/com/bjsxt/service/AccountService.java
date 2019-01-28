package com.bjsxt.service;

import java.io.IOException;

import com.bjsxt.pojo.Account;

public interface AccountService {
	/**
	 * 帐号和密码不匹配状态码
	 */
	String ACCOUNT_PASSWORD_NOT_MATCH="帐号和密码不匹配";
	/**
	 * 余额不足
	 */
	String ACCOUNT_BALANCE_NOT_ENOUGH="余额不足";
	/**
	 * 账户姓名不匹配
	 */
	String ACCOUNT_NAME_NOT_MATCH="账户姓名不匹配";
	/**
	 * 转账失败
	 */
	String ERROR="转账失败";
	/**
	 * 转账成功
	 */
	String SUCCESS="转账成功";
	
	/**
	 * 转账
	 * @param accIn 收款帐号
	 * @param accOut 转账
	 * @return
	 */
	String transfer(Account accIn,Account accOut) throws IOException;
}
