package Dao;

import util.Conexion;
import nomina.*;

public class TipoconceptoDao extends Conexion<Tipoconcepto> 
implements GenericDao<Tipoconcepto>{
	
public TipoconceptoDao() {
	super(Tipoconcepto.class);
	}
}