package models;


/**
 * Created by Finn on 16/01/2018.
 */
public class Dog {

    private int id;
    private String nickName;
    private String akcName;
    private String akcRegNum;
    private String kcName;
    private String kcRegNum;
    private int dob;
    private char sex;
    private String colour;
    private double height;
    private double weight;
    private String tail;
    private String bvaHips;
    private String bvaElbows;
    private String bvaEyes;
    private String ceaCh;
    private String gpra;
    private String hsf4;
    private String cmr1;
    private String mdr1;
    private String igs;
    private String dm;
    private String owner;
    private Breeder breeder;


    public Dog() {};

    public Dog(String nickName,
               String akcName,
               String akcRegNum,
               String kcName,
               String kcRegNum,
               int dob,
               char sex,
               String colour,
               double height,
               double weight,
               String tail,
               String bvaHips,
               String bvaElbows,
               String bvaEyes,
               String ceaCh,
               String gpra,
               String hsf4,
               String cmr1,
               String mdr1,
               String igs,
               String dm,
               String owner,
               Breeder breeder
    ) {
        this.nickName = nickName;
        this.akcName = akcName;
        this.akcRegNum = akcRegNum;
        this.kcName = kcName;
        this.kcRegNum = kcRegNum;
        this.dob = dob;
        this.sex = sex;
        this.colour = colour;
        this.height = height;
        this.weight = weight;
        this.tail = tail;
        this.bvaHips = bvaHips;
        this.bvaElbows = bvaElbows;
        this.bvaEyes = bvaEyes;
        this.ceaCh = ceaCh;
        this.gpra = gpra;
        this.hsf4 = hsf4;
        this.cmr1 = cmr1;
        this.mdr1 = mdr1;
        this.igs = igs;
        this.dm = dm;
        this.owner = owner;
        this.breeder = breeder;
    }

//GETTERS and SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAkcName() {
        return akcName;
    }

    public void setAkcName(String akcName) {
        this.akcName = akcName;
    }

    public String getAkcRegNum() {
        return akcRegNum;
    }

    public void setAkcRegNum(String akcRegNum) {
        this.akcRegNum = akcRegNum;
    }

    public String getKcName() {
        return kcName;
    }

    public void setKcName(String kcName) {
        this.kcName = kcName;
    }

    public String getKcRegNum() {
        return kcRegNum;
    }

    public void setKcRegNum(String kcRegNum) {
        this.kcRegNum = kcRegNum;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getBvaHips() {
        return bvaHips;
    }

    public void setBvaHips(String bvaHips) {
        this.bvaHips = bvaHips;
    }

    public String getBvaElbows() {
        return bvaElbows;
    }

    public void setBvaElbows(String bvaElbows) {
        this.bvaElbows = bvaElbows;
    }

    public String getBvaEyes() {
        return bvaEyes;
    }

    public void setBvaEyes(String bvaEyes) {
        this.bvaEyes = bvaEyes;
    }

    public String getCeaCh() {
        return ceaCh;
    }

    public void setCeaCh(String ceaCh) {
        this.ceaCh = ceaCh;
    }

    public String getGpra() {
        return gpra;
    }

    public void setGpra(String gpra) {
        this.gpra = gpra;
    }

    public String getHsf4() {
        return hsf4;
    }

    public void setHsf4(String hsf4) {
        this.hsf4 = hsf4;
    }

    public String getCmr1() {
        return cmr1;
    }

    public void setCmr1(String cmr1) {
        this.cmr1 = cmr1;
    }

    public String getMdr1() {
        return mdr1;
    }

    public void setMdr1(String mdr1) {
        this.mdr1 = mdr1;
    }

    public String getIgs() {
        return igs;
    }

    public void setIgs(String igs) {
        this.igs = igs;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Breeder getBreeder() {
        return breeder;
    }

    public void setBreeder(Breeder breeder) {
        this.breeder = breeder;
    }
}
