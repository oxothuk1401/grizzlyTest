package by.griizly.levkovskii.controller;

import by.griizly.levkovskii.util.ConvertDate;
import by.griizly.levkovskii.util.GetDate;
import by.griizly.levkovskii.validator.ValidationDate;
import by.griizly.levkovskii.entity.Report;
import by.griizly.levkovskii.service.ShowReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShowReportsController {
    @Autowired
    ShowReportsService showReportsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView(PageName.MAIN, AttributeName.REPORT, new Report());
    }

    @RequestMapping(value = "/show-reports", method = RequestMethod.POST)
    public ModelAndView showReports(@ModelAttribute(AttributeName.REPORT) Report report) {
        ModelAndView modelAndView = new ModelAndView();
        if (report.getTimePeriod() != null) { //проверяем выбрал ли польщователь Time period
            switch (report.getTimePeriod()) { //если выбрал сравниваем значения
                case AttributeName.LAST_QTR:
                    //с помощью утилитного класса GetDate подставляем нужные даты в нужном формате
                    report.setStartDate(GetDate.lastQtrStart());
                    report.setEndDate(GetDate.lastQtrEnd());
                    break;
                case AttributeName.LAST_MONTH:
                    report.setStartDate(GetDate.lastMonthStart());
                    report.setEndDate(GetDate.lastMonthEnd());
                    break;
                case AttributeName.LAST_CALENDAR_YEAR:
                    report.setStartDate(GetDate.lastYearStart());
                    report.setEndDate(GetDate.lastYearEnd());
                    break;
                case AttributeName.CURRENT_YEAR_TO_DATE:
                    report.setStartDate(GetDate.curentYearToDateStart());
                    report.setEndDate(GetDate.curentYearToDateEnd());
                    break;
                case AttributeName.CURRENT_QTR_TO_DATE:
                    report.setStartDate(GetDate.curentQtrToDateStart());
                    report.setEndDate(GetDate.curentQtrToDateEnd());
                    break;
                case AttributeName.CURRENT_MONTH_TO_DATE:
                    report.setStartDate(GetDate.curentMonthToDateStart());
                    report.setEndDate(GetDate.curentMonthToDateEnd());
                    break;
            }
           /* если Time Period не выбран поользователем прверяем введена ли дата начала
            поиска и введена ли они в нужном формате.
            Если нет выводим пользователю сообщение с ошибкой
            */
        } else if (!ValidationDate.validationDate(report.getStartDate())) {
            modelAndView.addObject(AttributeName.ERROR, "Enter Start Date in the format for example Sep 14,2006 or select a time period");
            modelAndView.setViewName(PageName.MAIN);
            return modelAndView;
             /* если Time Period не выбран поользователем прверяем введена ли дата окончания
            поиска и введена ли они в нужном формате.
            Если нет выводим пользователю сообщение с ошибкой
            */
        } else if (!ValidationDate.validationDate(report.getEndDate())) {
            modelAndView.addObject(AttributeName.ERROR, "Enter End Date in the format for example Sep 14,2006 or select a time period");
            modelAndView.setViewName(PageName.MAIN);
            return modelAndView;
        }
        //переходим на слой сервиса предварительно конвертируя даты в нужный формат для работы с БД
        List<Report> list = showReportsService.showReport(ConvertDate.convertDate(report.getStartDate()), ConvertDate.convertDate(report.getEndDate()));
       /* после получения данных с БД проверяем был ли найдены отчеты за данный период,
        если нет выводим пользователю сообщение*/
        if (list.isEmpty()) {
            modelAndView.addObject(AttributeName.ERROR, "Reports not found");
            modelAndView.setViewName(PageName.MAIN);
            return modelAndView;
        }
        //если отчеты были найдены переходим на страницу отображения
        modelAndView.addObject(AttributeName.VIEW_REPORT, list);
        modelAndView.setViewName(PageName.SHOW_REPORTS);
        return modelAndView;
    }
}