package by.griizly.levkovskii.dao;

import by.griizly.levkovskii.entity.Report;

import java.util.List;

public interface IReportDAO<T> {

    List<Report> takeReport(String startDate, String endDate);
}
