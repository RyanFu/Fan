package example.com.fan.bean;

/**
 * Created by lian on 2017/7/3.
 */
public class SearchVideoBean {
    private int collectionCount;

    private String coverPath;

    private String id;

    private String name;

    private int seeCount;

    public void setCollectionCount(int collectionCount){
        this.collectionCount = collectionCount;
    }
    public int getCollectionCount(){
        return this.collectionCount;
    }
    public void setCoverPath(String coverPath){
        this.coverPath = coverPath;
    }
    public String getCoverPath(){
        return this.coverPath;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSeeCount(int seeCount){
        this.seeCount = seeCount;
    }
    public int getSeeCount(){
        return this.seeCount;
    }

}
