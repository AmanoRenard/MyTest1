package pers.amanorenard.homeworks.test2;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateUtils {
    private DateUtils() {
    }

    public static String dataToString(Date date) {
        SimpleDateFormat
                sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(date);
    }

    public static String dataToStringFmt(Date date, String fmt) {
        SimpleDateFormat
                sdf = new SimpleDateFormat(fmt);
        return sdf.format(date);
    }

    public static Date stringToDate(String str) {
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date stringToDateFmt(String str, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
