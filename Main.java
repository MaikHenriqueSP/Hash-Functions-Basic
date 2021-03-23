import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        TestRoutines testRoutines = new TestRoutines();
        
        testRoutines.divisionMethodCollisionsByTarget(12, 100, 3);
        testRoutines.divisionMethodCollisionsByTarget(11, 100, 3);

        testRoutines.collisionsCounter(97, 10000);
        testRoutines.collisionsCounter(200, 500000, 0.62);        
        testRoutines.collisionsCounter(200, 500000, 0.61803398875);
        
    }
}
