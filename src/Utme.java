public class Utme {
    private String name;
    private double average;

    public Utme(String name, double average) {
        this.name = name;
        if (average > 0.0)
            if (average <= 400.0)
                this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double utmeAverage) {
        if (average > 0.0)
            if (average <= 400.0)
                this.average = average;
    }

    public double getAverage(){
        return average;
    }

    public String getUtmeScore(){
        String utmeScore = "";
            if (average >= 200.0)
                utmeScore = "Univerity";
            else if (average >= 180.0)
                utmeScore = "Polytechnic";
            else if (average >= 160.0)
                utmeScore = "College of Education";
            else
                utmeScore = "Failed, retake next year!";
            return utmeScore;

    }
}

