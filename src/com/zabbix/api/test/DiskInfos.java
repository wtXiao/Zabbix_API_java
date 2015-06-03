package com.zabbix.api.test;

/**
 * @ClassName: DiskInfos
 * @Description: 文件系统磁盘监控信息
 * @author 李庆雷
 * @date 2014-3-25 下午3:57:14
 * @version V1.0
 */
public class DiskInfos {
	private String diskname;				//盘符
	private String freediskspace;			//空闲大小
	private String freediskspacepercentage;	//空闲百分比
	private String totaldiskspace;			//总大小	
	private String useddiskspace;			//已使用大小
}
