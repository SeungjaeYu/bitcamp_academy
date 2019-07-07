package ch04_repetition.project;

import java.util.Scanner;

public class Project {
	/**
	 *  자바 회원 미니 프로젝트
	 * 
	 * 	로그인에 필요한 초기화 정보
	 * 
	 * 	id : hong
	 *  passwd = 1234
	 *  
	 *  
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("자바로 구현하는 애플리케이션");
		System.out.println("============================");
		
		//로그인 정보
		String id = "hong";
		String passwd = "1234";
		String chkId = "";
		String chkPasswd = "";
		String name = "홍길동";
		String birth = "20010709";
		String address = "서울특별시 강남구 서초동 우리빌딩 110-1번지 3층";
		
		
		//게시판 정보
		String boardActor = "";
		String boardName = "";
		String boardContent = "";
		String boardDate = "2022-01-22";
		int    boardNum = 0;
		
		
		//로그인 체크
		boolean loginChk = false;
		
		
		//받은 쪽지함
		int receiveNum = 1;
		String receiveName = "고슬링";
		String receiveContent = "반복과 조건을 이용한 쪽지읽기";
		String receiveDate = "2022-11-11 10:10:10";
		String receiveStatus = "안읽음";
		
		//보낸 쪽지함
		int sendNum = 1;
		String sendName = "제임스";
		String sendContent = "반복과 조건을 이용한 쪽지읽기";
		String sendDate = "2022-11-11 10:10:10";
		String sendStatus = "안읽음";
		
		//받는 사람 유저 체크
		String receiveNameChk = "";
		String receiveChkContent = "";
		
		breakMain :
		while(true) {
			
		
			System.out.println("============================");
			System.out.printf("1. %s%n", loginChk ? "로그아웃" : "로그인");
			System.out.printf("2. %s%n", loginChk ? "회원정보" : "회원가입");
			System.out.println("3. 공부 게시판");
			if(loginChk) System.out.println("4. 쪽지");
			System.out.println("0. 종료");
			System.out.println("============================");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 :");
			
			int selectMainMenu = Integer.parseInt(sc.nextLine()); // 메인 메뉴 선택
			
			switch (selectMainMenu) {
			case 1:
				if (loginChk) {
					loginChk = false; //로그아웃
					
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
					
					
					if(chkBoard == 1) {
						if (boardNum == 0) System.out.println("작성된 게시물이 없습니다.");
						else System.out.printf("%d\t%s\t%s\t%s\t%n", boardNum, boardActor, boardName, boardDate);
						
					}
					if (loginChk) {
						
						switch (chkBoard) {
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
							
							//제목, 글쓴이, 내용 입력 하지 않아도 일단 등록되게 구현
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
							//제목, 글쓴이, 내용 입력 하지 않아도 일단 수정되게 구현
							System.out.print("수정할 글번호를 입력하세요 : ");
							int boardChkNum = Integer.parseInt(sc.nextLine());
							if(boardChkNum == boardNum) {
								System.out.print("제목을 입력하세요 : ");
								boardName = sc.nextLine();
								System.out.print("글쓴이를 입력하세요 : ");
								boardActor = sc.nextLine();
								System.out.print("내용을 입력하세요 : ");
								boardContent = sc.nextLine();
								System.out.println("게시글이 수정되었습니다.");
							
							}
							
							
							
							
							
						break;
						
						
						
						case 5:
							boardActor = "";
							boardName = "";
							boardContent = "";
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
				if (loginChk) {
					breakMsgMain : 
					while (true) {
					
					
						
						System.out.println("1. 받은쪽지함");
						System.out.println("2. 보낸쪽지함");
						System.out.println("3. 쪽지보내기");
						System.out.println("0. 이전");
					
						System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
					
						int msgChk = Integer.parseInt(sc.nextLine());
						int msgChkNum = 0;
						switch (msgChk) {
						case 1:
							breakReceiveMsg :
							while (true) {
								
								System.out.println("받은 쪽지함");
								System.out.println();
								if (receiveNum == 1) {
									System.out.printf("전체 %d개%n", receiveNum);
									System.out.println("===================================");
									System.out.println("번호 보낸이 받은날짜 읽음");
									System.out.println("===================================");
									System.out.printf("%d %s %s %s%n", receiveNum, receiveName, receiveDate, receiveStatus);
									System.out.println("1. 읽기");
									System.out.println("0. 이전");
									breakMsgDetail :
									while (true) {
										int msgChkVal = Integer.parseInt(sc.nextLine());
										switch (msgChkVal) {
										case 1:
											
												System.out.print("쪽지 번호를 입력하세요 : ");
												msgChkNum = Integer.parseInt(sc.nextLine());
												if(msgChkNum == sendNum) {
													receiveStatus = "읽음";
													System.out.println("===================================");
													System.out.printf("번호 : %d번%n", receiveNum);
													System.out.printf("보낸이 : %s%n", receiveName);
													System.out.printf("내용 : %s%n", receiveContent);
													System.out.printf("받은날짜 : %s%n", receiveDate);
													System.out.printf("읽은상태 : %s%n", receiveStatus);
													System.out.println("===================================");
													System.out.println("===================================");
													System.out.println("1. 삭제");
													System.out.println("0. 이전");
													System.out.println("------------------------------");
													System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
													int msgChkDetail = Integer.parseInt(sc.nextLine());
													switch (msgChkDetail) {
													case 1:
														System.out.println("쪽지가 삭제되었습니다.");
														System.out.println("===================================");
													
														// 쪽지 정보 삭제
														receiveNum = 0;
														receiveName = "";
														receiveDate = "";
														receiveStatus = "";
														receiveContent = "";
														msgChkNum = 0;
														break breakMsgDetail;
													case 0:
														break breakMsgDetail;
													}
												}
												break;
										case 0:
											break breakReceiveMsg;
										}
									}
								} else {
									System.out.println("받은 쪽지가 없습니다.");
									System.out.println("===================================");
									System.out.println("===================================");
									System.out.println("0. 이전");
									int defaultValue = Integer.parseInt(sc.nextLine());
									if (defaultValue == 0) break;
									else defaultValue = Integer.parseInt(sc.nextLine());
									
								}
									
							}
							
							break;
							
						case 2:
							breakSendMsg :
								while (true) {
									
									System.out.println("보낸 쪽지함");
									System.out.println();
									if (sendNum == 1) {
										System.out.printf("전체 %d개%n", sendNum);
										System.out.println("===================================");
										System.out.println("번호 받은이 보낸날짜 읽음");
										System.out.println("===================================");
										System.out.printf("%d %s %s %s%n", sendNum, sendName, sendDate, sendStatus);
										System.out.println("1. 읽기");
										System.out.println("0. 이전");
										breakSendMsgDetail :
										while (true) {
											int msgChkVal = Integer.parseInt(sc.nextLine());
											switch (msgChkVal) {
											case 1:
												
													System.out.print("쪽지 번호를 입력하세요 : ");
													msgChkNum = Integer.parseInt(sc.nextLine());
													if(msgChkNum == sendNum) {
														sendStatus = "읽음";
														System.out.println("===================================");
														System.out.printf("번호 : %d번%n", sendNum);
														System.out.printf("받은이 : %s%n", sendName);
														System.out.printf("내용 : %s%n", sendContent);
														System.out.printf("보낸날짜 : %s%n", sendDate);
														System.out.printf("읽은상태 : %s%n", sendStatus);
														System.out.println("===================================");
														System.out.println("===================================");
														System.out.println("1. 삭제");
														System.out.println("0. 이전");
														System.out.println("------------------------------");
														System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
														int msgChkDetail = Integer.parseInt(sc.nextLine());
														switch (msgChkDetail) {
														case 1:
															System.out.println("쪽지가 삭제되었습니다.");
															System.out.println("===================================");
														
															// 쪽지 정보 삭제
															sendNum = 0;
															sendName = "";
															sendDate = "";
															sendStatus = "";
															sendContent = "";
															msgChkNum = 0;
															break breakSendMsgDetail;
														case 0:
															break breakSendMsgDetail;
														}
													}
													break;
											case 0:
												break breakSendMsg;
											}
										}
									} else {
										System.out.println("보낸 쪽지가 없습니다.");
										System.out.println("===================================");
										System.out.println("===================================");
										System.out.println("0. 이전");
										int defaultValue = Integer.parseInt(sc.nextLine());
										if (defaultValue == 0) break;
										else defaultValue = Integer.parseInt(sc.nextLine());
										
									}
										
								}
							
							
							break;
						case 3:
	
							
						System.out.println("쪽지보내기");
						System.out.println("===================================");
						System.out.print("받는사람 : "); 
						receiveNameChk = sc.nextLine();
						System.out.print("내용 : ");
						receiveChkContent = sc.nextLine();
						System.out.println("===================================");
						if(receiveNameChk.equals(id)) {
								
							receiveNum = 1;
							receiveContent = receiveChkContent;
								
							System.out.println("쪽지를 보냈습니다.");
						} else {
							System.out.println("해당 사용자가 없습니다.");
						}
								
							break;
							
						case 0:
													
							
						break breakMsgMain;
					}
				}
				
				break;
			}
			break;
			case 0:
	
				break breakMain;
			default:
				
				System.out.printf("잘못된 메뉴번호 입니다.%n다시 선택해 주세요.%n");
				break;
			}
		}
		System.out.println("자바 프로젝트 사이트를 종료합니다.");
		sc.close();
		
	}
	

}
