import java.util.ArrayList;
public class RearrangeArray{
    public static void arrange(ArrayList<Integer> a) {
        int [] array = new int [a.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = a.get(a.get(i));
        }
        a.clear();
        for(int i : array){
            a.add(i);
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(3);
        arrange(list);
        for(int i : list){
            System.out.println(i);
        }
    }
}