package fr.homezone.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.homezone.exception.BusinessException;
import fr.homezone.exception.TechnicalException;
import fr.homezone.model.Account;
import fr.homezone.service.AccountsService;
import fr.homezone.service.impl.AccountsServiceImpl;

@Path("/customers/")
public class AccountsRest {

	private AccountsService service = new AccountsServiceImpl();

	/*
	 * @Context private HttpServletRequest request;
	 */

	@GET
	@Path("{customer}/accounts")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Account> getAccounts(
			@PathParam("customer") String customer)
					throws BusinessException, TechnicalException {
		return service.getAccounts(customer);
	}

	@GET
	@Path("{customer}/accounts/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Account getAccount(@PathParam("customer") String customer, @PathParam("id") String id)
			throws BusinessException, TechnicalException {
		return service.getAccount(customer, id);
	}

	@GET
	@Path("{customer}/accounts/{id}/ops")
	@Produces({ MediaType.APPLICATION_JSON })
	public Object getAccountsOperations(@PathParam("customer") String customer, @PathParam("id") String id)
			throws BusinessException, TechnicalException {
		return service.getAccount(customer, id);
	}

	@GET
	@Path("{customer}/accounts/{id}/ops/{id_ops}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Object getAccountsOperationsDetail(@PathParam("customer") String customer, @PathParam("id") String id,
			@PathParam("id_ops") String id_ops) throws BusinessException, TechnicalException {
		return service.getAccount(customer, id);
	}

}
