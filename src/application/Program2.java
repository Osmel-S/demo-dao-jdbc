package application;



import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;



public class Program2 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert ==== : OK" );
		//Department department = new Department(null,"Music");
		//departmentDao.insert(department);
		//System.out.println("Inserted! New Id = " + department.getId());
		
		System.out.println("\n=== TEST 2: department delete ==== : OK");
		/*System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
		sc.close(); */
		
		System.out.println("\n=== TEST 3: department findAll ==== : OK ");
		  
		/*List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		} */
		
		System.out.println("\n=== TEST 4: department findById ==== : OK ");
		/*Department dep = departmentDao.findById(2);
		System.out.println(dep); */
		
		System.out.println("\n=== TEST 5: department update ==== : OK ");
		Department dep = departmentDao.findById(7);
		dep.setName("Music Update");
		departmentDao.update(dep);
		System.out.println("Update Completed!");
		

	}

}
