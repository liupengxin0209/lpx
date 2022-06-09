package cn.bdqn.pojo;

import java.util.List;

public class PageBean<User> {

    //总页数
    private int totalPageCount =0;
    //页大小
    private int pageSize;
    //总数
    private int totalCount;
    //当前页
    private int currPageNo;
    //每页集合
    private List<User> lists;


    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
    }

    public List<User> getLists() {
        return lists;
    }

    public void setLists(List<User> lists) {
        this.lists = lists;
    }
}
