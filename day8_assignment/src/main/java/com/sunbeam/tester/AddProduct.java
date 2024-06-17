package com.sunbeam.tester;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Product;
import com.sunbeam.entities.Category;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class AddProduct {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)
				) {
			//create dao instance
			ProductDao dao=new ProductDaoImpl();
			System.out.println("Enter Product details -\"int availableQuantity\"Category category \r\n"
					+ "double price \r\n"
					+ "String productName \r\n");
			Product newProduct=new Product(sc.nextInt(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sc.next());
			System.out.println(dao.add(newProduct));
		} //JVM : sc.close() , sf.close() -> DBCP will be cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
