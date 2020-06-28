package com.testox.jee.entity;

import java.util.List;

public class Question extends Content {
	private int optionCount;
	private List<Option> optionlist;
	
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public List<Option> getOptionlist() {
		return optionlist;
	}
	public void setOptionlist(List<Option> optionlist) {
		this.optionlist = optionlist;
	}
	
	

}
