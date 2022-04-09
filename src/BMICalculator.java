public class BMICalculator  {

    public BMICalculator() {
    }

    public double value( double weight, double height ) {
    // return BMI; // don’t use BMI as your variable name as it is all uppercase – the
        return (weight/(height*height));

    }

    public String classification8( double bmi ) {
    // return the 8 category (Wikipedia) classification for this BMI
        if(bmi > 0 && bmi <= 15){
            return "Very severely underweight";
        }
        if(bmi > 15 && bmi <= 16){
            return "Severely underweight";
        }
        if(bmi > 16 && bmi <= 18.5){
            return "Underweight";
        }
        if(bmi > 18.5 && bmi <= 25){
            return "Normal (healthy weight)";
        }
        if(bmi > 25 && bmi <= 30){
            return "Overweight";
        }
        if(bmi > 30 && bmi <= 35){
            return "Obese Class I (Moderately obese)";
        }
        if(bmi > 35 && bmi <= 40){
            return "Obese Class II (Severely obese)";
        }
        if(bmi > 35){
            return "Obese Class III (Very severely obese)";
        }
            return "some thing wrong when imput";
    }

    public String classification3( double bmi ) {
    // return the 3 category (high, normal, low) classification for this BMI
        if(bmi <= 18.5){
            return "low";
        }
        if(bmi > 18.5 && bmi <= 25){
            return "normal";
        }
        if(bmi > 25){
            return "high";
        }

        return null;
    }

}
