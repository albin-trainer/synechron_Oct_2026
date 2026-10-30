package com.example.secure.config;

import java.io.IOException;

import io.jsonwebtoken.JwtException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthenticationFilter
        extends OncePerRequestFilter {

    private final JwtUtils jwtUtils;
    private final UserDetailsService userDetailsService;

    public JwtAuthenticationFilter(
            JwtUtils jwtUtils,
            UserDetailsService userDetailsService) {

        this.jwtUtils = jwtUtils;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {
    	
        String header = request.getHeader("Authorization");
System.out.print("filtering");
        if (header == null || !header.startsWith("Bearer ")) {
      	  System.out.println(" null header or no bearer ");

            filterChain.doFilter(request, response);
            return;
        }

        String token = header.substring(7);
        System.out.print("token" +token);

        try {
            String uname = jwtUtils.extractUsername(token);
            System.out.print("uname" +uname);
            if (SecurityContextHolder.getContext()
                    .getAuthentication() == null) {
                System.out.println("getAuthentication i null" +uname);

                UserDetails userDetails =
                        userDetailsService.loadUserByUsername(uname);

                if (jwtUtils.isTokenValid(token, userDetails)) {
                	  System.out.println("valid token");
                    UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(
                                    userDetails,
                                    null,
                                    userDetails.getAuthorities());

                    authentication.setDetails(
                            new WebAuthenticationDetailsSource()
                                    .buildDetails(request));

                    SecurityContextHolder.getContext()
                            .setAuthentication(authentication);
                }
            }
        } catch (JwtException | IllegalArgumentException ex) {
        	  System.out.println(" eception 1 "+ex);
            response.sendError(
                    HttpServletResponse.SC_UNAUTHORIZED,
                    "Invalid or expired JWT");
            return;
        } catch (
                org.springframework.security.core.userdetails
                        .UsernameNotFoundException ex) {
      	  System.out.println(" eception  "+ex);

            response.sendError(
                    HttpServletResponse.SC_UNAUTHORIZED,
                    "Invalid authentication token");
            return;
        }

        filterChain.doFilter(request, response);
    }
   
}