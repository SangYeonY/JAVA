package koreait.day19;

public class WordNoteApp {

	public static void main(String[] args) {

//		EnglishKoreanNote eng_kor = new EnglishKoreanNote();
		WordNote eng_kor = new EnglishKoreanNote();
		
		eng_kor.start();   //start 메소드가 WordNote 참조타입 인터페이스에도 있어야 오류가 안생깁니다.
	
	}

}
