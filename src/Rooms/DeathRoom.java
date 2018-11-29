package Rooms;
import Game.Runner;
import People.Person;
import java.util.Scanner;
public class DeathRoom extends Room {
    public DeathRoom(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person YoureDead) {
        String response = "";
        occupant = YoureDead;
        YoureDead.setxLoc(this.xLoc);
        YoureDead.setyLoc(this.yLoc);

            System.out.println("You see a lit match fall onto a Cannon");
            System.out.println("3");
            System.out.println("2");
            System.out.println("       __\n" +
                    "                 /  \\\n" +
                    "           .-.  |    |\n" +
                    "   *    _.-'  \\  \\__/\n" +
                    "    \\.-'       \\\n" +
                    "   /          _/\n" +
                    "  |      _  /\"\n" +
                    "  |     /_\\'\n" +
                    "   \\    \\_/\n" +
                    "    \"\"\"\"");
            System.out.println("Wah Wah try again");
            Runner.gameOff();
    }
}