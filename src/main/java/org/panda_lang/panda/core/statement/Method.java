package org.panda_lang.panda.core.statement;

import org.panda_lang.panda.core.Alice;
import org.panda_lang.panda.core.Inst;
import org.panda_lang.panda.core.statement.util.NamedExecutable;

public class Method implements NamedExecutable {

    private final String methodName;
    private final Executable executable;

    public Method(NamedExecutable executable) {
        this(executable.getName(), executable);
    }

    public Method(String methodName, Executable executable) {
        this.methodName = methodName;
        this.executable = executable;
    }

    @Override
    public Inst execute(Alice alice) {
        if (executable != null) {
            return executable.execute(alice);
        }
        return null;
    }

    @Override
    public String getName() {
        return methodName;
    }

}
