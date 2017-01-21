package by.griizly.levkovskii.service;

import by.griizly.levkovskii.dao.IReportDAO;
import by.griizly.levkovskii.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowReportsService {
    @Autowired
    private IReportDAO dbReportDAO;
    //в этом слое происходит обращение к слою DAO и передача дат начала и окончания выборки
    // через Spring AOP в слое сервиса происходит управление транзакциями, в нашем случае можно отключить транзакцию
    public List<Report> showReport(String startDate, String endDate) {
        List<Report> result = dbReportDAO.takeReport(startDate,endDate);
        return result;
    }
}
