public class Date {
    private int date;
    private int month;
    private int year;
    public Date(int date,int month,int year)
    {
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public void setDate(int date)
    {
        this.date=date;
    }
    public int getDate()
    {
        return this.date;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }
    public int getMonth()
    {
        return this.month;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public int getYear()
    {
        return  this.year;
    }
    public String toString()
    {
        return String.format("%02d/%02d/%04d",date,month,year);
    }
    public Date isRecent(Date d1,Date d2)
    {
        if(d1.getYear()>d2.getYear())
        {
            return d1;
        }
        else if(d1.getMonth()>d2.getMonth())
        {
            return d1;
        }
        else if(d1.getDate()>d1.getDate())
        {
            return d1;
        }
        else
        {
            return d2;
        }
    }
}
