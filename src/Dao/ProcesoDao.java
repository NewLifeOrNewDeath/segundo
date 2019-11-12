package Dao;
import util.Conexion;
import nomina.*;

public class ProcesoDao extends Conexion<Proceso> 
implements GenericDao<Proceso>{
	
public ProcesoDao() {
	super(Proceso.class);
	}
}