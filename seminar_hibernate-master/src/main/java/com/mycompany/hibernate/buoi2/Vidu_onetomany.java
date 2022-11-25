/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi2;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import com.mycompany.hibernate.model.LopHoc;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author DELL
 */
public class Vidu_onetomany {
    public static void main(String[] args) {

        Session session = HibernatUtil.getFACTORY().openSession();

        Query query = session.createQuery("From LopHoc ");// truy vấn trên entity(HQL)
        List<LopHoc> list = query.getResultList();

        for (LopHoc lopHoc : list) {
            System.out.println("Ten Lop :" + lopHoc.getTenLop()
                    + " - " + lopHoc.getListSinhVien()
            );
        }
    }

}
