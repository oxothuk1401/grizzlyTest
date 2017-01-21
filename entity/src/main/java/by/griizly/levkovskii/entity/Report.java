package by.griizly.levkovskii.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Report implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idreports")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reportId;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "performer")
    private String performer;
    @Column(name = "activity")
    private String activity;
    private String timePeriod;

    public Report() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;

        if (reportId != report.reportId) return false;
        if (startDate != null ? !startDate.equals(report.startDate) : report.startDate != null) return false;
        if (endDate != null ? !endDate.equals(report.endDate) : report.endDate != null) return false;
        if (performer != null ? !performer.equals(report.performer) : report.performer != null) return false;
        if (activity != null ? !activity.equals(report.activity) : report.activity != null) return false;
        return timePeriod != null ? timePeriod.equals(report.timePeriod) : report.timePeriod == null;

    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        result = 31 * result + (timePeriod != null ? timePeriod.hashCode() : 0);
        return result;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
