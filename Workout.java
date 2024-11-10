// package Workout;

class Exercise {
    String description;
    double calories;

    Exercise(String description, double calories) {
        this.description = description;
        this.calories = calories;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCalories() {
        return this.calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}

public class Workout {

    // private int count;
    private Exercise exercises[];
    private int counter;

    public Workout() {
        this.exercises = new Exercise[5];
        this.counter = 0;
    }

    public Workout(int count) {
        this.exercises = new Exercise[count];
        this.counter = 0;
    }

    public void addExercise(Exercise e) {
        if (counter < exercises.length) {
            exercises[counter] = e;
            counter++;
        }
    }

    public void addExercise(String description, double calories) {
        Exercise e = new Exercise(description, calories);
        addExercise(e);
    }

    public double getTotalCalories() {
        double total = 0.0;
        for (Exercise e : exercises) {
            total += e.getCalories();
        }
        return total;
    }

    public String getExerciseList() {
        String list = "Exercise List";
        for (Exercise e : exercises) {
            list += e.getDescription() + "\n";
        }
        return list;
    }

    public String toString() {
        String str = getExerciseList();
        str += String.format("Total Calories: %.1f", getTotalCalories());
        return str;
    }
}