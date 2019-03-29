package planets;

import javafx.scene.paint.Color;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlanetPredicates {

  public static Predicate<Planet> hasMoonsMoreThan(Integer moons){
      //usando lambda
      return p -> p.getNumberOfMoons() > moons;
  }
  public static Predicate<Planet> hasAColor(){
      //usando lambda
      return p -> p.getPrimaryColor() != null;
  }

  public static Predicate<Planet> hasAColorNotBlack(){
      return p -> p.getPrimaryColor() != Color.BLACK;
  }
  public static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate){
      //usando stream
      return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
  }
  public static StringBuilder listFilteredPlanets(List<Planet> planetList, Predicate<Planet> predicate){
      StringBuilder planets = new StringBuilder();
      //usando stream
      planetList.stream()
        .filter((planet) -> (predicate.test(planet)))
        .forEach((planet) -> { planets.append(planet).append(" "); } );

      return planets;
  }

}
