import java.io.*; 
import java.util.*; 

public class Searching { 
  Scanner scanner = new Scanner(System.in); 
  Vector<String> lineVector = new Vector<String>(); 
  private void readFile(String fileName) { //파일명 또는 파일 경로를 받아와서 해당 파일을 불러오는 함수
    File targetFile = new File(fileName); 
    try { 
      Scanner fScanner = new Scanner(new FileInputStream(targetFile)); 
      while(fScanner.hasNext())  
      lineVector.add(fScanner.nextLine()); 
      fScanner.close(); 
   } 
   catch (FileNotFoundException e) { //파일을 찾지 못한 경우 예외처리
     e.printStackTrace(); 
  } 
} 
  
private void searchWord(String word) { //검색할 단어를 받아온 후 찾는 단어가 문장에 있으면 출력
  String line = ""; 
  for(int i=0 ; i<lineVector.size() ; i++) { 
    line = lineVector.get(i); 
    if( line.indexOf(word) != -1 ) { 
      System.out.println( (i+1) + ": " + line); 
    } 
  } 
}

public void run() { 
  System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다."); 
  System.out.print("대상 파일명 입력>> "); 
  String fileName = scanner.nextLine(); 
  String input = ""; 
  readFile( fileName ); //파일 불러오기 
  while( true ) { 
    System.out.print("검색할 단어나 문장>> "); 
    input = scanner.nextLine(); 
    if( input.equals("그만") ) { 
      break; 
    } 
   searchWord( input ); 
  }//입력된 단어가 그만이면 종료, 그렇지 않으면 단어 검색 반복
  
  scanner.close(); 
  System.out.println("프로그램을 종료합니다."); 
} 

public static void main(String[] args) { 
  new Searching().run(); 
	} 
} 