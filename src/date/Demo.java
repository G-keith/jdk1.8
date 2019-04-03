package date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * 新的日期API LocalDate | LocalTime | LocalDateTime
 * 新的日期API都是不可变的，更使用于多线程的使用环境中
 * https://blog.csdn.net/qq_29411737/article/details/80835658
 * @author keith
 * @version 1.0
 * @date 2019-04-03
 */
public class Demo {

    public void test(){
        // 从默认时区的系统时钟获取当前的日期时间。不用考虑时区差
        LocalDateTime date = LocalDateTime.now();
        //2018-07-15T14:22:39.759
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getHour());
        System.out.println(date.getMinute());
        System.out.println(date.getSecond());
        System.out.println(date.getNano());

        // 手动创建一个LocalDateTime实例
        LocalDateTime date2 = LocalDateTime.of(2017, 12, 17, 9, 31, 31, 31);
        System.out.println(date2);
        // 进行加操作，得到新的日期实例
        LocalDateTime date3 = date2.plusDays(12);
        System.out.println(date3);
        // 进行减操作，得到新的日期实例
        LocalDateTime date4 = date3.minusYears(2);
        System.out.println(date4);
    }
    public void test3(){
        // Duration:计算两个时间之间的间隔
        // Period：计算两个日期之间的间隔
        LocalDate localDate=LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2016,12,12);
        Period pe = Period.between(localDate, localDate2);
        System.out.println(pe);
        LocalTime localTime = LocalTime.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalTime localTime2 = LocalTime.now();
        Duration du2 = Duration.between(localTime, localTime2);
        System.out.println(du2);
        //转成毫秒
        System.out.println(du2.toMillis());
    }
    public void test5(){
        // temperalAdjust 时间校验器
        LocalDateTime ldt1 = LocalDateTime.now().withNano(0);
        //时间格式转化
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strDate1 = ldt.format(formatter);
        System.out.println(strDate1);
        System.out.println(ldt1);

        // 获取一年中的第一天
        LocalDateTime ldt2 = ldt1.withDayOfYear(1);
        System.out.println(ldt2);
        // 获取一个月中的第一天
        LocalDateTime ldt3 = ldt1.withDayOfMonth(1);
        System.out.println(ldt3);

        // 例如获取下周日  下一个工作日
        LocalDateTime ldt4 = ldt1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(ldt4);

        // 获取下一个工作日
        LocalDateTime ldt5 = ldt1.with((t) -> {
            LocalDateTime ldt6 = (LocalDateTime)t;
            DayOfWeek dayOfWeek = ldt6.getDayOfWeek();
            if (DayOfWeek.FRIDAY.equals(dayOfWeek)){
                return ldt6.plusDays(3);
            }
            else if (DayOfWeek.SATURDAY.equals(dayOfWeek)){
                return ldt6.plusDays(2);
            }
            else {
                return ldt6.plusDays(1);
            }
        });
        System.out.println(ldt5);
    }
    public static void main(String[] args) {
        Demo demo=new Demo();
        //demo.test();
        //demo.test3();
        demo.test5();
    }

}
