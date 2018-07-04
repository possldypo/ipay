package com.vo;

import java.util.Map;

public class Page {

    private Integer count;

    private Integer current;

    private Integer limit;

    public Integer getCount() {
        return count;
    }

    public Object data;

    public Map<String, String> searchKey;

    /**
     * 设置默认分页参数
     * @param page
     */
    public static void setDefault(Page page) {
        setDefault(page,15,1);
    }
    public static void setDefault(Page page, Integer limit, Integer current) {
        if (null == page.getCurrent() || page.getCurrent() <= 0) {
            page.setCurrent(current);
        }
        if (null == page.getLimit() || page.getLimit() <= 0) {
            page.setLimit(limit);
        }
    }

    public Map<String, String> getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(Map<String, String> searchKey) {
        this.searchKey = searchKey;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
