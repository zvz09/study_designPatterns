package com.zvz.study.ip.template;

import java.util.Vector;

public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector){
        this.vector = _vector;
    }
    //判断是否到达尾部
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return false;
        }else{
            return true;
        }
    }
    //返回下一个元素
    public Object next() {
        Object result = null;
        if(this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }
    //删除当前元素\

    /**
     * 开发系统时，迭代器的删除方法应该完成两个逻辑：一是删除当前元素，二是当
     * 前游标指向下一个元素。
     * @return
     */
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
