package equals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author keith
 * @version 1.0
 * @date 2019/10/10
 */
public class Test {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        String begintTime = "2018-12-26";
        String endTime =  "2019-01-04";
        for(String days: findDaysStr(begintTime,endTime)){
            System.out.println(days);
        }

    }

    public static List<String> findDaysStr(String begintTime, String endTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dBegin = null;
        Date dEnd = null;
        try {
            dBegin = sdf.parse(begintTime);
            dEnd = sdf.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<String> daysStrList = new ArrayList<String>();
        daysStrList.add(sdf.format(dBegin));
        Calendar calBegin = Calendar.getInstance();
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        calEnd.setTime(dEnd);
        while (dEnd.after(calBegin.getTime())) {
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            String dayStr = sdf.format(calBegin.getTime());
            daysStrList.add(dayStr);
        }
        return daysStrList;
    }
}
