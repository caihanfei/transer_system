package com.bjsxt.mapper;

import com.bjsxt.pojo.Account;

public interface AccountMapper {
	public Account selByAccnoPwd(Account account);
	public Account selByAccnoName(Account account);
	public int updBalanceByAccno(Account account);
}
