package offer_task;

public class test_1 {
    public static void main (String[]args){
        StringBuilder sb = new StringBuilder();
        sb.append("Last ");
        sb.append("Christmas ");
        sb.append("I gave you my heart");
        String res = sb.toString().intern();
        

        System.out.println(res == "Last Christmas I gave you my heart");
    }
}
