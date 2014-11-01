/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.mahasiswa;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MahasiswaServlet extends HttpServlet {
    
    private final MahasiswaDao MahasiswaDao;
    
    public MahasiswaServlet(){
        super();
        MahasiswaDao = new MahasiswaDao();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    
        String redirectURL="jdbc:mysql://localhost:3306/uts";
        String act=request.getParameter("action");
        
        if(act.equalsIgnoreCase("insert")){ 
            
            System.out.println("Record Added Successfully");
        } else {
            
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(redirectURL);
        rd.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
