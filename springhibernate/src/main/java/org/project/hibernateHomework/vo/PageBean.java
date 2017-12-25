package org.project.hibernateHomework.vo;

import java.util.List;

public class PageBean {
	private int page;//当前页码
	private int size;//每页显示多少条
	private int beginIndex;//从第几条开始查
	private int totalSize;
	private int totalPage;
	private List dataList;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBeginIndex() {
		beginIndex=(page-1)*size;
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
		totalPage = (totalSize%size ==0) ? (totalSize/size):(totalSize/size+1);
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List getDataList() {
		return dataList;
	}
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return "PageBean [page=" + page + ", size=" + size + ", beginIndex=" + beginIndex + ", totalSize=" + totalSize
				+ ", totalPage=" + totalPage + ", dataList=" + dataList + "]";
	}
	
	

}
