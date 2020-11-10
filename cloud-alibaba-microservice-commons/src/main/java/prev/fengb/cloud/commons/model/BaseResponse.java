package prev.fengb.cloud.commons.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 基础响应类
 *
 * @author fengb
 * @date 2020年11月10日 上午10:42:34
 */
@Data
public class BaseResponse implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1L;

	/** 响应码 */
	private Integer code;
	/** 响应信息 */
	private String message;
	/** 响应数据 */
	private Object data;

	public BaseResponse() {
		super();
	}

	public BaseResponse(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public BaseResponse(Integer code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

}
