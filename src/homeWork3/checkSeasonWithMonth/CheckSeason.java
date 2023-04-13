package homeWork3.checkSeasonWithMonth;

public class CheckSeason {
//    MONTH month = MONTH.APRIL;
//    public void checkSeason(){
      public void checkSeason (MONTH month){
        switch (month){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("It's winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("It's spring");
                break;
            case JUNE:
            case JULE:
            case AUGUST:
                System.out.println("It's summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("Error");
        }

    }
}
