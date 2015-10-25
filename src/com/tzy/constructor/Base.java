package com.tzy.constructor;
public class Base
{
    private int baseName = 3;
    public Base()
    {
        callName();
    }
 
    public void callName()
    {
        System. out. println(baseName);
    }
 
 
    public static void main(String[] args)
    {
        Base b = new Sub();
    }
}
class Sub extends Base
{
    private int baseName = 5;
    public void callName()
    {
        System. out. println (baseName) ;
    }
}