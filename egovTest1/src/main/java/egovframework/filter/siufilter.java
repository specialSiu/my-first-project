package egovframework.filter;


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

public class siufilter implements Filter{

	//초기화 파라미터를 읽어와서 저장할 필드 
		private String id;
		
		@Override
	    //필터 객체가 제거될 때 실행되는 메소드
		public void destroy() {

			
		}
		//클라이언트의 요청이 있을 때마다 실행. 필터 핵심 메소드
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse)response;
			 
			 
			HttpSession session = req.getSession();
			
			id = (String)session.getAttribute("id");
			
			System.out.println("siufilter doFilter() 동작중..."+id);
			
			if(id.isEmpty()||id ==null) {
				System.out.println("siufilter doFilter() 로그인 실패");
				resp.sendRedirect("/common/error.jsp");
			}
			
			//2.요청의 흐름 계속 이어가기
			chain.doFilter(request, response);
		}
		
		//필터가 최초 사용될 때 한 번만 호출되는 메소드
		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			//web.xml에 encoding 이라는 키값으로 저장된 utf-8 문자열 얻어오기
			/* encoding = filterConfig.getInitParameter("encoding"); */
		}
		

}
