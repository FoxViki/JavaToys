
public class Toy {
    int id;
    String name;
    int winner;

    public int getId() {
            return id;
        }

    public int getWinner() {
        return winner;
    }
    
    public void put (String stringToy) {
        String[] arrayToy = stringToy.split(" ");
        if (arrayToy.length == 3) {
            this.id = Integer.parseInt(arrayToy[0].trim());
            this.winner = Integer.parseInt(arrayToy[1].trim());
            this.name = arrayToy[2].trim();
        }
        else {
            System.out.println("Ввод данных некорректен");
        }
    }
}
