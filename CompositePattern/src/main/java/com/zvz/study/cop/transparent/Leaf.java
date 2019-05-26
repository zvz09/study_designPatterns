package com.zvz.study.cop.transparent;

import java.util.ArrayList;

/**
 * Deprecated注解呢？就是在编译器期告诉调用者，你可以调我这个方法，
 * 但是可能出现错误哦，我已经告诉你“该方法已经失效”了，你还使用那在运行期也会抛出
 * UnsupportedOperationException异常。
 */
public class Leaf extends Component {
    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
//空实现,直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
//空实现
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
//空实现
        throw new UnsupportedOperationException();
    }
}