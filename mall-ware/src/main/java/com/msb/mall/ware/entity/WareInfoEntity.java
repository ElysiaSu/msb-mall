package com.msb.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ֿ???Ϣ
 * 
 * @author Elysia
 * @email 3164363927@qq.com
 * @date 2024-06-03 12:45:18
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?ֿ??
	 */
	private String name;
	/**
	 * ?ֿ???ַ
	 */
	private String address;
	/**
	 * ???????
	 */
	private String areacode;

}
