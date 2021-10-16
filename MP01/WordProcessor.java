import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
    private ISpellChecker spellChecker;
    private Map<String, DocConverter> docConverters;
    private String fileName;

    public WordProcessor(String new_doc) {
        this.docConverters = new HashMap<String, DocConverter>();
        this.fileName = new_doc;
    }

    void addDocConverter(DocConverter converter) {
        docConverters.put(converter.getExtension(), converter);
    }
    void convertDocTo(String ext){
        if(docConverters.containsKey(ext)){
            DocConverter t = docConverters.get(ext);
            t.save(fileName);
        }
        else{
            System.out.println(ext + "파일 형식을 지원하는 DocConverter가 없습니다");
        }
    }
    void setSpellChecker(ISpellChecker SpellChecker){
        this.spellChecker = SpellChecker;
    }
    void checkSpelling(){
        spellChecker.check();
    }
}