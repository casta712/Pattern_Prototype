package org.example.prototype;

import java.util.List;

public interface  IPrototype<T extends IPrototype> extends Cloneable {


    public T clone();

    public T deepClone();


}
