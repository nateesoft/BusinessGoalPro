package sun.natee.app.main.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringUtil {

    private static final SimpleDateFormat yyyyMMdd_db = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private static final SimpleDateFormat dd_MM_yyyy = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat yyyy = new SimpleDateFormat("yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat MM = new SimpleDateFormat("MM", Locale.ENGLISH);
    private static final SimpleDateFormat dd_MM_yyyy_HH_mm = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.ENGLISH);
    private static final SimpleDateFormat EEEE = new SimpleDateFormat("EEEE", Locale.ENGLISH);
    private static final SimpleDateFormat dd = new SimpleDateFormat("dd", Locale.ENGLISH);
    private static final SimpleDateFormat timeHHmm = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
    private static final DecimalFormat decNormalFmt = new DecimalFormat("#,##0.00");
    private static final DecimalFormat decNoPointFmt = new DecimalFormat("#,##0");

    public static String trim(String str) {
        if (str == null) {
            return "";
        }
        if (str.trim().equals("")) {
            return "";
        }
        return str;
    }

    public static String bahtFormat(Object str) {
        return decNormalFmt.format(str);
    }

    public static String intFormat(Object str) {
        return decNoPointFmt.format(str);
    }

    public static boolean isEmpty(String str) {
        return trim(str).isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !trim(str).isEmpty();
    }

    public static BigDecimal strToBig(String str) {
        str = str.replace(",", "");
        return new BigDecimal(str);
    }

    public static int strToInt(String str) {
        str = str.replace(",", "");
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
        }

        return 0;
    }

    public static Date strToDate(String str) {
        try {
            Date date = dd_MM_yyyy.parse(str);
            return date;
        } catch (ParseException e) {
        }
        return new Date();
    }

    public static Date strToDateTime(String str) {
        try {
            Date date = dd_MM_yyyy_HH_mm.parse(str);
            return date;
        } catch (ParseException e) {
        }
        return new Date();
    }

    public static String dateToDb(Date date) {
        return yyyyMMdd_db.format(date);
    }

    public static String dateStr(Date time) {
        return dd_MM_yyyy.format(time);
    }

    public static String dayStr(Date time) {
        return EEEE.format(time);
    }

    public static String yearStr(Date time) {
        return yyyy.format(time);
    }

    public static String monthStr(Date time) {
        return MM.format(time);
    }

    public static String ddStr(Date time) {
        return dd.format(time);
    }

    public static String timeStr(Date time) {
        return timeHHmm.format(time);
    }

    public static int getMaxMonth(Date time) {
        Calendar car = Calendar.getInstance(Locale.ENGLISH);
        car.setTime(time);

        int maxMonth = car.getActualMaximum(Calendar.DAY_OF_MONTH);
        return maxMonth;
    }

    public static boolean isMaxMonth(Date time) {
        Calendar car = Calendar.getInstance(Locale.ENGLISH);
        car.setTime(time);
        int maxMonth = car.getActualMaximum(Calendar.DAY_OF_MONTH);
        car.set(Calendar.DATE, maxMonth);

        String dateStr1 = dateStr(time);
        String dateStr2 = dateStr(car.getTime());
        return dateStr1.equals(dateStr2);
    }

    public static boolean isStartMonth(Date time) {        
        return ddStr(time).equals("01");
    }
    
    public static String showSystem(){
        return dd_MM_yyyy_HH_mm.format(new Date());
    }

}
