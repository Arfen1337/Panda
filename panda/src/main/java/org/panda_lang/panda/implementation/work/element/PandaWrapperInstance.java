package org.panda_lang.panda.implementation.work.element;

import org.panda_lang.core.work.Value;
import org.panda_lang.core.work.element.Wrapper;
import org.panda_lang.core.work.element.WrapperInstance;

public class PandaWrapperInstance implements WrapperInstance {

    @Override
    public Value execute(Value... parameters) {
        return null;
    }

    @Override
    public int[] getPointers() {
        return new int[0];
    }

    @Override
    public Wrapper getWrapper() {
        return null;
    }

}
