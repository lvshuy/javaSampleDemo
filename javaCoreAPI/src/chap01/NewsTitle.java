package chap01;

public class NewsTitle {
    int num;
    String titleName;
    String userName;

    public NewsTitle(int num, String titleName, String userName) {
        this.num = num;
        this.titleName = titleName;
        this.userName = userName;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
