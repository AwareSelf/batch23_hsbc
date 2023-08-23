package layeredarchitecture.dao;

import layeredarchitecture.model.Emp;

public interface EmpDaoIntf {
	
	boolean save(Emp e);
	Emp retrieve(int empId);
	Emp[] retrieveAll();
	boolean delete(int empId);
	boolean contains(Emp e);
	
	

}
