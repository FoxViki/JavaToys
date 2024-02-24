import java.util.PriorityQueue;
import java.io.FileWriter;
import java.util.Random;
import java.io.IOException;

public class Get {
    PriorityQueue<Toy> priorityQueue;
    public Get(PriorityQueue<Toy> priorityQueue) {
        this.priorityQueue = priorityQueue;
        winWrite();
    }

    private void winWrite() {
        try (FileWriter writer = new FileWriter("winnerlist.txt", true)) {
            Random random = new Random();
            int randomData = random.nextInt(100) + 1;

            if (randomData <= 15) {
                Toy noWinToy = priorityQueue.poll();
                Toy winnerToy = priorityQueue.peek();
                writer.write(String.valueOf(winnerToy.getId()));
                priorityQueue.add(noWinToy);
            }
            else if (randomData <= 35) {
                Toy noWinToy = priorityQueue.poll();
                Toy noWinToy2 = priorityQueue.poll();
                Toy winnerToy = priorityQueue.peek();
                writer.write(String.valueOf(winnerToy.getId()));
                priorityQueue.add(noWinToy);
                priorityQueue.add(noWinToy2);
            }
            else {
                Toy winnerToy = priorityQueue.peek();
                writer.write(String.valueOf(winnerToy.getId()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}