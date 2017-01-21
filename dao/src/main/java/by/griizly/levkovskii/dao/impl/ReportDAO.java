package by.griizly.levkovskii.dao.impl;

import by.griizly.levkovskii.dao.IReportDAO;
import by.griizly.levkovskii.entity.Report;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by oxothuk1401 on 07.10.2016.
 */
@Repository
public class ReportDAO implements IReportDAO {
    @Autowired
    SessionFactory sessionFactory;

    public List<Report> takeReport(String sDate, String eDate) {
        List<Report> result = null;
        //использую средства Hibernate подставляем даты для выборки из БД
        result = sessionFactory.getCurrentSession().
                createQuery("from Report where startDate between :sDate and :eDate")
                .setParameter("sDate" ,sDate )
                .setParameter("eDate" ,eDate )
                .list();
        return result;

    }
}