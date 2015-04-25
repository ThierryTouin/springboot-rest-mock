package fr.touin.thierry.service.rest;

import org.springframework.stereotype.Component;  
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.io.IOException;

@Component
public class CORSFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:3000"); // Client URL
        //response.setHeader("Access-Control-Allow-Origin", "*"); // Client URL
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Accept, Origin, X-Requested-With, Content-Type, Last-Modified, Authorization, X-Custom-Header");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");       
        
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}