package com.msb.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ???湤?
 * 
 * @author Elysia
 * @email 3164363927@qq.com
 * @date 2024-06-03 12:45:18
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * ?ջ
	 */
	private String consignee;
	/**
	 * ?ջ??˵绰
	 */
	private String consigneeTel;
	/**
	 * ???͵?ַ
	 */
	private String deliveryAddress;
	/**
	 * ??????ע
	 */
	private String orderComment;
	/**
	 * ???ʽ?? 1:???߸??? 2:???????
	 */
	private Integer paymentWay;
	/**
	 * ????״̬
	 */
	private Integer taskStatus;
	/**
	 * ???????
	 */
	private String orderBody;
	/**
	 * ???????
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ?ֿ?id
	 */
	private Long wareId;
	/**
	 * ????????ע
	 */
	private String taskComment;

}
