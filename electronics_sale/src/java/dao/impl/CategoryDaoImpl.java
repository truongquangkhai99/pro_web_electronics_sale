/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateJdbcException;
import org.springframework.stereotype.Repository;
import pojo.Danhmuc;
import util.HibernateUtil;
import dao.CategoryDao;

/**
 *
 * @author tranv
 */
@Repository

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public List<Danhmuc> getListDanhMuc() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Danhmuc> listCategory = new ArrayList<>();
        try {
            Query query = session.createQuery("from Danhmuc");
            listCategory = (ArrayList<Danhmuc>) query.list();
        } catch (HibernateJdbcException ex) {
            ex.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return listCategory;
    }

//    public boolean existDanhMucConByID(int id) {
//        boolean check = false;
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            Query query = session.createQuery("from Danhmuc where ma_dm=:id and ma_dmcha!=0 ");
//            query.setInteger("id", id);
//            List result = query.list();
//            if (!result.isEmpty()) {
//                check = true;
//            }
//        } catch (HibernateJdbcException ex) {
//            ex.printStackTrace();
//        } finally {
//            session.flush();
//            session.close();
//        }
//        return check;
//    }

//    public static void main(String[] args) {
//        List<Danhmuc> list = new CategoryDaoImpl().getListDanhMuc();
//        list.forEach((danhmuc) -> {
//            System.out.println(danhmuc.getTendanhmuc());
//        });
//        System.out.println(new CategoryDaoImpl().existDanhMucConByID(13));

//    }
    
}
