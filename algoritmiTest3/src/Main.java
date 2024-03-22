import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Place city1 = new Place("Riga");
        Place city2 = new Place("Deli");

        List<Route> routes = new ArrayList<>();
        routes.add(new Route(city1, city2, 50));
        routes.add(new Route(city2, city1, 60));

        RouteCost routeCost = new RouteCost(routes);

        int totalCost = routeCost.calculateTotalCost();
        System.out.println("Total cost of the routes: " + totalCost);
    }
}
