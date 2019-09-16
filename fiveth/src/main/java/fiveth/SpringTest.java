package fiveth;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Stu_info;
import mapper.Mapper;

public class SpringTest {
	private ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void select() {
		Mapper mapper = (Mapper) this.context.getBean(Mapper.class);
		List<Stu_info> list = mapper.select();
		for (Stu_info stu_info : list) {
			System.out.println(stu_info);
		}
	}
	@Test
	public void insert() {
		Mapper mapper = (Mapper) this.context.getBean(Mapper.class);
		Stu_info stu = new Stu_info();
		stu.setId(4);
		stu.setRemark("hanser");
		stu.setStu_id(4);
		mapper.insert(stu);
		System.out.println("已插入");
	}
	@Test
	public void delete() {
		Mapper mapper = (Mapper) this.context.getBean(Mapper.class);	
		mapper.delete(4);
		System.out.println("已删除");
	}
	@Test
	public void update() {
		Mapper mapper = (Mapper) this.context.getBean(Mapper.class);
		Stu_info stu = new Stu_info();
		stu.setRemark("狗狗");
		stu.setStu_id(5);
		stu.setId(3);
		mapper.update(stu);
		System.out.println("已更新");
	}
	@Test
	public void selectone() {
		Mapper mapper = (Mapper) this.context.getBean(Mapper.class);
		List<Stu_info> list = mapper.selectone(3);
		for (Stu_info stu_info : list) {
			System.out.println(stu_info);
		}
	}

}
