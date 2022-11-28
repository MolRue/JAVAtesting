package CH11.Format;

import java.text.DecimalFormat;

public class DecimalFormatEX {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");		// 포멧을 정한다.(= 표기형식을 정한다)
		System.out.println(df.format(num));		// 포멧을 적용한다.
		
		df = new DecimalFormat("#,###.000");
		System.out.println(df.format(num));
	}

}
