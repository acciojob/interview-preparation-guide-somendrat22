package com.driver;

public class InterviewTopic {
	private Long id;
	private String name;

	public InterviewTopic() {
		// Default constructor
	}

	public InterviewTopic(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "InterviewTopic{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}