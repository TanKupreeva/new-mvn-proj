package enums;

public enum Days {

    MONDAY(1,"MON"),
    TUESDAY(2, "TUE"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "THU"),
    FRIDAY(5, "FRI"),
    SATURDAY(6,"SAT") {
        @Override
        public void work() {
            System.out.println("Chill");
        }
    }, SUNDAY(7,"SUN") {
        @Override
        public void work() {
            System.out.println("Chill");
        }
    };
    private int num;
private String code;
 Days(int num,String code){
    this.num = num;
    this.code = code;
}
    public void work() {
        System.out.println("Go to work");
    }

    Days getWeekDayByCode(String code){
        for (Days day: values()) {
            if(day.code.equalsIgnoreCase(code)){
                return day;
            }
        }
        throw new IllegalArgumentException("No such week day by code " + code);
    }

    public static String getDs(int number) {
        switch (number) {
            case 1:
                return "mon";
            case 2:
                return "tue";
            case 3:
                return "wed";
            case 4:
                return "thu";
            case 5:
                return "fri";
            case 6:
                return "sat";
            case 7:
                return "sun";

        }
        throw new IllegalArgumentException();

    }


    public static Days getDays(int num) {
        switch (num) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;

        }
        throw new IllegalArgumentException();

    }
}
