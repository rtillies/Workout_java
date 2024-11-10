// package Workout;
public class WorkoutDemo {
    public static void main(String args[]) {
        Customer customer = new Customer("Professor T", 70, 220);

        customer.addWorkout();
        // customer.finishWorkout();
        customer.addWorkout(8);
        // customer.finishWorkout();
        customer.addWorkout();
        // customer.finishWorkout();
        customer.addWorkout(6);
        // customer.finishWorkout();
        customer.addWorkout();
        // customer.finishWorkout();
        customer.addWorkout(10);
        // customer.finishWorkout();
        customer.addWorkout();
        // customer.finishWorkout();
        customer.addWorkout(4);
        // customer.finishWorkout();
        // customer.addWorkout();
        // customer.finishWorkout();
        // Workout workout = new Workout();


        System.out.println(customer);
    }
}