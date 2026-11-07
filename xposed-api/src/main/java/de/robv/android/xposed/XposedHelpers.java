package de.robv.android.xposed;
public final class XposedHelpers { private XposedHelpers() {} public static Class<?> findClass(String n,ClassLoader l)throws ClassNotFoundException{return Class.forName(n,false,l);} }
