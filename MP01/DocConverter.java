public abstract class DocConverter {
    private String ext; //멤버변수 ext

    public DocConverter(String extension) { //생성자 DocConverter(매개변수 extension)
        ext = extension; //멤버변수랑 연결
    }

    public String getExtension() { //메소드 getExtension(매개변수 없음)
        return ext; //반환값 ext
    }

    public abstract void save(String fileName);
}
