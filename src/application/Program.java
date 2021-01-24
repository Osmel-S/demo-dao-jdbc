package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		// forma de injecao de dependencia sem explicitar a implementacao
		SellerDao sellerDao = DaoFactory.createSellerDao();// dessa forma o programa nao conhece a implementacao,apenas a interface.
	
	
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
