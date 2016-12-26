package com.tzy.collection.deepcopy;

import com.tzy.commons.Node;
import com.tzy.commons.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangpeng12 on 2016/12/26.
 */
public class TestDeepCopy {
    public static void main(String[] args) {
        List<Person> nodeListOne = new ArrayList<Person>();
        List<Person> nodeListTwo = null;
        Person personOne = new Person();
        personOne.setName("小豆豆");
        nodeListOne.add(personOne);

        try {
            nodeListTwo = DeepCopy.deepCopy(nodeListOne);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person clone = nodeListTwo.get(0);
        clone.setName("小豆豆2");
        System.out.println("the name of personOne" + personOne.getName());


    }

}
