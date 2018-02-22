

/**
 *
 * @author katrice/kmwdredden
 */


public class ExerciseDate {

    ExerciseDate(){
    }

    public static void date(){
        Date d1 = new Date();
        Date d2 = new Date();

        //after(Date when)
        boolean a = d1.after(d2);
        System.out.println("Date d1 comes after " + "date d2: " + a);

        //compareTo(Date when)
        if(d2.compareTo(d1) > 0){
            System.out.println("Date2 is after Date1.");
        }else if (d2.compareTo(d1)<0){
            System.out.println(("Date1 is after Date2."));
        }
        //before(Date when)
        boolean b = d1.before(d2);
        System.out.println("Date d1 comes before " + "date d2: " + b);

        //setTime() & getTime()
        System.out.println("Today :- " + d1);

        long plusOneDay = (1000 * 60 * 60 * 24);
        d1.setTime(d1.getTime() + plusOneDay);

        System.out.println("Tomorrow :- " + d1);


    }
}