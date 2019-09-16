package domain;

public class Stu_info {

	private int id;
	private String remark;
	private int stu_id;
	private Stu stu;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Stu_info [id=" + id + ", remark=" + remark + ", stu_id=" + stu_id + ", stu=" + stu + "]";
	}

	

}
