package com.bramantio.ubay.webapp.project;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyViewModel {

	private int count,first,second,res;

	@Init
	public void init() {
		count = 2;
		first = 1;
		second = 1;
		res = 0;
	}

	@Command
	@NotifyChange("count")
	public void cmd() {
		count *= count;
	}

	@Command
    @NotifyChange("res")
    public void result() {
        res = first + second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getRes() {
        return res;
    }

    public int getCount() {
		return count;
	}
}
