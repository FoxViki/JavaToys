import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.put("1 15 мяч");
        Toy toy2 = new Toy();
        toy2.put("2 35 машинка");
        Toy toy3 = new Toy();
        toy3.put("3 50 мишка");


        PriorityQueue<Toy> priorityQueue = new PriorityQueue<>((a1, a2) -> Integer.compare(a2.getWinner(), a1.getWinner()));
        priorityQueue.add(toy1);
        priorityQueue.add(toy2);
        priorityQueue.add(toy3);

        int quantity = 10;
        for (int i = 0; i < quantity; i++) {
            new Get(priorityQueue);
        }
    }
}