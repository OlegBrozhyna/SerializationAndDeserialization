package SerializationAndDeserialization;


    public class RunSerialization {
    public static final String FILE_NAME = "D:\\MyFile.txt";

    public static void main(String[] args) {
        MyClass serialization1 = new MyClass();
        serialization1.setMyString("test text");
        serialization1.setMyInt(1234567980);
        serialization1.setMyLong(6543210L);

        Serializer.serialize(serialization1, FILE_NAME);
        MyClass serialization2 = (MyClass) Serializer.deSerialize(MyClass.class, FILE_NAME);

        assert serialization2 != null;
        System.out.println(serialization2.getMyString());
        System.out.println(serialization2.getMyInt());
        System.out.println(serialization2.getMyLong());
    }
}
