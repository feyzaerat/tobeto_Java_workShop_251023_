package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;
public class Main {
    public static void main(String[] args) {

        Category category1 = new Category(1,"Books");
        Category category2 = new Category(2,"Notebooks");
        Category category3 = new Category(3,"Accessories");

        Product product1   = new Product(1, 1,"Learn Java in 100 days",50,10, true);
        Product product2   = new Product(2, 1,"Fundamentals of Network Security", 70, 5,true );
        Product product3   = new Product(3, 2,"Unlined A5 Notebook", 25, 30, true);
        Product product4   = new Product(4, 2,"Checkered A4 Notebook", 35, 0, false);
        Product product5   = new Product(5, 3,"Minions Character Bookmark", 5, 50, true);
        Product product6   = new Product(6, 3,"Colorful Sticker", 3, 0, false);

        User user1         = new User(1,"Feyza ERAT", "feyzakrnfl@gmail.com", "05365897415", "Ataevler St. Kartepe, KOCAELİ");
        User user2         = new User(2,"Seyda KARANFİL", "seydakrnfl@gmail.com", "05365257447", "Fatih St. İzmit, KOCAELİ");
        User user3         = new User(3,"Ferit ERAT", "feriterats@gmail.com", "05361557447", "4 Eylül St. İzmit, KOCAELİ");

        Order order1       = new Order(1, 1, "23.10.2023", "202301", "Details", true);
        Order order2       = new Order(2, 2, "25.10.2023", "202302", "Details", false);


        ////////////////categories////////////////////////

        Category[] categories = {category1,category2,category3};
        System.out.println("_________________________________________________");
        System.out.println("Our Categories : ");
        System.out.println("_________________________________________________");

        for (Category category: categories) {
            System.out.println("* "+category.getCategoryName());

        }
        ////////////////products////////////////////////

        Product[] products = {product1,product2,product3,product4,product5,product6};
        System.out.println("_________________________________________________");
        System.out.println("Our Products : ");
        System.out.println("_________________________________________________");

            System.out.println("CategoryID  " + "Product Name");


            for (Product product: products) {
                 for(Category category:categories)
                //System.out.println("* "+category.getCategoryName());

                        if(category.getCategoryId() == product.getCategoryId()){
                            if(product.getQuantityStock()!=0){
                            System.out.println("*       "+category.getCategoryId() + " : " + product.getProductName());
                        }
                            else{
                                System.out.println("*       "+category.getCategoryId() + " : " + product.getProductName() + " (-----OutOfStock!-----) ");
                            }
                    }

           }

        ////////////////orders////////////////////////

        Order[] orders = {order1,order2};
        User[]  users  = {user1,user2,user3};
        System.out.println("_________________________________________________");
        System.out.println("Orders : ");
        System.out.println("_________________________________________________");



        System.out.println("OrderID  OrderNO  Date      Status");

        for (User user: users){
            for (Order order: orders){
                if(order.getUserId() == user.getUserId()){
                    if(order.getOrderDelivered()){
                        System.out.println("*    " + order.getOrderId()+"   "+ order.getOrderNumber()+"   "+ order.getOrderDate()+ " "+user.getUserName()+ "     Order Delivered");
                    }
                    else{
                        System.out.println("*    " + order.getOrderId()+"   "+ order.getOrderNumber()+"   "+ order.getOrderDate()+ " "+user.getUserName()+ " Order Not Delivered");
                    }
                }

            }
        }
    }
}

