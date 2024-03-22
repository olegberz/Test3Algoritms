import java.util.*;

class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Route {
    private Place source;
    private Place destination;
    private int cost;

    public Route(Place source, Place destination, int cost) {
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public Place getSource() {
        return source;
    }

    public Place getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }
}

class RouteCost {
    private List<Route> routes;

    public RouteCost(List<Route> routes) {
        this.routes = routes;
    }

    public int calculateTotalCost() {
        int totalCost = 0;
        for (Route route : routes) {
            totalCost += route.getCost();
        }
        return totalCost;
    }
}