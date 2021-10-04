// 두 배열 합치기
// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

// 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
// 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
// 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
// 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
// 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

public codingtest {
	public static void main(String[] args) {
	    ArrayList<Integer> answer = new ArrayList<>(); // 길이 정해지지 않은 배열
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        int p1 = 0, p2 = 0; // pointer 지정, 초기화
        while (p1<a && p2<b){ // 둘 중 하나라도 거짓이면 거짓
            if(arr[p1]<arr2[p2]) answer.add(arr[p1++]); // 작은 값부터 answer에 추가
            else answer.add(arr2[p2]); 
        while(p1<a) answer.add(arr[p1++]); // p2가 범위 벗어남
        while(p2<b) answer.add(arr2[p2++]); // p1이 범위 벗어남
        System.out.println(answer);
}

// remember
// 1. 길이가 정해지지 않은 배열 생성은 arraylist
// 2. 배열 비교할 경우 포인터 선언하여 포인터 이용