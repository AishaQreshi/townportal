/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remy.townportal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw= response.getWriter();
        
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if(username.equals("Robin") && password.equals("1234")){
             pw.print("Success");
        }else
            pw.print("Failed");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}