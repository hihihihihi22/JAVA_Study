package test.mypac;

public class PostDto {
	
	private int num;
	private String name;
	private String post_name;
	
	public PostDto() {}
	
	public PostDto(int num, String name, String post_name) {
		this.num = num;
		this.name = name;
		this.post_name = post_name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost_name() {
		return post_name;
	}

	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	
}
