package creational.poolPattern.code;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {
    Set<T> available = new HashSet<T>();
    Set<T> inUse = new HashSet<T>();

    // create
    protected abstract T create();

    // get
    public T getObject() {
        T obj;
        // if available empty -> create one and return
        if (available.isEmpty()) {
            obj = create();
        } else {
            // if avaiable not empty -> get one then remove from available and return
            obj = available.iterator().next();
            available.remove(obj);
        }
        // in all cases add to inuse
        inUse.add(obj);
        return obj;
    }

    // release
    public void releaseObject(T obj) {
        inUse.remove(obj);
        available.add(obj);
    }

    // available
    public int availableSize() {
        return available.size();
    }


}
