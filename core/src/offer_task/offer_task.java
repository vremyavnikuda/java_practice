package offer_task;

import javax.swing.*;

public class offer_task {
    public static void main (String[]args) {
        //создаем объект JFrame (графическое окно)
        JFrame frame = new JFrame("Hello Java!");
        //создаем объект JLabel (выодит нашу запись и выровненную по центру)
        JLabel label = new JLabel("Hello Java!", JLabel.CENTER);
        frame.add(label);
        //указываем размеры окна
        frame.setSize(300, 300);
        //а так же область видимости
        frame.setVisible(true);
    }
}
