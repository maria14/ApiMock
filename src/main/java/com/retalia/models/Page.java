package com.retalia.models;

import java.util.ArrayList;

public class Page<T> {
	
	private ArrayList<T> items ;
	private int Count;
	private int PageSize;
	private int PageCount;
	private int TotalCount;
	
	public Page(ArrayList<T> items, int count, int pageSize, int pageCount,
			int totalCount) {
		this.items = items;
		Count = count;
		PageSize = pageSize;
		PageCount = pageCount;
		TotalCount = totalCount;
	}

	public ArrayList<T> getItems() {
		return items;
	}

	public void setItems(ArrayList<T> items) {
		this.items = items;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public int getPageSize() {
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}

	public int getPageCount() {
		return PageCount;
	}

	public void setPageCount(int pageCount) {
		PageCount = pageCount;
	}

	public int getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(int totalCount) {
		TotalCount = totalCount;
	}

	

}
