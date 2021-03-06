package com.code2018.aop.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.code2018.aop.proxy.AnimalFactory;
import com.code2018.aop.proxy.imp.AnimalInterface;

@RunWith(BlockJUnit4ClassRunner.class)
public class AOPTest {

	@Test
	public void Test1() {
		AnimalInterface dog = AnimalFactory.getAnimal(DogImp.class);
		dog.say();
		System.out.println("我的名字是" + dog.getName());
		dog.setName("二狗子");
		System.out.println("我的名字是" + dog.getName());
	}
}
