package SerializationAndDeserialization;

public class MyClass {
    @Save private String myString;
    @Save private int myInt;
    private long MyLong;

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public long getMyLong() {
        return MyLong;
    }

    public void setMyLong(long myLong) {
        MyLong = myLong;
    }
    }

