import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(300,445);
        add(new GameField());
        setLocation(400,400);
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mainWindow = new MainWindow();
    }

}
