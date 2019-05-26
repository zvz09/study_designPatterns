package com.zvz.study.cp.template;

import com.zvz.study.cp.template.command.Command;

public class Invoker {
    private Command command;

    //受气包，接受命令
    public void setCommand(Command _command) {
        this.command = _command;
    }

    //执行命令
    public void action() {
        this.command.execute();
    }
}
