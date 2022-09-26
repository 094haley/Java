package ch11;

/*
 * 날짜 : 2022/09/25
 * 이름 : 이해빈
 * 내용 : 두 문자열 연결하기 P371
 */
public class StringTest2 {
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
	
		javaStr = javaStr.concat(androidStr); // javaStr과 문자열 androidStr을 연결하여 javaStr에 대입
	
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));
	}
}
