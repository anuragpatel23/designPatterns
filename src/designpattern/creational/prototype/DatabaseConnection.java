package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection implements Cloneable {
    private String hostname;
    private String sid;
    private String username;
    private String password;
    private int port;
    private String dialect;
    private List<String> domains = new ArrayList<String>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public void fetchBigTableResult() throws InterruptedException {
        System.out.println("this table fetch takes more than 10 mins");

        domains.add("anurag.com");
        domains.add("abc.com");
        domains.add("def.com");
        domains.add("ghi.com");

        Thread.sleep(5000);
    }

    public String toString(){
        return this.hostname+" : "+this.port+" : "+this.username+" : "+this.password+" : "+this.domains;
    }

    public Object clone() throws CloneNotSupportedException{
        DatabaseConnection dbCon = new DatabaseConnection();
        dbCon.setUsername(this.getUsername());
        dbCon.setPassword(this.getPassword());
        dbCon.setHostname(this.getHostname());
        dbCon.setPort(this.getPort());
        dbCon.setSid(this.getSid());
        dbCon.setDialect(this.getDialect());
        for(String d: this.getDomains()){
            dbCon.getDomains().add(d);
        }
        return dbCon;
    }
}
