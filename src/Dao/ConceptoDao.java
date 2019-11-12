package Dao;

import util.Conexion;
import nomina.Concepto;

public class ConceptoDao extends Conexion<Concepto> 
implements GenericDao<Concepto>{
	
public ConceptoDao() {
	super(Concepto.class);
	}
}
