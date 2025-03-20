package data_structure;

import java.util.Arrays; // 생성시 초기값 설정에 사용
// java.util.LinkedList와의 이름 충돌을 피하기 위해 fully-qualified 이름으로 사용합니다.

public class LinkedList {

    // 단일 연결 리스트용 노드 클래스
    class Node {
        Node next; // 다음 노드 주소를 저장하는 필드
        int data;  // 데이터를 저장하는 필드

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 아래는 원래 주석으로 달아놓은 설명입니다.
    // class Node1 {
    //     Node next; // 다음 노드 주소를 저장하는 필드
    //     Node prev; // 이전 노드 주소를 저장하는 필드
    //     int data; // 데이터를 저장하는 필드
    // };
    //
    // 단, 양방향 연결 리스트에서는 노드 타입을 동일하게 사용하기 위해 Node1 타입으로 선언합니다.
    class Node1 {
        Node1 next; // 다음 노드 주소를 저장하는 필드
        Node1 prev; // 이전 노드 주소를 저장하는 필드
        int data;   // 데이터를 저장하는 필드

        Node1(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // =======================
    // Custom LinkedList 구현
    // =======================

    // 단일 연결 리스트의 head 노드
    private Node head;

    // 양방향 연결 리스트의 head, tail 노드.
    private Node1 headD;
    private Node1 tailD;

    // 단일 연결 리스트에 노드 추가 (맨 뒤에 추가)
    public void addSingly(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }

    // 단일 연결 리스트에서 특정 데이터 삭제 (첫 번째로 만난 노드 삭제)
    public boolean removeSingly(int data) {
        if (head == null) return false;
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data == data) {
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 단일 연결 리스트의 모든 데이터를 출력
    public void printSingly() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    // 양방향 연결 리스트에 노드 추가 (맨 뒤에 추가)
    public void addDoubly(int data) {
        Node1 newNode = new Node1(data);
        if (headD == null) {
            headD = newNode;
            tailD = newNode;
        } else {
            tailD.next = newNode;
            newNode.prev = tailD;
            tailD = newNode;
        }
    }

    // 양방향 연결 리스트에서 특정 데이터 삭제 (첫 번째로 만난 노드 삭제)
    public boolean removeDoubly(int data) {
        if (headD == null) return false;
        // head 삭제인 경우
        if (headD.data == data) {
            headD = headD.next;
            if (headD != null) {
                headD.prev = null;
            } else {
                tailD = null; // 리스트가 비게 됨
            }
            return true;
        }
        Node1 cur = headD;
        while (cur != null) {
            if (cur.data == data) {
                if (cur.next != null) {
                    cur.next.prev = cur.prev;
                } else {
                    tailD = cur.prev; // tail인 경우
                }
                if (cur.prev != null) {
                    cur.prev.next = cur.next;
                }
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 양방향 연결 리스트의 모든 데이터를 출력
    public void printDoubly() {
        Node1 cur = headD;
        while (cur != null) {
            System.out.print(cur.data + " <-> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    // =======================
    // 테스트용 main 메서드
    // =======================
    public static void main(String[] args) {

        // LinkedList 컬렉션 
        // 자바의 LinkedList는 ArrayList와 같이 인덱스로 접근하여 조회/삽입이 가능하지만 내부 구조는 완전 다름 
        // ArrayList는 내부적으로 배열을 이용하여 메서드로 이리저리 조작이 가능한 반면 LinkedList는 node끼리에 주소 포인터를 서로 가르키며 참조함으로써 이어지는 구조이다.
        
        // LinkedList 종류 
        // 단방향 연결 리스트: 다음 노드를 가리키기 위한 포인터 필드 next만을 가지고 있는 링크드 리스트를 singly linked list라고 한다.
        // 단점:  LinkedList에 저장된 데이터가 10000개라면 9999 번째 데이터에 접근하려면 Node를 9999번 이동해야 해서 속도, 기능 저하가 일어날 수 있다.
        // 양방향 연결 리스트: 기존의 단일 연결 노드 객체에서 이전 노드 주소를 담고 있는 필드 prev가 추가된 형태를 doubly linked list라고 부른다.
        
        
        // 타입설정 int 타입만 적재 가능
        // java.util.LinkedList 사용 예시 (이름 충돌을 피하기 위해 fully-qualified 이름 사용)
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        // 생성시 초기값 설정
        java.util.LinkedList<Integer> list2 = new java.util.LinkedList<>(Arrays.asList(1, 2));
        
        
        // Custom LinkedList 테스트 (단일/양방향 연결 리스트 구현)
        LinkedList customList = new LinkedList();
        
        // 단일 연결 리스트 테스트
        System.out.println("Singly Linked List:");
        customList.addSingly(10);
        customList.addSingly(20);
        customList.addSingly(30);
        customList.printSingly(); // 출력 예: 10 -> 20 -> 30 -> null
        
        System.out.println("After removing 20:");
        customList.removeSingly(20);
        customList.printSingly(); // 출력 예: 10 -> 30 -> null

        // 양방향 연결 리스트 테스트
        System.out.println("\nDoubly Linked List:");
        customList.addDoubly(100);
        customList.addDoubly(200);
        customList.addDoubly(300);
        customList.printDoubly(); // 출력 예: 100 <-> 200 <-> 300 <-> null
        
        System.out.println("After removing 200:");
        customList.removeDoubly(200);
        customList.printDoubly(); // 출력 예: 100 <-> 300 <-> null

        // java.util.LinkedList 사용 예시 출력
        System.out.println("\njava.util.LinkedList:");
        System.out.println(list2);
    }
}
