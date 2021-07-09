package com.sunil.corejava;

import java.util.*;

public class HashMapExample {
    public static void main(String a[]) {


        HashMap m = new HashMap();
        Map msync = Collections.synchronizedMap(m);

        m.put("umbrella", 102);
        m.put("nagarhjuna",103);
        m.put("sunil", 101);
        System.out.println("------ "+m.put("test",1));
        System.out.println("------ "+m.put("test",2));

        LinkedHashMap l = new LinkedHashMap();
        l.put("umbrella", 102);
        l.put("nagarhjuna",103);
        l.put("sunil", 101);

        System.out.println("REplacing value "+m.put("k",102));
        System.out.println("Entire HashMap "+ m);
        System.out.println("Entire LinkedHashMap "+ m);

        Set s = m.keySet();
        System.out.println("Entry set "+s);
        Collection c = m.values();
        System.out.println("Values are "+ c);

        Set e = m.entrySet();
        System.out.println("Entry set "+ e);

        Iterator itr = e.iterator();
        while(itr.hasNext()){
            Map.Entry mp = (Map.Entry) itr.next();
            System.out.println(mp.getKey()+"--- "+mp.getValue());
            if(mp.getKey().equals(101)){
                mp.setValue("Sunil");
            }

        }
        System.out.println("output is "+ m);

        HashMap mymap = new HashMap();
        Integer i1 = new Integer(10);    // by default hash map uses .equals methods which compares content
        Integer i2 = new Integer(10);
        mymap.put(i1,"sunil");
        mymap.put(i2,"sutt");

        mymap.put(23,"test");
        System.out.println("e\testing map "+ mymap);
        if(mymap.containsValue("test"))
            System.out.println("======="+mymap.get(23));

        System.out.println("hashmap output "+ mymap);

        IdentityHashMap Imymap = new IdentityHashMap(); // uses == method which uses address comparsion
        Integer i11 = new Integer(10);
        Integer i22 = new Integer(10);
        Imymap.put(i11,"sunil");
        Imymap.put(i22,"sutt");
        System.out.println("Identity hashmap output "+ Imymap);

    }


}
