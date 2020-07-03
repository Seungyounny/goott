package exam_basic2;

/*
 * 10. 한 배열에 임의의 숫자를 대입한 후 임의의 숫자만큼 *을 출력하시오
ex)
*
****
****
***
*
****
****
**
*
***
**
*
 */
public class HwNo10 {

	public static void main(String[] args) {

		int arr[] = { 8, 1, 5, 4, 6, 7, 5, 2, 9, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
