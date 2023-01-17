package oop_Инициализаторы_static_final;

public class ConstructorExample {
    private final String userName;
    private final static int [] square=new int[10];

    {
        for (int i = 0; i < 10; i++) {
            square[i] = i * i;
        }
    }

    public ConstructorExample(){
        userName="Anonymous";
    }

    public ConstructorExample(String userName) {
        this.userName=userName;
    }
    public void displaySquare(int i){
        System.out.println("Hello "+userName);
        System.out.println(i+" square is "+ square[i]);
    }
    public static void main (String[]args){
        new ConstructorExample().displaySquare(3);
        new ConstructorExample("Ed").displaySquare(5);
    }
}
