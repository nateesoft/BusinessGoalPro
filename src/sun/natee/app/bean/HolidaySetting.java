package sun.natee.app.bean;

import java.util.Date;

public class HolidaySetting {

    private String code;
    private String name;
    private String chkActive;
    private String yearStart;
    private String yearEnd;
    private String rdLockDay;
    private Date dateHoliday;
    private String rdEveryDay;
    private String cbDayWeek;
    private String cbDayDialy;
    private String rdSpecificDay;
    private Date dateStart;
    private Date dateEnd;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChkActive() {
        return chkActive;
    }

    public void setChkActive(String chkActive) {
        this.chkActive = chkActive;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getRdLockDay() {
        return rdLockDay;
    }

    public void setRdLockDay(String rdLockDay) {
        this.rdLockDay = rdLockDay;
    }

    public Date getDateHoliday() {
        return dateHoliday;
    }

    public void setDateHoliday(Date dateHoliday) {
        this.dateHoliday = dateHoliday;
    }

    public String getRdEveryDay() {
        return rdEveryDay;
    }

    public void setRdEveryDay(String rdEveryDay) {
        this.rdEveryDay = rdEveryDay;
    }

    public String getCbDayWeek() {
        return cbDayWeek;
    }

    public void setCbDayWeek(String cbDayWeek) {
        this.cbDayWeek = cbDayWeek;
    }

    public String getCbDayDialy() {
        return cbDayDialy;
    }

    public void setCbDayDialy(String cbDayDialy) {
        this.cbDayDialy = cbDayDialy;
    }

    public String getRdSpecificDay() {
        return rdSpecificDay;
    }

    public void setRdSpecificDay(String rdSpecificDay) {
        this.rdSpecificDay = rdSpecificDay;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

}
