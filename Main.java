//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

                Turtle bob = new Turtle();
                bob.penColor("green");
                bob.width(5.0);
                bob.speed(2.0);

                //for(int i=0; i < 3; i++){
                   // bob.forward(100);
                    //bob.left(120);
                //}

                //for(int i=0; i < 5; i++){
                   // bob.forward(200);
                    //bob.left(145);
               // }
                bob.left(85);
        bob.forward(150);
        bob.left(85);
        bob.forward(40);
        bob.right(145);
        bob.forward(50);
        for(int i=0; i < 18; i++)
        {
            bob.forward(3);
            bob.right(6);
        }
        bob.forward(60);
        bob.left(30);
        bob.forward(100);
        bob.right(40);
        bob.forward(150);
        bob.right(145);
        bob.forward(100);
        bob.left(50);
        bob.forward(50);
        bob.right(55);
        bob.forward(43);
        }
    }
