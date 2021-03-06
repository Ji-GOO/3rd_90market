package com.googongmarket.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.HandlerInterceptor;

import com.googongmarket.domain.MemberVO;

public class CheckLoginInterceptor implements HandlerInterceptor {

	@Resource(name = "loginMember")
	@Lazy
	private MemberVO loginMember;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(loginMember.isMemberLogin() == false) {
			
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/auth/not_login");
			
			return false;
		}
		
		return true;
	}
}
