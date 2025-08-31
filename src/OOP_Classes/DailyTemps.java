// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         1
// IDE Name:	   Intellij


package OOP_Classes;

public class DailyTemps {
    private int[] weekTemp = new int[7];

    //Construtor
    public DailyTemps(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday) {
        weekTemp[0] = monday;
        weekTemp[1] = tuesday;
        weekTemp[2] = wednesday;
        weekTemp[3] = thursday;
        weekTemp[4] = friday;
        weekTemp[5] = saturday;
        weekTemp[6] = sunday;
    }
    //Takes in day and changes the temp for that specific day
    public void setTemp(int day, int temp){
        switch (day){
            case 0: weekTemp[0] = temp; break;
            case 1: weekTemp[1] = temp; break;
            case 2: weekTemp[2] = temp; break;
            case 3: weekTemp[3] = temp; break;
            case 4: weekTemp[4] = temp; break;
            case 5: weekTemp[5] = temp; break;
            case 6: weekTemp[6] = temp; break;
        }
    }

    //Returns the days with temps lower than 32
    public int Freezing(){
        int counter = 0;
        for (int day : weekTemp){
            if (day < 32){
                counter++;
            }
        }
        return counter;
    }

    //returns the warmest day of the week
    public String Warmest(){
        int temp = weekTemp[0];
        for (int day : weekTemp){
            if (temp < day){
                temp = day;
            }
        }
        for (int i = 0; i< weekTemp.length; i++){
            if (weekTemp[i] == temp){
                switch (i){
                    case 0: return "Monday";
                    case 1: return "Tuesday";
                    case 2: return "Wednesday";
                    case 3: return "Thursday";
                    case 4: return "Friday";
                    case 5: return "Saturday";
                    case 6: return "Sunday";
                }
            }
        }
        return null;
    }

    //Prints out the temps of the week with correct format
    public void printTemps(){
        System.out.println("Monday: " +     weekTemp[0]);
        System.out.println("Tuesday: " +    weekTemp[1]);
        System.out.println("Wednesday: " +  weekTemp[2]);
        System.out.println("Thursday: " +   weekTemp[3]);
        System.out.println("Friday: " +     weekTemp[4]);
        System.out.println("Saturday: " +   weekTemp[5]);
        System.out.println("Sunday: " +     weekTemp[6]);

    }

}
