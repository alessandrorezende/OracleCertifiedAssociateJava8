import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;
import planets.Planet;
import static planets.PlanetPredicates.*;


public class PlanetApp {

public static void main(String[] args){

  Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
  Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
  Planet earth = new Planet("Earth", Color.BLUE, 1, false);
  Planet mars = new Planet("Mars", Color.RED, 2, false);
  Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
  Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
  Planet uranus = new Planet("Uranus", Color.TEAL, 27, true);
  Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);

  List<Planet> planetList = new ArrayList<>();
  planetList.add(mercury);
  planetList.add(venus);
  planetList.add(earth);
  planetList.add(mars);
  planetList.add(jupiter);
  planetList.add(saturn);
  planetList.add(uranus);
  planetList.add(neptune);

  //CENARIO 1 - Que planetas tem aneis?
  System.out.println("Has one or more rings: " + listFilteredPlanets(planetList, (Planet p) -> p.isRinged()));

  //CENARIO 2 - Que planetas sao azuis e tem luas?
  System.out.println("\nIs blue and has moons: ");
  planetList.stream()
            .filter(p -> p.getPrimaryColor() == Color.BLUE && p.getNumberOfMoons() > 0)
            .forEach(s -> System.out.println(s + " "));

  //CENARIO 3 - Que planetas tem mais de 20 luas?
  System.out.println("\nHas over twenty moons: " + filterPlanets(planetList, hasMoonsMoreThan(20)));

  //CENARIO 4 - Que planeta tem uma cor que não seja a preta?
  System.out.println("\nHas a color not black: ");
  planetList.stream()
            .filter(hasAColorNotBlack())
            .forEach(s -> System.out.println(s + " "));

  //CENARIO 5 - Que planetas tem luas?
  planetList.removeIf((Planet p) -> { return (p.getNumberOfMoons() == 0); });
  System.out.println("\nHas one or more moons: " + planetList);



}


}
