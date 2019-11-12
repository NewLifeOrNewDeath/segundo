package Dao;

import util.Conexion;
import nomina.*;

public class LiquidacionDao extends Conexion<Liquidacion> 
implements GenericDao<Liquidacion>{
	
public LiquidacionDao() {
	super(Liquidacion.class);
	}
}