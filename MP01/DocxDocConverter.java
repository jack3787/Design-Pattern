public class DocxDocConverter extends DocConverter {
    DocxDocConverter(){
        super("docx");
    }
    public void save(String fileName){
        System.out.println(fileName +"."+ getExtension() + "로 변환해서 저장합니다");
    }
}
