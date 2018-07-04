package fr.gtm.proxibanque.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
/**
 * 
 * @author Adminl
 * la classe AutoFilter permet de jouer le role de douanier lors à la navigation d'un individu non connecté en lui refusant les accès.
 */
public class AutoFilter implements Filter{
	
	public static final String SESSION_AUTH ="conseiller";

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		final HttpSession session = ((HttpServletRequest) request).getSession();
		
		if(session.getAttribute(SESSION_AUTH) != null){
			chain.doFilter(request, response);
		}else {
			((HttpServletResponse) response).sendError(401,"VEUILLEZ vous authentifier");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
