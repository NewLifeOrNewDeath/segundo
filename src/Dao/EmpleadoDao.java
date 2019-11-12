package Dao;

import util.Conexion;
import nomina.*;

public class EmpleadoDao extends Conexion<Empleado> 
implements GenericDao<Empleado>{
	
public EmpleadoDao() {
	super(Empleado.class);
	}
}