
/**
 * Write a description of class ClockTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockTime
{
    private int hours; //holds number of hours in the day
    private int minutes; //holds number of minutes in the day
    private int seconds; //holds number of seconds in the day

    public ClockTime() //initalizes the instance variables to 0
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public ClockTime(int theHours, int theMinutes, int theSeconds) //formats the amount of hours, minutes, and seconds to the proper time format
    {
        hours = theHours;
        minutes = theMinutes;
        seconds = theSeconds;

        if (seconds > 59) //if seconds is over 59, divide by 60 to get the minutes and mod by 60 to get remaining seconds
        {
            int extraMinute = seconds / 60;
            int overSeconds = seconds % 60;
            if (seconds < 0) //if seconds is negative, set to 0
            {
                seconds = 0;
            }
        }
        if (minutes > 59) //if minutes is over 59, divide by 60 to get the hours and mod by 60 to get remaining minutes
        {
            int extraHours = minutes / 60;
            int overMinutes = minutes % 60;
            if (minutes < 0) //if minutes is negative, set to 0
            {
                minutes = 0;
            }
        }
        if (hours > 24) //if hours is greater than 24, mod by 60 to get left over hours
        {
            int overHours = hours % 24;
            if (hours < 0) //if hours is negative, set to 0
            {
                hours = 0;
            }
        }
    }

    public void setHour(int theHours) //sets the hours
    {
        hours = theHours;
    }

    public void setMinute(int theMinutes) //sets the minutes
    {
        minutes = theMinutes;
    }

    public void setSecond(int theSeconds) //sets the seconds
    {
        seconds = theSeconds;
    }

    public int getHour() //gets the hours
    {
        return hours;
    }

    public int getMinute() //gets the minutes
    {
        return minutes;
    }

    public int getSecond() //gets the seconds
    {
        return seconds;
    }

    public String toString() //formats and returns the hours, minutes, and seconds
    {
        String h = Integer.toString(this.hours);
        String m = Integer.toString(this.minutes);
        String s = Integer.toString(this.seconds);
        if (hours < 10) //adds a leading zero if the hours is a one digit number
        {
            h = "0" + h;
        }
        if (minutes < 10) //adds a leading zero if the minutes is a one digit number
        {
            m = "0" + m;
        }
        if (seconds < 10) //adds a leading zero if the seconds is a one digit number
        {
            s = "0" + s;
        }
        return h + ":" + m + ":" + s; //prints the time format
    }

    public String toString12() //formats and returns the time in a 12-hour format along with determining if it is A.M. or P.M.
    {
        int twelveHour;
        String morning_evening = "A.M.";
        if (hours > 12) //if hours is over 12, mod by 12 to find left over hours and add P.M. to signify it is evening
        {
            twelveHour = hours % 12;
            morning_evening = "P.M.";
        }
        else
        {
            twelveHour = hours;
        }
        String h = Integer.toString(twelveHour);
        String m = Integer.toString(minutes);
        String s = Integer.toString(seconds);
        if (twelveHour < 10) //adds a leading zero if the hours is a one digit number
        {
            h = "0" + h;
        }
        if (minutes < 10) //adds a leading zero if the minutes is a one digit number
        {
            m = "0" + m;
        }
        if (seconds < 10) //adds a leading zero if the seconds is a one digit number
        {
            s = "0" + s;
        }
        return h + ":" + m + ":" + s + " " + morning_evening; //prints out the twelve-hour format
    }

    public void advance(int additionalSeconds) //adds a certain amount of seconds to the preexisting time/clock
    {
        seconds += additionalSeconds; //adds the additional seconds to the current amount of seconds

        int extraMinutes = seconds / 60; //divides seconds by 60 to get the amount of new minutes

        seconds = seconds % 60; //mods seconds by 60 to find new remaining seconds

        minutes += extraMinutes; //adds the new minutes to the intial minutes

        int extraHours = minutes / 60; //divides minutes by 60 to find new hours

        minutes = minutes % 60; //mods minutes by 60 to find new remaining minutes

        hours += extraHours; //adds the new hours to the initial hours

        hours %= 24; //mods hours by 24 to format the time correctly (i.e. only 24 hours in a day)

    }

    public boolean equals(ClockTime clockTime) //determines after the advance method is called if clock1 and clock2 have the same time
    {
        if ((seconds == clockTime.getSecond()) && (minutes == clockTime.getMinute()) && (hours == clockTime.getHour()))
        //checks if the seconds, hours, and minutes of the current clock and the original clock are equal
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
