import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TSPHill {

    // Define the number of cities
    static final int NUM_CITIES = 5;

    // Define the distances between cities
    static int distances[][] = {
        {0, 29, 20, 21, 16},
        {29, 0, 15, 16, 18},
        {20, 15, 0, 4, 12},
        {21, 16, 4, 0, 13},
        {16, 18, 12, 13, 0}
    };

    public static void main(String[] args) {
        int initialTour[] = getRandomTour();
        int bestTour[] = initialTour.clone();

        int initialDistance = calculateTotalDistance(initialTour);
        int bestDistance = initialDistance;

        boolean improved;

        do {
            improved = false;
            for (int i = 0; i < NUM_CITIES; i++) {
                for (int j = i + 1; j < NUM_CITIES; j++) {
                    int newTour[] = swapCities(bestTour, i, j);
                    int newDistance = calculateTotalDistance(newTour);

                    if (newDistance < bestDistance) {
                        bestTour = newTour.clone();
                        bestDistance = newDistance;
                        improved = true;
                    }
                }
            }
        } while (improved);

        System.out.println("Best Tour: " + Arrays.toString(bestTour));
        System.out.println("Best Distance: " + bestDistance);
    }

    // Generate a random tour (initial solution)
    private static int[] getRandomTour() {
        List<Integer> tour = new ArrayList<>();
        for (int i = 0; i < NUM_CITIES; i++) {
            tour.add(i);
        }
        Random random = new Random();
        for (int i = NUM_CITIES - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = tour.get(i);
            tour.set(i, tour.get(j));
            tour.set(j, temp);
        }
        return tour.stream().mapToInt(Integer::intValue).toArray();
    }

    // Calculate the total distance of a tour
    private static int calculateTotalDistance(int tour[]) {
        int totalDistance = 0;
        for (int i = 0; i < NUM_CITIES; i++) {
            totalDistance += distances[tour[i]][tour[(i + 1) % NUM_CITIES]];
        }
        return totalDistance;
    }

    // Swap two cities in the tour
    private static int[] swapCities(int[] tour, int i, int j) {
        int[] newTour = tour.clone();
        int temp = newTour[i];
        newTour[i] = newTour[j];
        newTour[j] = temp;
        return newTour;
    }
}