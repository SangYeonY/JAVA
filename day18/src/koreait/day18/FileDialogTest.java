package koreait.day18;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogTest {

	public static void main(String[] args) {
// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다.
// Windows OS는 프로그램들이 window라는 틀 안에서 만들어지는 자바에서는 그것은 프레임이라고 합니다.
		
		JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
		
		FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
		fdr.setVisible(true);		//파일 대화상자 보이기
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일 : " + filename);
		System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());
		
		
		FileDialog fdw = new FileDialog(f, "파일 저장",FileDialog.SAVE);
		fdw.setVisible(true);
		System.out.println("저장한 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
		
	}

}
