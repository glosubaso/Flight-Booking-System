package FlightBooking;

public final class Date{
    
    private int Day;
    private int Month;
    private int Year;
    private int Hour;
    private int Minute;

    public Date(int day, int month, int year, int hour, int minute) {
		super();
		Day = day;
		Month = month;
		Year = year;
		Hour = hour;
		Minute = minute;
	}

	public Date() {
		super();
	}

	public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int Hour) {
        this.Hour = Hour;
    }
    public int getMinute() {
        return Minute;
    }

    public void setMinute(int Minute) {
        this.Minute = Minute;
    }

	@Override
	public String toString() {
		return "DATE [Day:" + Day +
				"\n Month:" + Month +
				"\n Year:" + Year +
				"\n Hour:" + Hour +
				"\n Minute:" + Minute
				+ "]";
	}

  




}
