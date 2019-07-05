package ch04_repetition.project;

import java.util.Scanner;

public class Project {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("자바로 구현하는 애플리케이션");
		System.out.println("============================");
		
		String id = "hong";
		String passwd = "1234";
		String chkId = "";
		String chkPasswd = "";
		String name = "홍길동";
		String birth = "20010709";
		String address = "서울특별시 강남구 서초동 우리빌딩 110-1번지 3층";
		
		
		String boardActor = "";
		String boardName = "";
		String boardDate = "";
		String boardContent = "";
		int    boardNum = 0;
		
		
		boolean loginChk = false;
		
		
		
		int receiveNum = 1;
		String receiveName = "고슬링";
		String receiveContent = "반복과 조건을 이용한 쪽지읽기";
		String receiveDate = "2022-11-11 10:10:10";
		
		int sendNum = 1;
		String sendName = "제임스";
		String sendContent = "반복과 조건을 이용한 쪽지읽기";
		String sendDate = "2022-11-11 10:10:10";
		
		
		breakMain :
		while(true) {
			
		
			System.out.println("============================");
			System.out.printf("1. %s%n", loginChk ? "로그아웃" : "로그인");
			System.out.print("2. ");
			if(loginChk) System.out.println("회원정보");
			else System.out.println("회원가입");
			System.out.println("3. 공부 게시판");
			if(loginChk) System.out.println("4. 쪽지");
			System.out.println("0. 종료");
			System.out.println("============================");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 :");
			
			int select = Integer.parseInt(sc.nextLine());
			
			switch (select) {
			case 1:
				if (loginChk) {
					loginChk = false;
					
				} else {
					System.out.print("아이디 : ");
					chkId = sc.nextLine();
					System.out.print("패스워드 : ");
					chkPasswd = sc.nextLine();
					if(chkId.equals(id) && chkPasswd.equals(passwd)) {
						System.out.println("로그인 되었습니다.");
						loginChk = true;
					} else {
						System.out.println("입력 정보를 확인하세요.");
						loginChk = false;
					}
				}
				
				
				
				
				
				break;
			case 2:
				String signUpId = "";
				String signUppassWd = "";
				String signUpName = "";
				String signUpBirth = "";
				String signUpaddress = "";
				
				
				
				if (loginChk) {
					System.out.println("아이디 : " + id);
					System.out.println("패스워드 : " + passwd);
					System.out.println("이름 : " + name);
					System.out.println("생년월일 : " + birth);
					System.out.println("주소 : " + address);
					System.out.println("============================");
					System.out.println("1.수정");
					System.out.println("2.탈퇴");
					System.out.println("0.이전");
					System.out.println("============================");
					
					int chkGuest = Integer.parseInt(sc.nextLine());
					
					switch (chkGuest) {
					case 1:
						
						System.out.println("수정할 주소를 입력하세요 : ");
						
						signUpaddress = sc.nextLine();
						
						if (signUpaddress.trim().equals("")) {
							System.out.println("주소는 필수 입력정보 입니다.");
							break;
						}
						
						address = signUpaddress;
						System.out.println("수정 되었습니다.");
						
						
						break;
						
					case 2:
						 System.out.println("탈퇴시 사이트의 기능 사용이 제한됩니다.");
						 System.out.println("탈퇴하시겠습니까?(Y: 탈퇴) :");
						 String chkLeave = sc.nextLine();
						 if(chkLeave.trim().equals("Y")) {
							id = "";
							passwd = "";
							name = "";
							birth = "";
							address = "";
							loginChk = false;
							System.out.println("탈퇴처리되었습니다.");
							break;
						 } else System.out.println("탈퇴 처리되지 않았습니다.");
						 
						
						break;

					case 0:
	
						break;

						
					default:
						break;
					}
					
					
					
				} else {
				
					System.out.print("아이디 : "); signUpId = sc.nextLine();
					System.out.print("패스워드 : "); signUppassWd = sc.nextLine();
					System.out.print("이름 : "); signUpName = sc.nextLine();
					System.out.print("생년월일 : "); signUpBirth = sc.nextLine();
					System.out.print("주소 : "); signUpaddress = sc.nextLine();
					
					if (signUpId.trim().equals("")) {
						System.out.println("아이디는 필수 입력정보 입니다.");
						break;
					}else if (signUppassWd.trim().equals("")) {
						System.out.println("비밀번호는 필수 입력정보 입니다.");
						break;
					}
					
					else if (signUpName.trim().equals("")) {
						System.out.println("이름은 필수 입력정보 입니다.");
						break;
					} else if (signUpBirth.trim().equals("")) {
						System.out.println("생년월일은 필수 입력정보 입니다.");
						break;
					} else if (signUpaddress.trim().equals("")) {
						System.out.println("주소는 필수 입력정보 입니다.");
						break;
					}
					
					id = signUpId;
					passwd = signUppassWd;
					name = signUpName;
					birth = signUpBirth;
					address = signUpaddress;
					
					System.out.println("회원가입 되었습니다.");

				}
				
				
				break;
			case 3:
				//System.out.printf("전체 %d개");
				System.out.println("===================================");
				System.out.println("번호\t글쓴이\t제목\t작성일");
				
				boardActor = "";
				boardName = "";
				boardDate = "";
				breakBoard :
				while(true) {
					
					
					System.out.println("===================================");
					System.out.println("1. 전체 게시물 조회");
					System.out.println("2. 글번호 조회");
					System.out.println("3. 글등록");
					System.out.println("4. 글수정");
					System.out.println("5. 글삭제");
					System.out.println("0. 이전메뉴");
					
					System.out.println("===================================");
					System.out.println("메뉴 중 처리할 항목을 선택하세요 : ");
					
					int chkBoard = Integer.parseInt(sc.nextLine());
					if (loginChk) {
						
						
						switch (chkBoard) {
						case 1:
							
							if (boardNum == 0) System.out.println("작성된 게시물이 없습니다.");
							else System.out.printf("%d\t%s\t%s\t%s\t%n", boardNum, boardActor, boardName, boardDate);
							break;
						
						case 2:
								System.out.print("조회할 글 번호를 입력하세요. ");
								int boardChkNum1 = Integer.parseInt(sc.nextLine());
								
								if(boardChkNum1 == boardNum) {
									System.out.printf("번호 : %d%n", boardNum);
									
									
									System.out.printf("글쓴이 : %s%n", boardActor);
									System.out.printf("제목 : %s%n", boardName);
									System.out.printf("내용 : %s%n", boardContent);
								} else {
									System.out.println("글 내용이 없습니다.");
								}
								
							
							
							
							
							break;
							
						case 3:
						
							
							System.out.print("제목을 입력하세요 : ");
							boardName = sc.nextLine();
							System.out.print("글쓴이를 입력하세요 : ");
							boardActor = sc.nextLine();
							System.out.print("내용을 입력하세요 : ");
							boardContent = sc.nextLine();
							if(boardNum == 0 )	boardNum++;
						
							
							System.out.println("게시글이 등록되었습니다.");
							
						break;
						case 4:
							System.out.print("수정할 글번호를 입력하세요 : ");
							int boardChkNum = Integer.parseInt(sc.nextLine());
							if(boardChkNum == boardNum) {
								System.out.print("제목을 입력하세요 : ");
								boardName = sc.nextLine();
								System.out.print("글쓴이를 입력하세요 : ");
								boardActor = sc.nextLine();
								System.out.print("내용을 입력하세요 : ");
								boardDate = sc.nextLine();
								
								System.out.println("게시글이 수정되었습니다.");
							
							}
							
							
							
							
							
						break;
						
						
						
						case 5:
							boardActor = "";
							boardName = "";
							boardDate = "";
							if(boardNum == 1) boardNum--; 
						break;
						case 0:
							break breakBoard;

						default:
							break;
						}
						
						
						
					} else {
						
						
						switch (chkBoard) {
						case 2:
						case 3:
						case 4:
						case 5:
							System.out.println("로그인 후 사용 가능합니다.");
							break;
						case 0:
							break breakBoard;

						default:
							break;
						}
						
						
					}
					
					
				}
				
			break;
			
		
				
			case 4:
				
					while(true) {
					
					
						
					System.out.println("1. 받은쪽지함");
					System.out.println("2. 보낸쪽지함");
					System.out.println("3. 쪽지보내기");
					System.out.println("0. 이전");
					
					System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
					
					int msgChk = Integer.parseInt(sc.nextLine());
					
					switch (msgChk) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
	
						break;
					}
					
					//int sendMsg 
					
					
	
					
					
				}
				
				
				//break;
				
			
			
				
				
			
			
			case 0:
	
				break breakMain;
			default:
				
				System.out.printf("잘못된 메뉴번호 입니다.%n다시 선택해 주세요.%n");
				break;
			}
			
			
			
			
		}
		
		
		System.out.println("자바 프로젝트 사이트를 종료합니다.");
		
	}
	

}
