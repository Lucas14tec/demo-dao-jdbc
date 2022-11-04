package application;

import model.entities.Department;
import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1 , "Leandro", "EMAIL@PÃO", new Date(), 220.50, obj  );

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
