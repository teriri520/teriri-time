package mapper;

import java.util.List;

import domain.Stu_info;

public interface Mapper {
	List<Stu_info > select();
	void insert(Stu_info stu_info);
	void delete(int id);
	void update(Stu_info stu_info);
	List<Stu_info > selectone(int id);
}
