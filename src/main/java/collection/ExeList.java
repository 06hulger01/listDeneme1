package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExeList {
    public static void main(String[] args) {

   List<String>alist=new ArrayList<>();
   alist.add("ayşe");
   alist.add("ali");
   alist.add("mehmet");
   alist.add("veli");
   alist.add("okan");
   alist.add("deniz");
        System.out.println(alist.size());
        alist.add("ayşe");
        System.out.println(alist);
        alist.remove(1);
        System.out.println(alist);
        System.out.println(alist.subList(2, 3));
        System.out.println(alist.size());
        alist.add(0,"vena");
        System.out.println(alist);
        System.out.println(alist.remove("ayşe"));
        System.out.println(alist);
        System.out.println(alist.contains("vena"));
       // alist.clear();
        System.out.println(alist);
        System.out.println(alist.get(1).charAt(0));
        System.out.println(alist.get(0).contains("ve"));
        System.out.println(alist.indexOf("ayşe"));

        List<String>dunyaList=new ArrayList<>();
        Dunya turkiye=new Dunya();
        turkiye.name="Türkiye";
        turkiye.nufus=85000000;
        Dunya canada=new Dunya();
        canada.name="Kanada";
        canada.nufus=40000000;
        Dunya germany=new Dunya();
        germany.name="Almanya";
        germany.nufus=95000000;

        dunyaList.add("turkiye");
        dunyaList.add("canada");
        System.out.println(dunyaList.size());
        dunyaList.add("germany");


        for (int i = 0; i < dunyaList.size(); i++) {
            System.out.println(dunyaList.get(i));
        }
            ;

        }

}
