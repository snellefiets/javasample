public class CopyService {

    public XObject copyOf(XObject source) {
        source.setName("ABC");
        return new XObject(source.getName());
    }


}
