import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;

public class TestRoutines {

    public void divisionMethodCollisionsByTarget(int m, int limit, int target) {
        for (int i = 0; i <= limit; i++) {
            int result = HashFunctions.division(i, m);
            if (result == target) {
                System.out.println("h("+ i + ") = " + target);
            }
        }
    }
    
    public void collisionsCounter(int m, int limit) throws IOException {
        int[] counter = new int[m];

        for (int j = 0; j <= limit; j++) {
            int result = HashFunctions.division(j, m);
            counter[result]++;
        }

        writeCollisionsFileCounterPerKey(counter, "divisao");
        
    }

    public void collisionsCounter(int m, int limit, double A) throws IOException {
        int[] counter = new int[m + 1];

        for (int j = 0; j <= limit; j++) {
            int result = HashFunctions.multiplication(j, m, A);
            counter[result]++;
        }
        
        writeCollisionsFileCounterPerKey(counter, "multiplicacao");
    }
    
    
    public void writeCollisionsFileCounterPerKey(int[] counter, String methodName) throws IOException {
        Path path = Paths.get("colisoes-metodo-" + methodName + "-" + LocalDateTime.now().toString() + ".txt");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counter.length; i++) {
            builder.append(String.valueOf(i) +", " + String.valueOf(counter[i]) + "\n");
        }

        Files.write(path,builder.toString().getBytes());
    }
    
}
