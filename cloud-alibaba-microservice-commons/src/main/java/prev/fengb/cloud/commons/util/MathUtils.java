package prev.fengb.cloud.commons.util;

import java.math.BigDecimal;

/**
 * 数学工具类
 *
 * @author fengb
 * @date 2020年11月10日 下午2:13:10
 */
public class MathUtils {

	/**
	 * 比较两个Double类型的数字
	 * 
	 * @param d1
	 * @param d2
	 * @return -1表示小于；0表示等于；1表示大于
	 */
	public static int compareDouble(Double d1, Double d2) {
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.compareTo(b2);
	}

	/**
	 * 两个double类型数字相加
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static Double addDouble(Double d1, Double d2) {
		BigDecimal b1 = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		return b1.add(b2).doubleValue();
	}
}
