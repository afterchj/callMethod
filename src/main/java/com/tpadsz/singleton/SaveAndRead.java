package com.tpadsz.singleton;

import java.io.*;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObj obj = MyObj.getInstance();
            FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(obj);
            oosRef.close();
            fosRef.close();
            System.out.println(obj.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fisRef = new FileInputStream("myObjectFile.txt");
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObj myObj= (MyObj) iosRef.readObject();
            iosRef.close();
            fisRef.close();
//            System.out.println(myObj.hashCode());//不是同一个对象
            System.out.println(myObj.readResolve().hashCode());//是同一个对象

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
