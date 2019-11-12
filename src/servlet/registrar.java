package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import nomina.*;
import Dao.*;
import util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

/**
 * Servlet implementation class registrarUsuario
 */
@WebServlet("/registrar")
public class registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		EmpleadoDao eDao = new EmpleadoDao();
		Empleado e = new Empleado();
		Empleado re = new Empleado();
		e.setCodigo(request.getParameter("codigo"));
		try {
			re=eDao.find(e.getCodigo());
			if(!re.getNombre().equals("")) {
				out.print("este usuario ya existe");
			}
		}catch(Exception e1)
		{
			e.setCedula(request.getParameter("cedula"));
			e.setNombre(request.getParameter("nombre"));
			Date f_naci = null;
			try {
				f_naci = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("f_nac"));
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}  
			Date f_ingr = null;
			try {
				f_ingr = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("f_ing"));
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			Date f_reti = null;
			try {
				f_reti = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("f_ret"));
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			
			e.setFechanacimiento(f_naci);
			e.setFechaingreso(f_ingr);
			e.setFecharetiro(f_reti);
			
			
			eDao.insert(e);
			out.print("Registrado");
		}		
	}

}