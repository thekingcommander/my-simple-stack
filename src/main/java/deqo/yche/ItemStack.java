package deqo.yche;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by 21206074 on 07/11/2016.
 *
 * réponse à l'éxigence
 */
public class ItemStack implements SimpleStack {
    int t=0;
    private ArrayList<Item> p ;

    public ItemStack(){
        p= new ArrayList<Item>();

    }

    @Override
    public boolean isEmpty() {
       return this.p.isEmpty() ;
    }

    @Override
    public int getSize() {
       return this.p.size();
    }

    @Override
    public void push(Item item) {
        p.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(p.isEmpty()) throw new EmptyStackException();
        return p.get(p.size()-1);
    }

    @Override
    public ArrayList<Item> pop() throws EmptyStackException {
        if(p.isEmpty()) throw new EmptyStackException();
        p.remove(this.peek());
        return p;
    }
}
