package fr.homezone.service;

import java.util.List;

import fr.homezone.exception.BusinessException;
import fr.homezone.exception.TechnicalException;
import fr.homezone.model.Account;

public interface AccountsService {

	public Account getAccount(String customer, String id) throws BusinessException, TechnicalException;

	public List<Account> getAccounts(String customer) throws BusinessException, TechnicalException;
}
