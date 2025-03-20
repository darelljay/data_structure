package data_structure;
import java.util.ArrayList;
public class array {

	public static void main(String[] args) {
		// 배열이란: 동일한 데이터 타입의 요소들을 연속된 메모리 공간에 저장하는 방법이다
		// 특징: 인텍스를 통해 각 요소에 접근 가능 
		// 장점: 
		//		빠른 접근이 가능함
		// 	    메모리 공간을 효율적으로 사용할수 있다 
		// 		다차원 데이터를 표현할수 있다 
		// 단점: 
		// 		크기를 동적으로 조정할 수 없다. 
		// 		삽익과 삭제가 어렵다 
	
		// 배열 선언과 초기화 
		// 배열을 선언하기 위해서는 배열의 타입과 크기를 지정해야 한다 
		int [] numbers = new int[5];
		
		// 배열에 값 할당 
		// 배열의 값을 대입하려면 인덱스를 사용해 특정 위치애 값을 대입한다.
		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 10;
		numbers[3] = 10;
		numbers[4] = 10;
		
		// 배열의 값 참조 
		System.out.println(numbers[2]);
		
		// 배열의 길이 확인 
		// 배열의 길이는 length 속성을 사용하여 알 수 있다. 
		System.out.println(numbers.length);
		
		// 배열 반복문 
		// 배열의 모든 요소에 접근하기 위해 반복문을 사용할 수 있다.
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// ArrayList란? 	
		// 배열의 정적인 크기떄문에 동적으로 변동해야할떄 사용하는거 
		//ArrayList의 특징과 동작 방식 
		// 1. 동적 크기 조정: ArrayList는 내부적으로 배열을 요소를 사용하며, 요소를 추가하거나 삭제할 떄 필요에 따라 동적으로 크기를 조정할수있다 
		// 2. 제네릭을 사용하여 요소의 타입을 지정할 수 있습니다
		
		// ArrayList 사용법 
		// Integer 타입 요소를 저장하는 ArrayList 생성 
		ArrayList<Integer> numbers2  = new ArrayList<>();
		
		// 요소 추가 
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(10);
		numbers2.add(10);

		// 요소 접근 
		System.out.println(numbers2.get(0));
		System.out.println(numbers2.get(1));
		System.out.println(numbers2.get(2));
		
		// 요소 수정 
		numbers2.set(1, 50);
		
		// 요소 삭제 
		numbers2.remove(2);
		
		// 리스트 크기 출력 
		System.out.println(numbers2.size());
		
		// 리스트 순회 
		for(int i=0; i<numbers2.size(); i++) {
			System.out.println(numbers2.get(i));
		}
	}
}
