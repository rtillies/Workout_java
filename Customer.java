// package Workout;

public class Customer {

    private String name;
    private double height;
    private double weight;
    private Workout currentWorkout;
    private int totalWorkouts;
    private double totalCalories;
    private boolean isFinished;

    public Customer() {}

    public Customer(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        totalWorkouts = 0;
        totalCalories = 0.0;
        isFinished = false;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public Workout getCurrentWorkout() {
        return this.currentWorkout;
    }

    public double getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalWorkouts() {
        return this.totalWorkouts;
    }

    public double calcCaloriesPerWorkout() {
        return this.totalWorkouts == 0
            ? 0
            : totalCalories / totalWorkouts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void finishWorkout() {
        isFinished = true;
        totalWorkouts += 1;
        totalCalories += currentWorkout.getTotalCalories();
    }

    public void addWorkout() {
        // if(!isFinished) finishWorkout();
        this.currentWorkout = new Workout();
        System.out.println(this.currentWorkout.getExerciseList());
    }

    public void addWorkout(int count) {
        // if(!isFinished) finishWorkout();
        this.currentWorkout = new Workout(count);
        System.out.println(this.currentWorkout.getExerciseList());
    }

    public String toString() {
        String str = "";
        str += "Customer Information \n";
        str += "==================== \n";
        str += "Name:    " + this.getName() + "\n";
        str += String.format("Height: %6.1f inches %n", this.height);
        str += String.format("Weight: %6.1f pounds %n", this.weight);
        str += "Total Workouts:       " + this.totalWorkouts + "\n";
        str += String.format("Total Calories: %10.2f calories %n", this.totalCalories);
        str += String.format("Calories/Workout: %8.2f calories %n", this.calcCaloriesPerWorkout());
        return str;
    }
}