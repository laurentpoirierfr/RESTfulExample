package fr.homezone.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ForwardingFilter implements Filter {

	@Override
	public void destroy() {
		return;
	}

	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		return;
	}
}
