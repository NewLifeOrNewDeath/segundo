package Dao;

import util.Conexion;
import nomina.*;

public class TerceroDao extends Conexion<Tercero> 
implements GenericDao<Tercero>{
	
public TerceroDao() {
	super(Tercero.class);
	}
}