package com.example.miniprojetlogin;

public class data {
    String title;
    String data_fin;
    String data_deub;
    String option ;
    private boolean check;
    public data(String title, String data_deub, String data_fin, String option ,Boolean check) {
        this.title = title;
        this.data_deub = data_deub;
        this.data_fin = data_fin;
        this.option= option;
        this.check = check;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData_fin() {
        return data_fin;
    }

    public void setData_fin(String data_fin) {
        this.data_fin = data_fin;
    }

    public String getData_deub() {
        return data_deub;
    }

    public void setData_deub(String data_deub) {
        this.data_deub = data_deub;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
