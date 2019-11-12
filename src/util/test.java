package util;

import java.util.ArrayList;

import Dao.ConceptoDao;
import Dao.EmpleadoDao;
import nomina.Concepto;
import nomina.Empleado;

public class test {
	public static void main(String []args) {
		ConceptoDao cDao=new ConceptoDao();
		ArrayList<Concepto> lista=new ArrayList<Concepto>();
		Concepto c=new Concepto();
		c.setCodconcepto("SUEBA");
		c=cDao.find(c.getCodconcepto());
		System.out.println("Banco--- "+c.getCodconcepto()+" descripcion de la db "+c.getDescripcion());
		EmpleadoDao eDao=new EmpleadoDao();
		Empleado e=new Empleado();
		e.setCodigo("11516");
		e.setNombre("Cristian David Lopez G");
		eDao.insert(e);
		
		}

}
