package fr.homezone.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.homezone.exception.BusinessException;
import fr.homezone.exception.TechnicalException;
import fr.homezone.model.Account;
import fr.homezone.service.AccountsService;

public class AccountsServiceImpl implements AccountsService {

	public Account getAccount(String customer, String id) throws BusinessException, TechnicalException {

		System.out.println("Customer : " + customer);
		
		if (true)
			throw new TechnicalException("message 1", "message 2");
		
		return new Account("1", "account de base");

	}

	public List<Account> getAccounts(String customer) throws BusinessException, TechnicalException {

		System.out.println("Customer : " + customer);
		
		List<Account> list = new ArrayList<Account>();

		list.add(new Account("1", "account de base"));
		list.add(new Account("2", "account de base 2"));
		list.add(new Account("3", "account de base 3"));
		list.add(new Account("4", "account de base 4"));

		
		return list;

	}
}
